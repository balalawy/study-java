package Data0513;

import java.util.Scanner;

public class ClerkTest {
    Clerk clerk;

    public static void main(String[] args) {
        ClerkTest clerkTest = new ClerkTest();
        clerkTest.clerk = new GeneralStaff();
        Scanner in = new Scanner(System.in);
        System.out.println("请输入姓名：");
        clerkTest.clerk.setName(in.next());
        System.out.println("请输入工号：");
        clerkTest.clerk.setNumber(in.next());
        System.out.println("请输入基本工资：");
        clerkTest.clerk.setMoney(in.nextDouble());
        GeneralStaff person = (GeneralStaff) clerkTest.clerk;
        person.show();

        clerkTest.clerk = new Manager();
        System.out.println("\n请输入姓名：");
        clerkTest.clerk.setName(in.next());
        System.out.println("请输入工号：");
        clerkTest.clerk.setNumber(in.next());
        System.out.println("请输入基本工资：");
        clerkTest.clerk.setMoney(in.nextDouble());
        Manager person1 = (Manager) clerkTest.clerk;
        System.out.println("请输入奖金：");
        person1.setBonus(in.nextDouble());
        person1.show();

    }
}
