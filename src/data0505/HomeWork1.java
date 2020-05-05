package data0505;

import java.util.Scanner;

public class HomeWork1 {
    String name;
    String registeredCapital;
    String address;
    int numberOfWorkers;
    String legalRepresentative;
    String annualIncome;



    public String Information(){
        String str = "商店名称："+name+"\n注册资金："+registeredCapital+"\n地址："+address+"\n员工人数："+numberOfWorkers+"\n法人代表："+legalRepresentative+"\n年收入："+annualIncome;
        return str;
    }


    public static void main(String[] args) {
        HomeWork1 homeWork1 = new HomeWork1();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商店名称：");
        homeWork1.name= sc.next();
        System.out.println("注册资金：");
        homeWork1.registeredCapital=sc.next();
        System.out.println("请输入地址：");
        homeWork1.address=sc.next();
        System.out.println("请输入员工人数：");
        homeWork1.numberOfWorkers=sc.nextInt();
        System.out.println("法请输入人代表：");
        homeWork1.legalRepresentative=sc.next();
        System.out.println("请输入年收入");
        homeWork1.annualIncome=sc.next();
        System.out.println(homeWork1.Information());
    }
}
