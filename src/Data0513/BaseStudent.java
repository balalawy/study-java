package Data0513;

public class BaseStudent extends Student {
    public void study() {
        System.out.println("基础" + getGrade() + "的" + getName() + "正在学习java基础。");
    }

    public void eat() {
        System.out.println("基础" + getGrade() + "的" + getName() + "正在课上吃冰淇淋。");
    }
}
