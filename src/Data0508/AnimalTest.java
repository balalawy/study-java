package Data0508;

public class AnimalTest {
    public static void main(String[] args) {
      /*  Animal animal = new Animal();
        System.out.println(animal.name);
        System.out.println(animal.age);
*/
        //测试老虎
        Tiger tiger = new Tiger("东北虎2", 5);
       /* tiger.name="东北虎";
        tiger.age=5;
        System.out.println(tiger.name);
        System.out.println(tiger.age);*/
        tiger.setAge(5);
        tiger.setName("东北虎2");
        System.out.println(tiger.getName());
        System.out.println(tiger.getAge());


        Rabbit rabbit = new Rabbit("长毛兔", 2);
       /* rabbit.name="长毛兔";
        rabbit.age=2;
        System.out.println(rabbit.name);
        System.out.println(rabbit.age);*/
        rabbit.setAge(3);
        rabbit.setName("灰毛兔子");
        System.out.println(rabbit.getName());
        System.out.println(rabbit.getAge());

        Bird bird = new Bird("精钢鹦鹉", 6);
        System.out.println(bird.getName());
        System.out.println(bird.getAge());


    }
}
