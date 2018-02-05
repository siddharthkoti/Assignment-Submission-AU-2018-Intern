package com.au.thread;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerConsumerExecutor {
	
	
	private static final Logger logger = Logger.getLogger(ProducerConsumerExecutor.class.getName());
	
	ExecutorServiceThreadPool executorServiceThreadPool;
    static ArrayList<Integer> conData = new ArrayList<>(); 
    
    public static void main(String[] args) {
        ProducerConsumerExecutor prodconsumer = new ProducerConsumerExecutor();
        prodconsumer.init();
                Iterator<Integer> itr = conData.iterator(); 
                    while(itr.hasNext()) {
                        Object element = itr.next(); 
                        logger.log(Level.INFO,"{0} ", element);    
                    } 
    }
    private void init() {
        executorServiceThreadPool = new ExecutorServiceThreadPool();
        for(int i = 1; i <= 50; i++){
            executorServiceThreadPool.addThread(new Producer(i));   
            executorServiceThreadPool.addThread(new Consumer(i));
        }
                executorServiceThreadPool.finish();
    }
    private class Producer implements Runnable {
            int data;
            public Producer(int datatoput) {
               data = datatoput;
             }
        @Override
        public void run() {         
            logger.log(Level.INFO,"Produced : {0}", data);
            try {
                ExecutorServiceThreadPool.queue.put(data);
                    Thread.sleep(500);
            } catch (InterruptedException e) {
            	
            	Thread.currentThread().interrupt();
            }
        }
    }
    private class Consumer implements Runnable {
                int datatake;
                int data; 
                public Consumer(int datatoput) {
                    data = datatoput;
                  }
        @Override
        public void run() {                                 
                try 
                {
                	logger.log(Level.INFO,"Consumed : {0}", data);
                    datatake = ExecutorServiceThreadPool.queue.take();
                    conData.add(datatake);
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                	Thread.currentThread().interrupt();
                }
        }
    }
}