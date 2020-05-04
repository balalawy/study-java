package com.company;

public class School {
    //名称
    String name;
    //教室数目
    int numberOfClassrooms;
    //机房数目
    int numberOfRooms;

    public void show(){
        System.out.println("机房名称："+name);
        System.out.println("教室数目："+numberOfClassrooms);
        System.out.println("机房数目："+numberOfRooms);
    }


    public static void main(String[] args) {
        School school = new School();
        school.name="xx培训中心";
        school.numberOfClassrooms=100;
        school.numberOfRooms=100;
        school.show();
    }

}
