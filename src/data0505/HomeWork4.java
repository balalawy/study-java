package data0505;

import java.util.Scanner;

public class HomeWork4 {
    //有返回值，无参数写法
    String name;
    int age;
    String sex;
    double height;
    double weight;



    public String Information(){
        String str = "姓名："+name+"\n年龄："+age+"\n性别："+sex+"\n身高："+height+"\n体重："+weight;
        return str;
    }


    public static void main(String[] args) {
        HomeWork4 homeWork4 = new HomeWork4();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        homeWork4.name= sc.next();
        System.out.println("请输入年龄：");
        homeWork4.age=sc.nextInt();
        System.out.println("请输入性别：");
        homeWork4.sex = sc.next();
        System.out.println("请输入身高：");
        homeWork4.height = sc.nextDouble();
        System.out.println("请输入体重：");
        homeWork4.weight = sc.nextDouble();
        System.out.println(homeWork4.Information());
    }
}
