package com.concurrent.practise.demo.classLoad;

public class LoadTest {

    private static int a = 5;

    private static String template = "=====a:%d=====";

    static {
        a*=2;
        System.out.println(String.format(template,a));
        System.out.println("======父类静态代码块执行了=====");
    }

    private void staticMethod(){
        a*=2;
        System.out.println(String.format(template,a));
        System.out.println("======父类静态方法执行了=====");
    }

    public LoadTest(){
        a*=2;
        System.out.println(String.format(template,a));
        System.out.println("=====父类构造方法执行了=====");
    }


    static class LoadTestChild extends LoadTest{

        static {
            System.out.println("======子类静态代码块执行了=====");
        }

        private void staticMethod(){
            System.out.println("======子类静态方法执行了=====");
        }

        public LoadTestChild(){

            System.out.println("=====子类构造方法执行了=====");
        }

    }


}
