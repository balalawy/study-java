package Data0513;

import java.util.Scanner;

public abstract class Teacher {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void prelect() {

    }

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("输入老师姓名：");
        setName(in.next());
        System.out.println("输入老师年龄：");
        setAge(in.nextInt());
    }

    public void show() {
        System.out.println("老师姓名：" + getName());
        System.out.println("老师年龄：" + getAge());
    }
}
