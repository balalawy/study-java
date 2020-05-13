package Data0513;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String grade;


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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void study() {

    }

    public void eat() {

    }

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("输入学生姓名：");
        setName(in.next());
        System.out.println("输入学生年龄：");
        setAge(in.nextInt());
        System.out.println("请输入学生班级：");
        setGrade(in.next());
    }
}
