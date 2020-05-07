package Date0507;

import java.util.Scanner;

public class ChangeAdmin {

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入用户名：");
        String userName = sc.next();
        System.out.println("请你输入密码：");
        String password = sc.next();
        Administrator admin = new Administrator();
        boolean flag = admin.login(userName, password);
        for (int i = 0; ; ) {
            if (flag) {
                //修改密码
                System.out.println("请输入新的密码：");
                //拿出对象中的密码来进行修改
                admin.password = sc.next();
                System.out.println("请你确认的密码：");
                admin.newPassword = sc.next();
                //判断两次密码是否一致
                if (admin.password.equals(admin.newPassword)) {
                    System.out.println("密码修改成功！新的密码：" + admin.password);
                    break;
                } else {
                    System.out.println("两次密码不一致请你重新输入！");

                }
            } else {
                System.out.println("登陆失败！");
            }
        }


    }
}
