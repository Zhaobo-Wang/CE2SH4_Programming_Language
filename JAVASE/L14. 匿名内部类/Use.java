package demo4;
//使用匿名内部类
public class  Use{
    public static void main(String[] args) {
        //调用myMath中的mySum方法
        MyMath mm = new MyMath();

        mm.mySum(new Compute() {  //匿名内部类的语法
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        }, 100, 200);
    }
}
//负责计算的接口
interface Compute{
    int sum(int a, int b);//abstract method
}

// math class
class MyMath{
    public void mySum(Compute c, int x, int y){//method
        c.sum(x,y);
        int retValue = c.sum(x,y);
        System.out.println(x + "+" + y + "=" + retValue);
    }

}

