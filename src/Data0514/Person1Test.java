package Data0514;

public class Person1Test {
    public static void main(String[] args) {
        Person1 person1 = new Coach();
        person1.setName("张三");
        person1.setAge(50);
        person1.setHeight(185);
        person1.setWeight(75);
        person1.setKind("篮球");
        person1.guidance();
        Coach coach = (Coach) person1;
        coach.study();

        person1.setName("李四");
        person1.setAge(55);
        person1.setHeight(189);
        person1.setWeight(75);
        person1.setKind("乒乓球");
        person1.guidance();
        Coach coach1 = (Coach) person1;
        coach1.study();

        person1 = new Student1();
        person1.setName("王五");
        person1.setAge(20);
        person1.setHeight(189);
        person1.setWeight(70);
        person1.setKind("篮球");
        person1.practise();
        Student1 student1 = (Student1) person1;
        student1.study();

        person1.setName("赵六");
        person1.setAge(20);
        person1.setHeight(189);
        person1.setWeight(70);
        person1.setKind("乒乓球");
        person1.practise();
        Student1 student2 = (Student1) person1;
        student2.study();

    }
}
