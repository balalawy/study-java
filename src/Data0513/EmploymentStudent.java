package Data0513;

public class EmploymentStudent extends Student {
    public void study() {
        System.out.println("就业" + getGrade() + "的" + getName() + "正在进行就业培训。");
    }

    public void eat() {
        System.out.println("就业" + getGrade() + "的" + getName() + "正在课上吃零食。");
    }
}
