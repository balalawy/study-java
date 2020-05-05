package data0505;

import java.util.Scanner;

public class HomeWork2 {
    //无返回值 有参数展示一个人的信息
    public void Information(String name,
                            int age,
                            String sex,
                            double height,
                            double weight){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("性别："+sex);
        System.out.println("身高："+height);
        System.out.println("体重："+weight);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name= sc.next();
        System.out.println("请输入年龄：");
        int age=sc.nextInt();
        System.out.println("请输入性别：");
        String sex = sc.next();
        System.out.println("请输入身高：");
        double height = sc.nextDouble();
        System.out.println("请输入体重：");
        double weight = sc.nextDouble();
        HomeWork2 homeWork2 = new HomeWork2();
        homeWork2.Information(name,age,sex,height,weight);
    }
}
