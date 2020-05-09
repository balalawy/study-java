package Date0509;

import java.util.Scanner;

public class Circle {
    private double radius;


    public void setRadius(double radius1) {
        radius = radius1;
    }


    public double getRadius() {
        return radius;
    }


    public Circle(double radius) {
        this.radius = radius;
    }


    public double girth() {
        double perimeter = Math.PI * 2 * radius;
        return perimeter;
    }


    public double area() {
        double area1 = Math.PI * radius * radius;
        return area1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("圆的周长为：" + circle.girth());
        System.out.println("圆的面积为：" + circle.area());
    }
}
