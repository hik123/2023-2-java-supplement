package com.green.extra.day2;

import java.util.Arrays;

public class Utils {

    public static int abs (int num) {
        return num <0 ? -num : num;
        //대입연산자를 사용한게 아니라 매개변수의 값은 변경된게아님
    }
    public static int sumArr (int[] arr) {
        int sum = 0;
        /*for (int a : arr) {
            sum += a;
            return sum;

        }*/  // ㄴ향상된for문

        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int[] mapPlus(int[] intArr, int val) {
        int[] tmp = new int[intArr.length];
        for (int i=0; i<tmp.length; i++) {
            tmp[i] = intArr[i] + val;
        }
        return tmp;
    }
}
class UtilsTest {
    public static void main(String[] args) {
        int r = Utils.abs(-10);
        System.out.println("r : " + r); //10
        System.out.println("r2 : " + Utils.abs(-8)); //9
        System.out.println("r2 : " + Utils.abs(5)); //8

        int[] intArr = { 10, 12, 13, 14, 5, 6 };
        int sum = Utils.sumArr(intArr);//클래스명.메소드 static // 배열의 모든 값 더해서 리턴해주는 메소드 호출하기!
        System.out.printf("sum : %d\n", sum);

        int[] rArr = Utils.mapPlus(intArr, 5);
        System.out.println(Arrays.toString(intArr)); //intArr그대로 찍히게
        System.out.println(Arrays.toString(rArr));// intArr 각 배열에 +5씩하기
    }
}
