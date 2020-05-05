package data0505;

import java.util.Scanner;

public class HomeWork8 {
    //有参数 有返回值类型
    //属性：品种、毛色、性别、年龄，眼睛的颜色
    //白兔子 白色 雄  2  红色

    String variety;
    String color;
    String sex;
    int age;
    String eysColor;


    public String Information( String variety, String color, String sex, int age, String eysColor) {
        String str = "品种：" + variety+"\n毛色：" + color+"\n性别：" + sex+"\n年龄：" + age+"\n眼睛的颜色：" + eysColor;
        return str;
    }


    public static void main(String[] args) {
        HomeWork8 homeWork8 = new HomeWork8();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入品种：");
        homeWork8.variety = sc.next();
        System.out.println("请输入毛色：");
        homeWork8.color = sc.next();
        System.out.println("请输入性别：");
        homeWork8.sex= sc.next();
        System.out.println("请输入年龄：");
        homeWork8.age = sc.nextInt();
        System.out.println("请输入眼睛的颜色：");
        homeWork8.eysColor = sc.next();
        System.out.println(homeWork8.Information(homeWork8.variety,homeWork8.color,homeWork8.sex,homeWork8.age,homeWork8.eysColor));
    }
}
