package myinterface;

public class Test2 {
    public static void main(String[] args) {
        //接口的多态
        IUSB iusb = new UDisk();
        //这里是U盘实例实现方法
        iusb.m1();
        //接口属性
        int a1 = iusb.a;
        System.out.println(a1);

        //第二个子类实例
        iusb = new IPad();
        iusb.m1();
        int a2 = iusb.a;
        System.out.println(a2);
    }
}
