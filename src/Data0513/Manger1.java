package Data0513;

public class Manger1 extends Clerk1 {
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

    public void show(Manger1 manger1) {
        System.out.print("工号为" + manger1.getNumber() + "的" + manger1.getName());
        work();
        System.out.print(",他的薪资为：" + (manger1.getMoney() + manger1.getBonus()) + "。");
    }


}
