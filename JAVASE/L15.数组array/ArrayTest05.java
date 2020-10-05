package demo6.array;

public class ArrayTest05 {

    public static void main(String[] args) {


        int[] a = {1,2,3};//静态数组传递
        printArray(a);

        System.out.println("=========================================");

        printArray(new int[]{1,2,3});//新语法

        System.out.println("==========================================");

        int[] a2 = new int[4];

        printArray(a2);

        System.out.println("========================================");

        printArray(new int[3]);//传一个动态数组


    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}

/*
1
2
3
=========================================
1
2
3
==========================================
0
0
0
0
========================================
0
0
0

 */