package com.company;

public class HomeWork2 {
    //名称
    String name;
    //教室数目
    int numberOfClassrooms;
    //机房数目
    int numberOfRooms;

    public String show(){
        String str = "名称："+name +"\n教室数目："+numberOfClassrooms+"\n机房数目："+numberOfRooms;
        return  str;
    }



    public static void main(String[] args) {
        HomeWork2 homeWork2 = new HomeWork2();
        homeWork2.name = "xx";
        homeWork2.numberOfClassrooms=10;
        homeWork2.numberOfRooms=20;
        System.out.println(homeWork2.show());
    }
}
