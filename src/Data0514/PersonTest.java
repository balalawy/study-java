package Data0514;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Teacher();
        person.setName("张三");
        person.setAge(40);
        person.setTelephoneNumber("12345678910");
        person.work();
        Teacher teacher = (Teacher) person;
        teacher.smoking();

        person = new Student();
        person.setName("李四");
        person.setAge(16);
        person.setTelephoneNumber("13358986252");
        person.work();
        Student student = (Student) person;
        student.smoking();
    }
}
