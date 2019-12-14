package com.concurrent.practise.demo.string;

public class Test {

//不可变的String
    public static String appendStr(String s){
        s+="bbb";
        return s;
    }
    //可变的StringBuilder
    public static StringBuilder appendSb(StringBuilder sb){
        return sb.append("bbb");
    }
    public static void main(String[] args){
    //String做参数
        String s=new String("aaa");
        String ns=Test.appendStr(s);
        System.out.println("String aaa >>> "+s.toString());
    //StringBuilder做参数
        StringBuilder sb=new StringBuilder("aaa");
        StringBuilder nsb=Test.appendSb(sb);
        System.out.println("StringBuilder aaa >>> "+sb.toString());


        String s1= new String("123");
        s1+="456";
        System.out.println(s1);
    }
}
