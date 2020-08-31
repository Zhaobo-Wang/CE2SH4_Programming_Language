package demo4;
//没有使用匿名内部类
public class Test01 {
    public static void main(String[] args) {
        //调用myMath中的mySum方法
        MyMath mm = new MyMath();
        ComputeImp a = new ComputeImp();
        mm.mySum(a,100,200);
    }
}
//负责计算的接口
interface Compute{
    int sum(int a, int b);//abstract method
}

class ComputeImp implements Compute{
    public int sum(int a, int b){
        return a+b;
    }
}

// math class
class MyMath{
    public void mySum(Compute c, int x, int y){//method
        c.sum(x,y);
        int retValue = c.sum(x,y);
        System.out.println(x + "+" + y + "=" + retValue);
    }

}

