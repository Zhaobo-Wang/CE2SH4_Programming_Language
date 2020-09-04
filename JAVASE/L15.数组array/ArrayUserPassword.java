package demo5.array;
/*
模拟一个系统，必须输入用户名和密码。
 */
public class ArrayUserPassword {
    //用户名和密码输入到String[] args数组当中
    public static void main(String[] args) {
        if (args.length != 2) {//改configuration
            System.out.println("使用该系统请输入程序参数，参数包括用户名和密码信息，例如：zhangsan 123");
            return;
        }

        //程序执行到此处说明用户确实提供了用户名和密码
        //接下来你应该判断用户名和密码是否正确
        //取出用户名
        String username = args[0];
        //取出密码
        String password = args[1];

        //假设用户名是admin，密码是123的时候表示登录成功。其他时候失败

        //if(username.equals("admin")&& password.equals("123"))
        //如果username/password为null 会出现空指针异常
        //下面这种写法避免空指针异常
        if("admin".equals(username) && "123".equals(password)){
            System.out.println("登录成功，欢迎回来");
            System.out.println("您可以开始使用....");
        }else{
            System.out.println("验证失败，用户名不存在或密码错误！");
        }

    }



}
