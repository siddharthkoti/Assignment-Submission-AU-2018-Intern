package com.au.thread;
public class ProducerConsumer
{
    public static void main(String[] args) throws InterruptedException
    {
        final ProducerConsumerUtil roCons = new ProducerConsumerUtil();
        Thread t1 = new Thread(() ->
        {   
            
                try
                {
                	roCons.produce();
                }
                catch(InterruptedException e)
                {
                   
                    Thread.currentThread().interrupt();
                }
            
        });
        Thread t2 = new Thread( () ->
            {
                try
                {
                	roCons.consume();
                }
                catch(InterruptedException e)
                {
                   
                    Thread.currentThread().interrupt();
                }
            
            });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
 
 
}