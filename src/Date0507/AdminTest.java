package Date0507;

import java.util.Scanner;

public class AdminTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Admin admin = new Admin();
        for (int i = 0; ; ) {
            System.out.println("请输入用户名");
            String username1 = sc.next();
            System.out.println("请输入用密码");
            String password1 = sc.next();
            if (username1.equals(admin.username) && password1.equals(admin.password)) {
                System.out.println("登录成功");
                System.out.println("请重新修改账号密码");
                System.out.println("请输入新的账号");
                admin.username = sc.next();
                System.out.println("请输入新的密码");
                admin.password = sc.next();
                break;
            } else {
                System.out.println("请重新输入账号和密码");
            }
        }
    }
}

