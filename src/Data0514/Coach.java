package Data0514;

public class Coach extends Person1 {
    public void guidance() {
        System.out.println("身高" + getHeight() + "体重" + getWeight() + "年龄" + getAge() + "岁的" + getName() + "教练正在教" + getKind());
    }

    public void study() {
        System.out.println("身高" + getHeight() + "体重" + getWeight() + "年龄" + getAge() + "的" + getName() + "教练正在学习英语");
    }
}
