package com.company;

public class HomeWork2 {
    //名称
    String name;
    //教室数目
    int numberOfClassrooms;
    //机房数目
    int numberOfRooms;

    public String showName(){
        name = "苏州总部";
        return  name;
    }


    public int showOne(){
        numberOfRooms=20;
        return numberOfRooms;
    }


    public  int showTwo(){
        numberOfClassrooms=10;
        return numberOfClassrooms;
    }


    public static void main(String[] args) {
        HomeWork2 homeWork2 = new HomeWork2();
        System.out.println("中心名称："+homeWork2.showName());
        System.out.println("中心教室数目:"+homeWork2.showTwo());
        System.out.println("中心机房数目："+homeWork2.showOne());
    }
}
