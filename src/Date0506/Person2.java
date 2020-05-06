package Date0506;
//编写客户类 方法书写
//  属性：积分/卡类型
//  方法：show()，显示客户信息
//
//  积分
//  1000-2000之间 显示 白银客户
//  2001-3000之间 显示 黄金客户
//  3000以上      显示 黄金VIP客户
//
//  卡类型  根据录入的金额+卡类型 判断
//  白银客户 显示 可以打9折 消费金额：xxxx
//  黄金客户 显示 可以打8折
//  黄金VIP客户   可以打7折

public class Person2 {
    private int integral;
    String[] cardType = {"白银客户", "黄金客户", "黄金VIP客户"};
    private double money;

    public void setIntegral(int integral1) {
        integral = integral1;
    }

    public int getIntegral() {
        return integral;
    }

    public void setMoney(double money1) {
        money = money1;
    }

    public double getMoney() {
        return money;
    }

    public void show(int integral, double money) {
        if (getIntegral() >= 1000 && getIntegral() <= 2000) {
            System.out.println("该用户为：" + cardType[0]);
            System.out.println("该用户的消费金额：" + getMoney() * 0.9);
        } else if (getIntegral() > 2000 && getIntegral() <= 3000) {
            System.out.println("该用户为：" + cardType[1]);
            System.out.println("该用户的消费金额：" + getMoney() * 0.8);
        } else if (getIntegral() > 3000) {
            System.out.println("该用户为：" + cardType[2]);
            System.out.println("该用户的消费金额：" + getMoney() * 0.7);
        }
    }
}
