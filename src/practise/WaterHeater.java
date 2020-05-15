package practise;

import java.util.Scanner;

public class WaterHeater extends HomeAppliances {
    //温度
    private double temperature;
    //开关
    private boolean afc;
    Scanner sc;

    {
        System.out.println("是否打开开关：");
        sc = new Scanner(System.in);
        afc = sc.nextBoolean();
    }

    @Override
    public void electrify() {
        if (afc == true) {
            System.out.println("电源已接通");
        } else {
            System.out.println("电源未接通");
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean getAfc() {
        return afc;
    }

    public void setAfc(boolean afc) {
        this.afc = afc;
    }
}
