package Date0515;

public class Asus extends VideoCard implements IPCI {

    @Override
    public void show() {
        System.out.println("这是华硕显卡,它的芯片是" + getChip() + "它的显存容量是" + getVolume());
    }
}
