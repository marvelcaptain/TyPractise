package com.concurrent.practise.demo.classLoad;

public class Son extends Father {


    public static String staticField = printStaticField();

    public String field = printField();

    static {
        System.out.println("【子类-静态代码块】");
    }

    {
        System.out.println("【子类-非静态代码块】");
    }

    public static String printStaticField() {
        System.out.println("【子类-静态变量】");
        return "子类-静态变量";
    }

    public String printField() {
        System.out.println("【子类-非静态变量】");
        return "子类-非静态变量";
    }

    public Son() {
        System.out.println("【子类-构造方法代码块】");
        show();
    }

    public void show() {
        System.out.println("【子类-普通方法】");
    }


    public static void main(String[] args) {
        new Son();
    }
}
