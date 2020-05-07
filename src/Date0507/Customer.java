package Date0507;

public class Customer {
    //积分
    int point;
    //卡号类型
    String type;

    /**
     * 根据积分 反馈客户信息
     * 1000-2000之间 显示 白银客户
     * 2001-3000之间 显示 黄金客户
     * 3000以上      显示 黄金VIP客户
     */
    /*public void show(int point){
        //判断
        if (point>1000 && point<=2000){
            System.out.println("白银客户");
        }else if (point>2000 && point<=3000){
            System.out.println("黄金客户");
        }else if (point>3000){
            System.out.println("至尊VIP客户");
        }else{
            System.out.println("你的积分太低不能成为我们的客户！");
        }
    }*/

    //带有参数 带有返回值的
    public String show(int point) {
        String str;
        //判断
        if (point > 1000 && point <= 2000) {
            str = "白银客户";
        } else if (point > 2000 && point <= 3000) {
            str = "黄金客户";
        } else if (point > 3000) {
            str = "至尊VIP客户";
        } else {
            str = "你的积分太低不能成为我们的客户！";
        }
        return str;
    }

    /**
     * 卡类型  根据录入的金额+卡类型 判断
     * 白银客户 显示 可以打9折 消费金额：xxxx
     * 黄金客户 显示 可以打8折
     * 黄金VIP客户   可以打7折
     */
    /*public void showMoney(String type,double money){
        if (type.equals("白银客户")){
            //打九折
            System.out.println("最终您打九折，本次消费金额是"+(money*0.9)+"元！");
        }else if (type.equals("黄金客户")){
            System.out.println("最终您打九折，本次消费金额是"+(money*0.8)+"元！");
        }else if (type.equals("黄金VIP客户")){
            System.out.println("最终您打九折，本次消费金额是"+(money*0.7)+"元！");
        }else{
            System.out.println("卡号无效！本次消费金额是"+money+"元！");
        }
    }*/
    public String showMoney(String type, double money) {
        String str;
        if (type.equals("白银客户")) {
            //打九折
            str = "最终您打九折，本次消费金额是" + (money * 0.9) + "元！";
        } else if (type.equals("黄金客户")) {
            str = "最终您打九折，本次消费金额是" + (money * 0.8) + "元！";
        } else if (type.equals("黄金VIP客户")) {
            str = "最终您打九折，本次消费金额是" + (money * 0.7) + "元！";
        } else {
            str = "卡号无效！本次消费金额是" + money + "元！";
        }
        return str;
    }
}

