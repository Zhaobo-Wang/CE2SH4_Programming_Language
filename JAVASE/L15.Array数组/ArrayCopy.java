package demo5.array;
/*
关于1d array append：
在java开发中，array的长度一旦确定不可变，那么array满了怎么办？
数组满了，需要append

java中对数组的append是：
    先新建一个大容量的array，然后把小容量的array中的数据一个个的拷贝到大数组当中
 */
public class ArrayCopy {
    public static void main(String[] args) {
        //System.arraycopy(原数组，原数组起点，目标数组，目标数组起点，copy长度);

        int[] src = {1,11,22,3,4};
        int[] dest = new int[6];

        System.arraycopy(src, 1,dest,3,2);
        //从src 的 【1】开始copy，copy两个长度，到dest array

        for(int i = 0; i < dest.length; i++){
            System.out.println(dest[i]);
        }

        String[] strs = {"hello","world!","study","Java","mysql"};
        String[] newstrs = new String[6];

        System.arraycopy(strs, 0,newstrs,0,5);

        for(int i = 0; i < newstrs.length; i++){
            System.out.println(newstrs[i]);
        }

        Object[] objs = {new Object(), new Object(), new Object()};
        Object[] newObjs = new Object[5];
        System.arraycopy(objs, 0, newObjs, 0,objs.length);
        //这里copy的不是对象，而是对象的内存地址****************************************

        for(int i = 0; i < newObjs.length; i++){
            System.out.println(newObjs[i]);
        }
    }
}
/*
0
0
0
11
22
0
 */
//================================================================
/*
hello
world!
study
Java
mysql
null
 */
//=================================================================
/*
java.lang.Object@e580929
java.lang.Object@1cd072a9
java.lang.Object@7c75222b
null
null
 */







