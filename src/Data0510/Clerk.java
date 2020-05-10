package Data0510;

import java.util.Scanner;

public class Clerk {
    //姓名
    private String eName;
    //工号
    private int eNum;
    //基本工资
    private float baseSal;
    //出勤率
    private float attendance;


    public Clerk(String eName, int eNum, float baseSal, float attendance) {
        this.eName = eName;
        this.eNum = eNum;
        this.baseSal = baseSal;
        this.attendance = attendance;
    }

    public Clerk() {

    }


    public double monthlyPay() {
        double mon = baseSal + baseSal * attendance;
        return mon;
    }

    public void clerkShow() {
        System.out.println("员工姓名：" + eName);
        System.out.println("员工工号：" + eNum);
        System.out.println("员工基本工资：" + baseSal);
        System.out.println("员工出勤率：" + attendance);
        System.out.println("员工工资为：" + monthlyPay());
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入员工姓名：");
        String name = sc.next();
        System.out.println("请输入员工工号：");
        int num = sc.nextInt();
        System.out.println("请输入员工基本工资：");
        float money = sc.nextFloat();
        System.out.println("请输入员工出勤率：");
        float att = sc.nextFloat();
        Clerk clerk = new Clerk(name, num, money, att);
        clerk.clerkShow();
    }
}
