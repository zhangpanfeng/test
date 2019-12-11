package com.darren.test.thread.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ArrayBlockingQueueTest {

    public static void main(String[] args) {
        ExecutorService service = new ThreadPoolExecutor(2, 4, 30, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(2), new ThreadPoolExecutor.CallerRunsPolicy());
    
        for(int i = 1; i < 8; i++){
            int index = i;
            service.execute(new Runnable() {
                
                @Override
                public void run() {
                    System.out.println("Runnable" +  index  + Thread.currentThread().getName());
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        
        service.shutdown();

    }

}
