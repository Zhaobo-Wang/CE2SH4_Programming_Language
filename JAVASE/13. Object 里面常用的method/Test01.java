package git;

import java.util.Objects;

public class Test01 {
    public static void main(String[] args) {

        int a = 10;
        int b = 10;
        System.out.println(a == b);

        Student s1 = new Student(36,"六十九中学");
        Student s2 = new Student(36,"六十九中学");
        System.out.println(s1.equals(s2));

        String s3 = new String("haha");
        String s4 = new String("haha");

        System.out.println(s3.equals(s4));
        
        // 大结论：
        // 问：java中什么类型数据可以用“==”去判断？
        // 答：java中所有的基本数据类型比较 可以用“==”去判断是否相等
        // 问：java中什么数据类型需要使用equals去判断
        // 答：java中所有的引用数据类型统一使用equals方法来判断是否相等
    }
}

class Student{
    int number;
    String school;

    public Student() {
    }

    public Student(int number, String school) {
        this.number = number;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", school=" + school +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return number == student.number &&
                school.equals(student.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, school);
    }
}

