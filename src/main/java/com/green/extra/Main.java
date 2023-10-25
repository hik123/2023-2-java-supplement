package com.green.extra; //패키지

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {  //public은 파일명이랑 똑같은 클래스만 붙일수있음
    public static void main(String[] args) {
        System.out.println(args.length);
        for (int i=0; i<args.length; i++){
            System.out.printf("args[%d]: %s\n", i, args[i]);
        }
        for (String s: args) {
            System.out.println(s);

        }
    }
}
class Util {
}