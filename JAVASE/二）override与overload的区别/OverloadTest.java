package git;

public class OverloadTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        OverloadTest s = new OverloadTest();
        s.sayHello();
        s.sayHello("我是jimbo");

    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayHello(String name) {//parameter 的变化是 overload，method name必须一致
        System.out.println("Hello" + "，" + name);
    }
}

