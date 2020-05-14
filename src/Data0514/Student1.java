package Data0514;

public class Student1 extends Person1 implements IPerson1 {
    public void practise() {
        System.out.println("身高" + getHeight() + "体重" + getWeight() + "年龄" + getAge() + "的" + getName() + "学生正在学" + getKind());
    }

    public void study() {
        System.out.println("身高" + getHeight() + "体重" + getWeight() + "年龄" + getAge() + "的" + getName() + "学生正在学习英语");
    }

}
