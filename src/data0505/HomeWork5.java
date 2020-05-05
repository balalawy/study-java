package data0505;

import java.util.Scanner;

public class HomeWork5 {
    //有返回值，有参数写法
    String name;
    int age;
    String sex;
    double height;
    double weight;


    public String Information(String name, int age, String sex, double height, double weight){
        String str = "姓名："+name+"\n年龄："+age+"\n性别："+sex+"\n身高："+height+"\n体重："+weight;
        return str;
    }


    public static void main(String[] args) {
        HomeWork5 homeWork5 = new HomeWork5();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        homeWork5.name= sc.next();
        System.out.println("请输入年龄：");
        homeWork5.age=sc.nextInt();
        System.out.println("请输入性别：");
        homeWork5.sex = sc.next();
        System.out.println("请输入身高：");
        homeWork5.height = sc.nextDouble();
        System.out.println("请输入体重：");
        homeWork5.weight = sc.nextDouble();
        System.out.println(homeWork5.Information(homeWork5.name,homeWork5.age,homeWork5.sex,homeWork5.height,homeWork5.weight));
    }
}
