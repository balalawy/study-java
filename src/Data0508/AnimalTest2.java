package Data0508;

public class AnimalTest2 {
    public static void main(String[] args) {
        //测试老虎 使用构造方法解决 属性赋值 15:45
        Tiger tiger = new Tiger("东北虎", 5);
        tiger.show();

        Rabbit rabbit = new Rabbit("灰毛兔子", 3);
        rabbit.show();

        Bird bird = new Bird("精钢鹦鹉", 6);
        bird.show();


    }
}
