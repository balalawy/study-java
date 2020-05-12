package Data0512;

import java.util.Scanner;

public class Person {
    private String name;
    private Animal animal;


    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        name = sc.next();
        System.out.print("\n\n" + name + "和");
    }


    public static void main(String[] args) {
        Person person = new Person();
        person.animal = new Cat();
        Cat cat = (Cat) person.animal;
        person.input();
        cat.play();


        person.animal = new Dog();
        Dog dog = (Dog) person.animal;
        person.input();
        dog.play();
    }
}
