package Data0513;

import java.util.Scanner;

public class StudentTest {
    Student student;

    public static void main(String[] args) {
        StudentTest test = new StudentTest();
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择要录入什么学生信息：1.基础班学生 2.就业班学生");
        String num = sc.next();
        switch (num) {
            case "1":
                test.student = new BaseStudent();
                test.student.input();
                BaseStudent student = (BaseStudent) test.student;
                student.study();
                student.eat();
                break;
            case "2":
                test.student = new EmploymentStudent();
                test.student.input();
                EmploymentStudent student1 = (EmploymentStudent) test.student;
                student1.study();
                student1.eat();
                break;
            default:
                System.out.println("请输入数字1或2确定要录入什么类型的学生信息");
                break;
        }
    }
}
