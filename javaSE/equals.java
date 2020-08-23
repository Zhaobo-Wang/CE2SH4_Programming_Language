package demo3;

public class equals {

    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(a==b);

        MyTime t1 = new MyTime(2008,8,8);
        MyTime t2 = new MyTime(2008,8,8);
        MyTime t3 = new MyTime(2008,8,9);
        //不能直接用==去判断两个object是否相等，因为==比较的是内存地址
        //两个object的内存地址一定不相等
        //我们应该判断它的内容是否相等
        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));
    }
}

class MyTime{
    int year;
    int month;
    int day;

    public MyTime() {
    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object obj) {
        //当年相同，当月相同，当日相同的情况下，两个object 相等
        //写代码的人 定 “什么时候” 算 相等
        //获取第一个日期的年月日；
        int year1 = this.year;
        int month1 = this.month;
        int day1 = this.day;

        //获取第二个日期的年月日
        /*
        int year2 = obj.year;
        int month2 = obj.month;
        int day2 = obj.day;
         */
        //在object里面找不到 year/month/day

        //需要向下转型

        if(obj instanceof MyTime){
            MyTime t = (MyTime)obj;
            int year2 = t.year;
            int month2 = t.month;
            int day2 = t.day;
            if(year1 == year2 && month1 == month2 && day1 == day2){
                return true;
            }
        }
        return false;
    }//默认extends Object class,override method，改变里面的内容
}

