package Date0515;

import java.util.Scanner;

public class VideoCard {
    //芯片
    private String chip;
    //显存容量
    private String volume;
    Scanner sc;

    {
        System.out.println("请输入显卡的芯片：");
        sc = new Scanner(System.in);
        chip = sc.next();
        System.out.println("请输入显卡的显存容量：");
        volume = sc.next();
    }


    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
}
