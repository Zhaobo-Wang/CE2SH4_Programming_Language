package demo5.array;

public class ArrayTest02 {
    public static void main(String[] args) {
        int[] a = new int[4];//动态初始化
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        /*
        run的值为
        0
        0
        0
        0
         */


        Object[] objs = new Object[3];
        for(int i = 0; i < objs.length; i++){
            System.out.println(objs[i]);
        }
        /*
        run的值为
        null
        null
        null
         */

        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        Object[] obj={o1,o2,o3};

        for(int i = 0; i < obj.length; i++){
            System.out.println(obj[i]);
        }
        /*
        run的值为
        java.lang.Object@e580929
        java.lang.Object@1cd072a9
        java.lang.Object@7c75222b

         */


    }
}
