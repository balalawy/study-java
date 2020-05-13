package Data0513;

import java.util.Scanner;

public class Clerk1Test {
    Clerk1 clerk1;

    public static void main(String[] args) {
        Clerk1Test clerk1Test = new Clerk1Test();
        clerk1Test.clerk1 = new GeneralStaff1();
        Scanner in = new Scanner(System.in);
        System.out.println("请输入姓名：");
        clerk1Test.clerk1.setName(in.next());
        System.out.println("请输入工号：");
        clerk1Test.clerk1.setNumber(in.next());
        System.out.println("请输入基本工资：");
        clerk1Test.clerk1.setMoney(in.nextDouble());
        GeneralStaff1 generalStaff1 = (GeneralStaff1) clerk1Test.clerk1;
        ((GeneralStaff1) clerk1Test.clerk1).show(generalStaff1);


        Clerk1Test clerk1Test1 = new Clerk1Test();
        clerk1Test1.clerk1 = new Manger1();
        System.out.println("请输入姓名：");
        clerk1Test1.clerk1.setName(in.next());
        System.out.println("请输入工号：");
        clerk1Test1.clerk1.setNumber(in.next());
        System.out.println("请输入基本工资：");
        clerk1Test1.clerk1.setMoney(in.nextDouble());
        Manger1 manger1 = (Manger1) clerk1Test1.clerk1;
        System.out.println("请输入奖金：");
        manger1.setBonus(in.nextDouble());
        ((Manger1) clerk1Test1.clerk1).show(manger1);


    }
}
