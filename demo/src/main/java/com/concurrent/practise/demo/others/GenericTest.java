package com.concurrent.practise.demo.others;

import java.util.ArrayList;

public class GenericTest {

    public static void test1(){
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Class c1 = list1.getClass();
        Class c2 = list2.getClass();
        ClassLoader loader1 = c1.getClassLoader().getParent();
        ClassLoader loader2 =c2.getClassLoader().getParent();
        System.out.println(c1 == c2);
        System.out.println(c1 .equals(c2) );
        System.out.println("类加载器============c1:"+c1+"===c2:"+c2);

    }

    public static void main(String[] args){
//        test1();

        test2();

    }


    public static void test2(){
      Student<String> student1 = new Student<String>();
      Student<Integer> student2 = new Student<Integer>();
      ClassLoader loader1 = student1.getClass().getClassLoader();
      ClassLoader loader2 = student2.getClass().getClassLoader();
      System.out.println("类加载器============student1:"+loader1+"===student2:"+loader2);
    }


    static class Student<V>{
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

//        public void getGeneric(){
//           System.out.println("====V:"+V);
//        }


    }




}
