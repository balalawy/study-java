package Date0509;

public class Exam3 {
    public static void main(String[] args) {
        //兔子的只数
        int rabbit = 0;
        //鸡的只数
        int chicken = 0;
        for (rabbit = 0; rabbit < 10; rabbit++) {
            for (chicken = 0; chicken < 10; chicken++) {
                if ((rabbit + chicken) == 10 && (rabbit * 4 + chicken * 2) == 32) {
                    System.out.println("有" + rabbit + "只兔子，有" + chicken + "只鸡");
                }
            }
        }
    }
}
