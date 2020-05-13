package Data0513;

import java.util.Scanner;

public class TeacherTest {
    Teacher teacher;

    public static void main(String[] args) {
        TeacherTest person = new TeacherTest();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要录入哪个老师的信息：1.基础班老师信息 2.就业班老师信息");
        String num = sc.next();
        switch (num) {
            case "1":
                //基础班老师
                person.teacher = new BaseTeacher();
                person.teacher.input();
                person.teacher.show();
                BaseTeacher teacher = (BaseTeacher) person.teacher;
                teacher.prelect();
                break;
            case "2":
                //就业班老师
                person.teacher = new EmploymentTeacher();
                person.teacher.input();
                person.teacher.show();
                EmploymentTeacher teacher1 = (EmploymentTeacher) person.teacher;
                teacher1.prelect();
                break;
            default:
                System.out.println("请重新输入1或2选择想要录入什么老师的信息");
                break;
        }
    }
}
