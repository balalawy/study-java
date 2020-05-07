package Date0507;

public class Administrator {
    String userName = "admin";
    String password = "123456";
    //定义属性 确认密码的属性
    String newPassword;

    //判断登陆是否成功
    public boolean login(String userName, String password) {
        boolean flag = false;
        //业务逻辑的判断
        if (this.userName.equals(userName) && this.password.equals(password)) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }
}
