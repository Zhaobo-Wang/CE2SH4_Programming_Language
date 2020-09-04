package demo5.array;

public class ArrayTest01{
    public static void main(String[] args) {

        int[] a1 = {1,100,10,20,55,689};//静态初始化
        System.out.println("数组中元素的个数"+a1.length);

        a1[0] = 111;//改元素值
        a1[a1.length-1] = 0;

        for(int i = 0; i < a1.length; i++){
            System.out.println(a1[i]);
        }

        for(int i = a1.length-1; i >= 0; i --){
            System.out.println(a1[i]);
        }
    }
}
/*
数组中元素的个数6
        111
        100
        10
        20
        55
        0
        0
        55
        20
        10
        100
        111
 */

