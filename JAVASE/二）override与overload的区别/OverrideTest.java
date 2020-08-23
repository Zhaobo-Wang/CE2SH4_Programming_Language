package git;

public class OverrideTest {

    public static void main(String[] args) {
        Son s = new Son();//建立子类的object
        s.sayHello();  //可以run子类的method，run结果为 hello by
    }

}
class Father{

    public void sayHello() {
        System.out.println("Hello");
    }

}
class Son extends Father{

    @Override
    public void sayHello() {
        System.out.println("hello by ");
        //子类继承父类，可override，method名字 parameter这些必须相同
        //method里面的东西不同
    }

}
