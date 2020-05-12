package Data0512;

public class Person1Test {
    Person1 person1;

    public static void main(String[] args) {
        Person1Test person = new Person1Test();
        person.person1 = new SouthPerson();
        person.person1.eat();
        //强制类型转换
        SouthPerson southPerson = (SouthPerson) person.person1;
        southPerson.trade();

        person.person1 = new NorthPerson();
        person.person1.eat();
        //强制类型转换
        NorthPerson northPerson = (NorthPerson) person.person1;
        northPerson.study();
    }
}
