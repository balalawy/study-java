package Data0513;

public class GeneralStaff extends Clerk {
    public void work() {
        System.out.print("正在熬夜写代码");
    }

    public void show() {
        System.out.print("工号为" + getNumber() + "的" + getName());
        work();
        System.out.print(",他的薪资为：" + getMoney() + "。");
    }
}
