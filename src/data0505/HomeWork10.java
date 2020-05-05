package data0505;

import java.util.Scanner;

public class HomeWork10 {
    //小明养了一只兔子，使用小明这个对象去调用兔子中  eat(...)方法
    String name;
    HomeWork9 rabbit;

    public static void main(String[] args) {
        HomeWork10 homeWork10 = new HomeWork10();
        homeWork10.name = "小明";
        homeWork10.rabbit = new HomeWork9();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入品种：");
        homeWork10.rabbit.variety = sc.next();
        System.out.println("请输入毛色：");
        homeWork10.rabbit.color = sc.next();
        System.out.println("请输入性别：");
        homeWork10.rabbit.sex= sc.next();
        System.out.println("请输入年龄：");
        homeWork10.rabbit.age = sc.nextInt();
        System.out.println(homeWork10.name+"养了一只兔子"+homeWork10.rabbit.eat(homeWork10.rabbit.variety,homeWork10.rabbit.color,homeWork10.rabbit.sex,homeWork10.rabbit.age));
    }

}
