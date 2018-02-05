package com.au.thread;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerConsumerUtil{
	
	private static final Logger logger = Logger.getLogger(ProducerConsumerUtil.class.getName());
    LinkedList<Integer> l1 = new LinkedList<>();
	int size = 5;
	int infiniteLoop = 0;
	int infiniteLoop2 = 0;
    public void produce() throws InterruptedException
    {
        int value = 1;
        
        while (infiniteLoop == 0){
            synchronized (this)
            {
                while (l1.size() == size)
                    wait();
                logger.log(Level.INFO, "Produced : {0}", value);
                l1.add(value++);
                notifyAll();
                this.wait(500);
            }
        }
    }

    public void consume() throws InterruptedException
    {	
    	
        while (infiniteLoop2 == 0)
        {
            synchronized (this)
            {
                while (l1.isEmpty())
                    wait();
                int val = l1.removeFirst();
                logger.log(Level.INFO, "Consumed : {0}", val);
                notifyAll();
                this.wait(500);
            }
        }
    }
}