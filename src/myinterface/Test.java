package myinterface;

public class Test {
    public static void main(String[] args) {
        //    接口不能实例化
        IUSB usb = new UDisk();
        //使用方法  实现原理：编译看左边，运行看右边
        usb.m1();

        //可以实例化它的实现类
        //IUSB usb = new UDisk();
        //查看接口的属性
        //System.out.println(usb.a);
        //System.out.println(IUSB.a);//接口是否属于类
        //System.out.println(UDisk.b);
        //UDisk.b=1000;不能修改
        //a是个常量，不能进行赋值
        //usb.a = 100;

        UDisk uDisk = new UDisk();
        //uDisk.b = 20;
    }

}
