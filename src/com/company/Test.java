package com.company;

import java.util.Scanner;

public class Test {
    //书写一个方法，来测试账号密码是否正确
       public boolean fun() {
           boolean flag = false;
           Scanner sc = new Scanner(System.in);
           System.out.print("账号：");
           String mangerId = sc.next();
           System.out.print("密码：");
           String password = sc.next();
           if (mangerId.equals("admin") && password.equals("admin")) {
               System.out.println("登录成功");
               flag = true;
           } else {
               System.out.println("登录失败，请重新输入");
               fun();
           }
           return flag;
       }


    public static void main(String[] args) {
           Test test = new Test();
           test.fun();
    }

}
