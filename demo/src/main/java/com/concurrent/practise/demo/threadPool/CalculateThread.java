package com.concurrent.practise.demo.threadPool;

import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @author tianyuan
 * @descripton 计算线程类
 * @date 2019-12-08
 */
public class CalculateThread implements Runnable{

    private List<Integer> list;

    private CountDownLatch latch;

    private int sum =0;

    public CalculateThread(List list, CountDownLatch latch,int sum) {
        this.list =list;
        this.latch = latch;
        this.sum = sum;
    }

    @Override
    public void run() {
     try{
//         int sum = 0;
         for (Integer i:list ) {
             sum+=i;
         }
     }catch (Exception e){
         e.printStackTrace();
     }finally {
         latch.countDown();
         System.out.println(Thread.currentThread().getName()+"计算得到的总和为:"+sum);
     }
    }
}
