package com.green.extra.day1;

public class Casting {
    public static void main(String[] args) {
        int n1 = 10, n2 = 3;
        // n1 / n2 >>> 3.333
        float l1 = 10000L;
        float f2 = l1; // 계산식으로 저장되서 자동형변환 됨

        float n3 = (float)n1 / n2; //float타입 4byte //int타입4byte// long 8byte
        System.out.printf("%.3f\n", n3);


    }
}
