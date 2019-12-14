package com.concurrent.practise.demo.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorsTest {


    private static final Logger logger  = LoggerFactory.getLogger(ExecutorsTest.class);
    private static AtomicInteger integer = new AtomicInteger(0);
    private static int i = 0;

    public static void main(String[] args){
        long startTime = System.currentTimeMillis();

        ExecutorService executorService = Executors.newFixedThreadPool(100);
        for (int a =0;a<1000;a++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    integer.getAndAdd(2);
                }
            });
        }
        executorService.shutdown();
        long endTime = System.currentTimeMillis();
        logger.info("运行结束后的值:{}",integer);
        logger.info("耗时:{}"+"毫秒",endTime-startTime);

        System.out.println("运行结束后的值:{}"+integer);


    }




//    public static void testExecutors(){
//
//
//        ExecutorService executorService = Executors.newFixedThreadPool(100);
//        for (int i =0;i<1000;i++) {
//            executorService.submit(new Runnable() {
//                @Override
//                public void run() {
//                    i++;
//                }
//            });
//        }
//
//
//    }
}
