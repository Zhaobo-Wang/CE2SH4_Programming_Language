package demo5.array;

public class ArrayTest03 {

    public static void main(String[] args) {

        int[] a1 = {1, 23, 3};

        int[] x = {12, 23, 34, 45, 56};

        String[] s1 = {"abc","def","gah"};

        printArray(x);
        printArray(s1);

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void printArray(String[] strs){
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }



    }

}


