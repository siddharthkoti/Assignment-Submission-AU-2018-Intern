package com.au.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExecutorServiceThreadPool {
	
	private static final Logger logger = Logger.getLogger(ExecutorServiceThreadPool.class.getName());
	
  static final BlockingQueue<Integer> queue =null; 
    ExecutorService executor = Executors.newFixedThreadPool(2); 
      public void addThread(Runnable r){  
      executor.submit(r);
      }
      public void finish(){
              try {
          executor.shutdown();
          executor.awaitTermination(50, TimeUnit.SECONDS);
      } catch (InterruptedException e) {
          logger.log(Level.SEVERE, null, e);
          Thread.currentThread().interrupt();
      }      
             
			logger.log(Level.INFO,"Done");
  }
}