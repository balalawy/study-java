package com.company;

import java.util.Scanner;

public class ShopInformation {
    public void Information(String name,
                            String registeredCapital,
                            String address,
                            int numberOfWorkers,
                            String legalRepresentative,
                            String annualIncome){
        System.out.println("商店名称："+name);
        System.out.println("注册资金："+registeredCapital);
        System.out.println("地址："+address);
        System.out.println("员工人数："+numberOfWorkers);
        System.out.println("法人代表："+legalRepresentative);
        System.out.println("年收入："+annualIncome);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商店名称：");
        String name= sc.next();
        System.out.println("注册资金：");
        String registeredCapital=sc.next();
        System.out.println("请输入地址：");
        String address=sc.next();
        System.out.println("请输入员工人数：");
        int numberOfWorkers=sc.nextInt();
        System.out.println("法请输入人代表：");
        String legalRepresentative=sc.next();
        System.out.println("请输入年收入");
        String annualIncome=sc.next();
        ShopInformation shopInformation = new ShopInformation();
        shopInformation.Information(name,registeredCapital,address,numberOfWorkers,legalRepresentative,annualIncome);
    }
}
