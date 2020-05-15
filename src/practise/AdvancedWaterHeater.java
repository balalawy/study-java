package practise;

import java.util.Scanner;

public class AdvancedWaterHeater extends WaterHeater implements IWaterHeater {
    Scanner in;

    @Override
    public void showTemperature() {
        System.out.println("此时的温度为：" + getTemperature() + "请尽快关闭电源");
    }

    @Override
    public void makeASound() {
        System.out.println("此时的温度为：" + getTemperature() + "请尽快关闭电源");
    }

    @Override
    public void electrify() {
        if (getAfc() == true) {
            System.out.println("电源已接通。");
            double a = 10;
            for (a = 10; a <= 100; a += 2) {
                setTemperature(a);
                if (getTemperature() >= 95 && getTemperature() < 100) {
                    showTemperature();
                    makeASound();
                    System.out.println("是否关闭电源：");
                    in = new Scanner(System.in);
                    boolean afg = in.nextBoolean();
                    if (afg == true) {
                        System.out.println("电源已关闭。");
                        break;
                    }
                } else if (getTemperature() == 100) {
                    System.out.println("温度已达到100℃，电源自动关闭。");
                } else {
                    System.out.println("此时温度为" + getTemperature() + "正在加热中");
                }
            }
        } else {
            System.out.println("电源未接通");
        }
    }
}

