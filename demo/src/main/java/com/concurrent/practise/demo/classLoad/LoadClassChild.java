package com.concurrent.practise.demo.classLoad;

public class LoadClassChild extends LoadTest {

    private static String template = "=====b:%d=====";



    private static int b = 10;



    private void staticMethod(){
        b*=2;
        System.out.println(String.format(template,b));
        System.out.println("======子类静态方法执行了=====");
    }

    public LoadClassChild(){
        b*=2;
        System.out.println(String.format(template,b));
        System.out.println("=====子类构造方法执行了=====");
    }

    static {
        b*=2;
        System.out.println(String.format(template,b));
        System.out.println("======子类静态代码块执行了=====");
    }

}
