package StudyJavaFunc.Date0513;

import java.util.Scanner;

public class SonTest {
    //值传递
    public static void test(String[] name, double[] height, double[] weight, int[] age) {
        Scanner in = new Scanner(System.in);
        name[0] = in.next();
        height[0] = in.nextDouble();
        weight[0] = in.nextDouble();
        age[0] = in.nextInt();
    }

    //引用传递
    public static void test2(PersonInfo personInfo) {
        personInfo.name = "vaneyu";
        personInfo.height = 172.5;
        personInfo.weight = 168.5;
        personInfo.age = 18;
    }


    //有返回值
    public static PersonInfo test3() {
        PersonInfo personInfo = new PersonInfo();
        personInfo.name = "vaneyu";
        personInfo.height = 172.5;
        personInfo.weight = 168.5;
        personInfo.age = 18;
        return personInfo;
    }

    public static void main(String[] args) {
//        String []name = {"name"};
//        double []height = {1.0};
//        double []weight = {0.0};
//        int []age = {0};
//        test(name, height, weight, age);
//
//        Son son = new Son(name[0],height[0],weight[0],age[0]);
//        System.out.println("姓名："+son.getName());
//        System.out.println("身高："+son.getHeight());
//        System.out.println("体重："+son.getHeight());
//        System.out.println("年龄："+son.getAge());

//        PersonInfo personInfo = new PersonInfo();
//        test2(personInfo);
//        Son son = new Son(personInfo.name,personInfo.height,personInfo.weight,personInfo.age);
//        System.out.println("姓名："+son.getName());
//        System.out.println("身高："+son.getHeight());
//        System.out.println("体重："+son.getHeight());
//        System.out.println("年龄："+son.getAge());

        PersonInfo personInfo = test3();
        Son son = new Son(personInfo.name, personInfo.height, personInfo.weight, personInfo.age);
        System.out.println("姓名：" + son.getName());
        System.out.println("身高：" + son.getHeight());
        System.out.println("体重：" + son.getHeight());
        System.out.println("年龄：" + son.getAge());

//        Scanner in = new Scanner(System.in);
//        String name = in.next();
//        double height = in.nextDouble();
//        double weight = in.nextDouble();
//        int age = in.nextInt();
//        Son son = new Son(name,height,weight,age);
//        System.out.println("姓名："+son.getName());
//        System.out.println("身高："+son.getHeight());
//        System.out.println("体重："+son.getHeight());
//        System.out.println("年龄："+son.getAge());
    }
}
