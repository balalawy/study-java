package StudyJavaFunc;

import java.util.Date;

public class StudyJava {
    public static void main(String[] args) {
        /*一个正整数除以0的结果是正无穷大，计算0/0或者负数的平方根结果为NaN
        double a = 0/0;
        System.out.println(a);*/

        /*浮点数值采用二进制系统表示无法精确地表示分数1/10
        double a = 2.0-1.1;
        System.out.println(a);*/

        /*char类型中分别代表注册字符和π，在使用char类型字符的时候要注意\     u的使用
        char b = '\u03C0';//π
        char a = '\u2122';//注册字符
        System.out.println(a);*/

        /*变量名未赋值，编译不过会报错。
        int a;
        System.out.println(a);*/

        /*使用final来指示常量，一旦被赋值之后，该变量不能再进行更改，习惯上常量名使用全大写
        final int A = 10;
        int A =20;*/

        double x = 10000.0 / 3.0;
        //正常输出x为3333.333333333333335
        System.out.println(x);
        //输出8个字符的宽度和小数点后两个字符的精度打印x  也就是输出一个空格和七个字符
        System.out.printf("\n%8.2f", x);
        //逗号标志增加了分组的分隔符
        System.out.printf("\n%,2f", 10000.0 / 3.0);

        String name = "jack";
        int age = 15;
        //以%来进行相应的字符串替换 f浮点数   s字符串 d 表示十进制整数
        System.out.printf("\nHello,%s.Next year,you'll be %d", name, age);
        //输出当前时间语句  可以将c用不同的转换符转换  c完整的日期和时间  ， F  ISO 8601日期 D美国格式的日期 ，
        // T 24小时时间........
        System.out.printf("\n%tc", new Date());
        //输出 Due date: 五月 13,2020
        System.out.printf("\n%1$s %2$tB %2$te,%2$tY", "Due date:", new Date());

        //输出After year 10, your balance is 100,000,000.00
        int year = 10;
        double balance = 100000000;
        System.out.printf("\nAfter year %d, your balance is %,.2f%n", year, balance);

        //倒计数for循环语句
        for (int i = 10; i > 0; i--) {
            System.out.println("Countind down..." + i);
        }
        System.out.println("Blastoff!");


    }
}
