package Date0506;

import java.util.Scanner;

public class Person {
    private String name;
    Rabbit rabbit ;

    public void setName(String name1){
        name = name1;
    }
    public String getName(){
        return  name;
    }

    public static void main(String[] args) {
        Person person =new Person();
        person.rabbit = new Rabbit();
        person.setName("小明");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入品种：");
        String variety1 = sc.next();
        person.rabbit.setVariety(variety1);
        System.out.println("请输入毛色：");
        String color1 = sc.next();
        person.rabbit.setColor(color1);
        System.out.println("请输入性别：");
        String sex1 = sc.next();
        person.rabbit.setSex(sex1);
        System.out.println("请输入年龄：");
        int age1 = sc.nextInt();
        person.rabbit.setAge(age1);
        System.out.println(person.name+"养了一只兔子，"+person.rabbit.eat(variety1,color1,sex1,age1));
    }
}
