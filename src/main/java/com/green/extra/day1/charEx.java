package com.green.extra.day1;

public class charEx {
    public static void main(String[] args) {
        char ch = 'a';
        String str = "a"; //주소값이 str에 저장
        // 변수이름에 쓸수있는 특수기호 _, $
        int _name, $name;
        //예약어(파란글씨public, static 등등) 는 이름으로 쓸수 없다
        int abs, aBc, Abc; //대문자로 시작할수있는건 클래스명밖에
        //int 1ab; 오류//변수명 숫자로 시작할수 없다.
        int helloMyNameIsHong; //카멜(변수명, 메소드명)
        int HelloMyNameIsHong; //파스칼(클래스명
        final int HELLO_MY_NAME_IS_HONG =10;




        System.out.printf("%c: %d\n",ch, (int)ch); //숫자로 인코딩 문자로 디코딩

    }
}
