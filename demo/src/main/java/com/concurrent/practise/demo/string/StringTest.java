package com.concurrent.practise.demo.string;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StringTest {

//    private static java.lang.String  s= "a";
    private static StringBuffer  s= new StringBuffer("a");
//    private static StringBuilder s= new StringBuilder("a");

    private Integer i = new Integer(1);
    public static void main (String[] args){
        s1.append("123");
        s1.append("111" );
        System.out.println(args.length);
        test();

    }

    private static StringBuffer  s1= new StringBuffer("a");



    public static void test(){

        s.toString();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i =0;i<20;i++ ) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    s.append("a");
                }
            });
        }

        System.out.println(s+"字符串长度:"+s.length());

    }

    private void test1(){


        StringTest stringTest = new StringTest();
        stringTest.s.append("123");
        stringTest.test();

        s.append("123");

        i.intValue();

        test();

//        StringTest stringTest = new StringTest();
//        stringTest.test1();

    }




}
