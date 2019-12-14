package com.concurrent.practise.demo.classLoad;

public class Father {


    public static String staticField = printStaticField();

    public String field = printField();

    static {
        System.out.println("【父类-静态代码块】");
    }

    {
        System.out.println("【父类-非静态代码块】");
    }

    public static String printStaticField() {
        System.out.println("【父类-静态变量】");
        return "父类-静态变量";
    }

    public String printField() {
        System.out.println("【父类-非静态变量】");
        return "父类-非静态变量";
    }

    public Father() {
        System.out.println("【父类-构造方法代码块】");
        show();
    }

    public void show() {
        System.out.println("【父类-普通方法】");
    }




}
