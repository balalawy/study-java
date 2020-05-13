package Data0513;

public class GeneralStaff1 extends Clerk1 {

    public void work() {
        System.out.print("正在熬夜写代码");
    }

    public void show(GeneralStaff1 generalStaff1) {
        System.out.print("工号为" + generalStaff1.getNumber() + "的" + generalStaff1.getName());
        work();
        System.out.print(",他的薪资为：" + generalStaff1.getMoney() + "。");
    }
}
