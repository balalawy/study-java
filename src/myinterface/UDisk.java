package myinterface;

//U盘类
public class UDisk implements IUSB {
    static final int b = 10;

    @Override
    public void m1() {
        System.out.println("U盘被读取到了....");
    }
}
