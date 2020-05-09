package Date0509;

public class Exam2 {
    public static void main(String[] args) {
        int count = 0;
        double money = 0;
        for (int day = 1; true; day++) {
            money += 2.5;
            if (day % 5 == 0) {
                money = money - 6;
            }
            count++;
            if (money >= 100) {
                break;
            }
        }
        System.out.println("小明第" + count + "天攒够100元");
    }
}