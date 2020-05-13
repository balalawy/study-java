package Data0513;

public class Manager extends Clerk {
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void work() {
        System.out.print("正在和xx公司洽谈业务");
    }

    public void show() {
        System.out.print("工号为" + getNumber() + "的" + getName());
        work();
        System.out.print(",他的薪资为：" + (getMoney() + getBonus()) + "。");
    }
}
