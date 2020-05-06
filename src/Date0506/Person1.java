package Date0506;

//一个景区根据游人的年龄收取不同价格的门票。请编写游人类，根据年龄段决定能够购买的门票价格并输出
//  票价：100 成人：全票
//  老人和小孩 免费 大于65 小于7岁
//  如果在12-17之间 半票
public class Person1 {
    private int age;

    public void setAge(int age1) {
        if (age1 < 0 || age1 > 100) {
            System.out.println("请输入数值为0-100之间的年龄：");
        } else {
            age = age1;
        }
    }

    public int getAge() {
        return age;
    }
}
