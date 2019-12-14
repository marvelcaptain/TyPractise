package com.concurrent.practise.demo.threadPool;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author tianyuan
 * @description 线程池测试类
 * @date 2019-12-8
 */
public class ThreadPoolTest {



    private static final List list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30);

    private static volatile int sum ;

    public static void main (String[] args) throws Exception{
        int processors = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(processors+1);
        int size = 3;
        int lehgth = list.size();
        int count = list.size()%size == 0? list.size()/size : list.size()/size+1;
        CountDownLatch latch = new CountDownLatch(count);
        for (int i =0 ;i<count;i++ ) {
            List subList = ThreadPoolTest.list.subList(i * size, i != count - 1 ? (i + 1) * size : ThreadPoolTest.list.size());
            CalculateThread calculateThread = new CalculateThread(subList,latch,sum);
            executorService.submit(calculateThread);
        }

        latch.await();
        System.out.println("计算完成");

    }

}
