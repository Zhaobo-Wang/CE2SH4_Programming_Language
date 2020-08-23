package git;

public class Application {
    public static void main(String[] args) {
        People p=new Stu();//多态： 父类 name = new 子类（）；
        p.eat();
        //run的结果为 *****吃水煮肉片******，因为eat override之后调用的是子类的method
        p.sleep();
        //run结果 为 睡觉
        //p.study(); run结果为报错，因为people 不包含这个method

    }
}
class People{
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}
class Stu extends People{
    @Override
    public void eat(){
        System.out.println("吃水煮肉片");
    }
    public void study(){
        System.out.println("好好学习");
    }
}
