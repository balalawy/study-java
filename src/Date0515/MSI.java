package Date0515;

public class MSI extends VideoCard implements IPCI {


    @Override
    public void show() {
        System.out.println("这是微星显卡，它的芯片是" + getChip() + "它的显存容量是" + getVolume());
    }
}
