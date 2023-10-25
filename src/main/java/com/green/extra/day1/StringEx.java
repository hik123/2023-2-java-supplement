package com.green.extra.day1;

public class StringEx {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = new String("Hello");

        //s1과 s2 같은 값을 갖고 있는지 비교 > true
        //s2와 s3가 다른 값을 갖고 있는지 비교 > false
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));
        System.out.println(s2.equals(s3));
    }
}
