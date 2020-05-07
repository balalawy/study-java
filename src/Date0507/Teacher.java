package Date0507;

import java.util.Scanner;

public class Teacher {
    //属性
    String name;
    String professionalDirection;
    String teachingCourses;
    int teachingTime;

    //方法
    public void tea() {
        System.out.println("姓名：" + name);
        System.out.println("专业方向：" + professionalDirection);
        System.out.println("教授课程：" + teachingCourses);
        System.out.println("教龄：" + teachingTime + "年");
    }

    public static void main(String[] args) {
        //实例化对象
        Teacher tea = new Teacher();
        //赋值
        tea.name = "王老师";
        tea.professionalDirection = "计算机";
        tea.teachingCourses = "使用java语言理解程序逻辑";
        tea.teachingTime = 5;
        //调用方法
        tea.tea();
    }
}
