package demo6.array;

public class MyStack{

    private Object[] elements;
    //向栈中存储元素，我们这里使用一维数组模拟。存到栈中，就表示存储到数组中。
    //因为数组是我们学习java的第一个容器
    //为什么选择object类型数组？
    //因为这个栈可以存储java中任何的引用类型数据（Object[] 相当于 万能的口袋，可以往里放任何东西）
    //new animal（）可以放进去，new Person（）可以放进去。因为animal和person的超级父类就是object。
    //包括string也可以存进去。

    private int index;
    //栈帧，永远指向栈顶部元素。
    //默认初始值是多少？ 注意：最初的栈是空的，一个元素都没有。


    public MyStack() {
        //在constructor里面赋值
        //一维数组动态初始化
        //默认初始化为10
        this.elements = new Object[10];
        this.index = -1;
    }

    public void push(Object ele){
        //这是一个压栈的方法
        if(this.index >= this.elements.length - 1 ){
            System.out.println("栈已满程序结束，压栈失败");
            return;
        }
        //程序能走到这里说明栈没满
        this.index++;//栈帧向上移动一个位置，当向栈中
        this.elements[index]  = ele;//index最新指向的位置，就是它的index位置
        System.out.println("压栈"+ ele + "成功，栈帧指向" + index);

    }

    //弹栈的方法，从数组中往外取元素
    public void pop() {

        if (index < 0) {
            System.out.println("弹栈失败，栈已空");
            return;
        }
        //程序到这儿说明栈没空
        System.out.print("弹栈" + elements[index] + "元素成功");
        index--;
        System.out.println("指针指向" + index);
    }




    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


}

