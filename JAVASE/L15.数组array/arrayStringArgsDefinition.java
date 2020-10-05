package demo6.array;
/*
main 方法上面的string【】 args 有什么用？

JVM 调用 main 方法， 会自动传一个 string 数组传过来

 */
public class arrayStringArgsDefinition {

    public static void main(String[] args) {
        //JVM 默认传过来的数组对象长度是？ 0
        System.out.println("JVM 给传递过来的String数组参数，它的数组长度是？ "+args.length);
        //run结果是 不是null，而是 0
        //数组里面没有东西，但是有一个叫args的数组对象

        //例如下面这样：
        String[] strs  = new String[0];
        printLength(strs);

        //那么这个数组什么时候会有值？
        //其实这个数组是留给用户的，用户可以在控制台上输入参数
        //这个参数会被自动转换为 String【】 args

        for (int i = 0; i < args.length; i++) {

            System.out.println(args[i]);

        }
    }

    public static void printLength(String[] args){
        System.out.println(args.length);

    }



}

//接下一个：ArraySimulateUserPass
