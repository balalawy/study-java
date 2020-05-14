package Data0514;

public class Student extends Person implements IPerson {
    public void work() {
        System.out.println("今年" + getAge() + "岁,手机号码为" + getTelephoneNumber() + "的" + getName() + "学生正在听老师讲课。");
    }

    @Override
    public void smoking() {
        System.out.println("今年" + getAge() + "岁,手机号码为" + getTelephoneNumber() + "的" + getName() + "学生下课后在厕所抽烟。");
    }
}
