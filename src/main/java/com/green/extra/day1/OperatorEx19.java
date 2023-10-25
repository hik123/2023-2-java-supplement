package com.green.extra.day1;

public class OperatorEx19 {
    public static void main(String[] args) {
        int x = 10, y =8;

        System.out.printf("x / y = %d, 나머지값: %d\n", x/y, x%y);

        int val = (int)(Math.random() * 10) + 1; // 1~10 사이의 랜덤한값 나오게
        //val: 2 > 짝수입니다.
        //val: 3 > 홀수입니다.
        if (val % 3 == 0) {
            System.out.printf("val : %d > 홀수입니다.", val);
        } else if (val % 2 == 0) {
            System.out.printf("val : %d > 짝수입니다.", val);
        }
    }
}
