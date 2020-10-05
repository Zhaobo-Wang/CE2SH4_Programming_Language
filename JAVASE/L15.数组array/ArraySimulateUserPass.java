package demo6.array;
//接上一个：arrayStringArgsDefinition

//模拟一个系统，假设这个系统要使用，必须输入用户名和密码

public class ArraySimulateUserPass {

    //用户名和密码输入到String【】 args 数组中，在
    //run -> configiation中 -> program argument 改参数

    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("使用该系统时请输入程序参数，例如 zhangsan 123");
            return;
        }

        //程序执行到此处说明，用户确实提供了用户名和密码

        String username = args[0];
        String password = args[1];

        //假设用户名是admin，并且密码是123，并表示登陆成功
        //其他一律失败

        //if(username.equals("admin")&& password.equals("123"))
        //如果username/password为null 会出现空指针异常
        //下面这种写法避免空指针异常

        if("admin".equals(username)&&"123".equals(password)){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }


    }
}
