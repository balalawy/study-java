package Date0506;

import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Person1 person = new Person1();
        for (int i = 0; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n请输入年龄：");
            String a = sc.next();
            if (a.equals("n")) {
                System.out.println("程序终止");
                break;
            } else {
                int age = Integer.parseInt(a);
                person.setAge(age);
                if (person.getAge() > 0 && person.getAge() < 12 || person.getAge() > 65 && person.getAge() < 100) {
                    System.out.println("这个人" + person.getAge() + "岁了。");
                    System.out.println("这个人属于老人或者小孩");
                    System.out.println("这个人可以免费进入该景区。");
                } else if (person.getAge() >= 12 && person.getAge() <= 17) {
                    System.out.println("这个人" + person.getAge() + "岁了。");
                    System.out.println("这个人属于儿童");
                    System.out.println("这个人可以半价进入该景区。");
                } else if (person.getAge() > 17 && person.getAge() <= 65) {
                    System.out.println("这个人" + person.getAge() + "岁了。");
                    System.out.println("这个人属于成年人");
                    System.out.println("这个人全票进入该景区。");
                } else if (person.getAge() == 0) {
                    break;
                }
            }
        }
    }
}