package com.green.extra;

public class Variable2 {
    public static void main(String[] args) {
        int x = 10, y = 50;
        int temp = x; //temp=10
        x = y;  // x=50
        y = temp; // y=10
        System.out.printf("x: %d, y: %d\n", x, y);
    }
}
