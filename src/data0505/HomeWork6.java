package data0505;

import java.util.Scanner;

public class HomeWork6 {
    //无参数 无返回值类型
    //属性：品种、毛色、性别、年龄，眼睛的颜色
    //白兔子 白色 雄  2  红色

    String variety;
    String color;
    String sex;
    int age;
    String eysColor;


    public void Information() {
        System.out.println("品种：" + variety);
        System.out.println("毛色：" + color);
        System.out.println("性别：" + sex);
        System.out.println("年龄：" + age);
        System.out.println("眼睛的颜色：" + eysColor);
    }


    public static void main(String[] args) {
        HomeWork6 homeWork6 = new HomeWork6();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入品种：");
        homeWork6.variety = sc.next();
        System.out.println("请输入毛色：");
        homeWork6.color = sc.next();
        System.out.println("请输入性别：");
        homeWork6.sex= sc.next();
        System.out.println("请输入年龄：");
        homeWork6.age = sc.nextInt();
        System.out.println("请输入眼睛的颜色：");
        homeWork6.eysColor = sc.next();

        homeWork6.Information();
    }
}
