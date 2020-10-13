package demo6.array;

public class ArrayProblem01 {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        //创建一个栈对象，初始化容量为10个元素

        //调用方法压栈
        stack.push("abc-2");
        stack.push("abc-1");
        stack.push("abc0");
        stack.push("abc1");
        stack.push("abc2");
        stack.push("abc3");
        stack.push("abc4");
        stack.push("abc5");
        stack.push("abc6");
        stack.push("abc7");
        stack.push("abc8");

        //调用方法弹栈，往外弹，返回ele
        stack.pop();
        stack.pop();


    }




}

