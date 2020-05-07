package Date0507;

import java.util.Scanner;

public class CustomerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; ; ) {
            System.out.println("请你输入积分：");
            String point = sc.next();
            if (point.equals("n")) {
                System.out.println("终止程序。");
                break;
            } else {
                int point1 = Integer.parseInt(point);
                //客户类实例化
                Customer customer = new Customer();
                //customer2.show(point);
                String str = customer.show(point1);
                System.out.println(str);
            }
        }
    }
}
