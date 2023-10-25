package com.green.extra;

public class Variable {
    public static void main(String[] args) {
        boolean b;
        //char b; //선점된 이름 선언x
        char c;
        b = false; //초기화 :맨처음 값을넣는것
        b = true; //대입했다 값을 넣었다.

        byte i0;
        short i1;
        int i2 =10; //쓰기write, i22 =10; //선언과 동시에 초기화, 타입만 같다면 여러개 선언 가능
        long i3;

        System.out.println(333);
        System.out.println("i2 : " + i2);// 읽기read
        i2 = 20;
        System.out.println("i2 : " + i2); // 그 시점에 갖고 있는 값을 출력
        System.out.println("i2 : " + (i2 + 30));
        System.out.println("i2 : 20" + "30" );  //자동 형변환 //타입이 안맞으면 연산이 안되니 맞출려고 형변환됨 컴파일러가 자동으로 형변환
        System.out.println("i2 : 2030");
        float f1;
        double f2;
    }
}
