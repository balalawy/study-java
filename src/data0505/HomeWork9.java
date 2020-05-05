package data0505;

import java.util.Scanner;

public class HomeWork9 {
    //雄性的灰兔子今天2岁啦它的毛色是深灰色它正在吃胡萝卜... eat(...)
    String variety;
    String color;
    String sex;
    int age;


    public String eat( String variety, String color, String sex, int age) {
        String str =sex+"的"+variety+"今天"+age+"岁啦，它的毛色是"+color+"它正在吃胡萝卜";
        return str;
    }


    public static void main(String[] args) {
        HomeWork9 homeWork9 = new HomeWork9();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入品种：");
        homeWork9.variety = sc.next();
        System.out.println("请输入毛色：");
        homeWork9.color = sc.next();
        System.out.println("请输入性别：");
        homeWork9.sex= sc.next();
        System.out.println("请输入年龄：");
        homeWork9.age = sc.nextInt();
        System.out.println(homeWork9.eat(homeWork9.variety,homeWork9.color,homeWork9.sex,homeWork9.age));
    }
}
