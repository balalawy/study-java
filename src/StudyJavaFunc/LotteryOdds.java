package StudyJavaFunc;

import java.util.Scanner;

public class LotteryOdds {
    //计算中奖概率的公式,在多少个1-num1个数字中选择num 个数字  来看中奖概率
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入中奖号码的位数：");
        int num = in.nextInt();
        System.out.print("请输入参与中奖号码数字的最大数值：");
        int num1 = in.nextInt();
        int lotterOdds = 1;
        for (int i = 1; i <= num; i++) {
            lotterOdds = lotterOdds * (num1 - i + 1) / i;
        }
        String probability = "1/" + lotterOdds;
        System.out.println("中奖概率为：" + probability);
    }
}
