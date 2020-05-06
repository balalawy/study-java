package Date0506;
//HomeWork1 小明养了一只兔子，使用小明这个对象去调用兔子中  eat(...)方法 思考题？
//人养兔子 ，兔子就是作为人的一个附属品属性 使用引用数据类型的思维方式去解决
//参数也会涉及到兔子类

import java.util.Scanner;

public class Rabbit {
    private String variety;
    private String color;
    private String sex;
    private int age;

    public void setVariety(String variety1){
        variety = variety1;
    }
    public String getVariety(){
        return variety;
    }
    public void setColor(String color1){
        color = color1;
    }
    public String getColor(){
        return color;
    }
    public void setSex(String sex1){
        sex = sex1;
    }
    public String getSex(){
        return sex;
    }
    public void setAge(int age1){
        age = age1;
    }
    public int getAge(){
        return age;
    }
    public String eat( String variety, String color, String sex, int age) {
        String str =sex+"的"+variety+"今天"+age+"岁啦，它的毛色是"+color+"它正在吃胡萝卜";
        return str;
    }



}
