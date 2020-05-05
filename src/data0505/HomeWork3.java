package data0505;

import java.util.Scanner;

public class HomeWork3 {
    //无返回值 无参数展示一个人的信息
    String name;
    int age;
    String sex;
    double height;
    double weight;



    public void Information(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("性别："+sex);
        System.out.println("身高："+height);
        System.out.println("体重："+weight);
    }


    public static void main(String[] args) {
        HomeWork3 homeWork3 = new HomeWork3();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        homeWork3.name= sc.next();
        System.out.println("请输入年龄：");
        homeWork3.age=sc.nextInt();
        System.out.println("请输入性别：");
        homeWork3.sex = sc.next();
        System.out.println("请输入身高：");
        homeWork3.height = sc.nextDouble();
        System.out.println("请输入体重：");
        homeWork3.weight = sc.nextDouble();

        homeWork3.Information();
    }
}
