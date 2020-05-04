package com.company;

public class Student {
    //显示学生信息
    String name;
    int height;
    int weight;
    double pinMoney;
    boolean partyMember;
    char sex;

    public static void information(){
        Student student = new Student();
        student.name = "张三";
        student.height=180;
        student.weight=60;
        student.pinMoney=1000.5;
        student.partyMember=true;
        student.sex='男';
        System.out.println("姓名:"+student.name);
        System.out.println("身高:"+student.height);
        System.out.println("体重:"+student.weight);
        System.out.println("零用钱:"+student.pinMoney);
        System.out.println("是否是党员:"+student.partyMember);
        System.out.println("性别:"+student.sex);
    }

    public static void main(String[] args) {
        information();
    }
}
