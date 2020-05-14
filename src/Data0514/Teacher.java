package Data0514;

public class Teacher extends Person implements IPerson {
    public void work() {
        System.out.println("今年" + getAge() + "岁,手机号码为" + getTelephoneNumber() + "的" + getName() + "老师正在给学生上课。");
    }

    @Override
    public void smoking() {
        System.out.println("今年" + getAge() + "岁,手机号码为" + getTelephoneNumber() + "的" + getName() + "老师下课后在厕所抽烟。");
    }
}
