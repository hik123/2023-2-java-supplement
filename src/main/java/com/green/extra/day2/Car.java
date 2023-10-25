package com.green.extra.day2;

public class Car {
    private String name;
    private int door;
    private String color;

    public Car (String name, int door, String color) {
        this.name = name;
        this.door = door;
        this.color = color;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDoor(int door) {
        this.door = door;
    }
    public void setColor(String color) {
        this.color = color;             //setter메소드 속성의 값을 변경하기위한것
    }

    public String getName() {           //getter메소드 가지고 있는 값을 외부에 던지기 위한것
        return name;
    }
    public int getDoor() {
        return door;
    }
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.format("name: %s, door: %d, color: %s"
                , name, door, color);
    }
}
class CarTest {
    public static void main(String[] args) {
        Car c = new Car("소나타", 2, "White");
        c.setName("제네시스");
        c.setDoor(7);
        c.setColor("Blue");
        System.out.println(c);

        String name = c.getName();
        int door = c.getDoor();
        String color = c.getColor();
        System.out.println(name); //제네시스
        System.out.println(door);
        System.out.println(color);
    }
}
