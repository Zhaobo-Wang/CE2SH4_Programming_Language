[TOC]

## JAVASE

### 01 初了解面向对象

#### 面向过程和面向对象有什么区别？

对于c语言是完全面向过程的

对于c++是一半面向过程，一半是是面向对象

对于Java是完全面对对象的

#### 什么是面向过程？

以我为中心

因为a所以b

因为b所以c

因为c所以d

........

#### 面向过程有什么缺点？

其中a步骤因果关系到b步骤，a和b联合起来是一个子模块，假设其中任何一个因果关系出现问题，此时整个系统都会出现问题

（代码和代码之间的耦合度太高，扩展力太差）

#### 面向过程有什么优点？

对于小型项目，效率较高

#### 什么是耦合度？

螺丝和螺母拧在一起，耦合度高吗？ 这是耦合度低，因为螺丝和螺母可以在拧开（它们之间有接口）

螺丝和螺母焊在一起，耦合度高吗？ 这是耦合度高，因为螺丝和螺母很难在分开

独立显卡是可拆的 耦合度低

集成显卡连在主板上 耦合度高

<u>~~耦合度就是黏连程度~</u>~

#### 什么是面向对象？

以对象为中心，更符合人类的思维方式

人类就是以对象的方式去认识世界的

面向对象就是将现实世界分割成不同的单元，然后每一个单元都是现成对象，然后驱动一下，让各个对象之间协作起来形成一个系统



​		对象“张三”

​		对象“香烟”

​		对象“打火机”

​		对象“抽烟都场所”

​		驱动 模拟一个人抽烟的过程

​		以上任何一个对象都是可以被单独替换掉的

#### 采用面向对象的方式开发一台计算机是怎样？

内存条是一个对象

主板是一个对象

CPU是一个对象

然后这些组装在一起形成计算机

假设其中CPU坏了，我们可以单独进行替换

#### 采用面向过程的方式开发一台计算机是怎样？

所有的部件都是融合在一起的 一体机

任何部分出现问题 必须一起进行修复

#### OOA OOD OOP？

object-oriented analysis：面向对象分析

object-oriented design:  面向对象设计

object-oriented programming: 面向对象编程

实现一个软件的过程

#### 面向对象的三大特征？

封装（encapsulation）

继承（inheritance）

多态（polymorphism）

任何一个面向对象的编程语言都包括这三个特征（python/java...）

### 02 类和对象的概念

什么是class： 是一个“统称”，class描述所有对象的“共同特征信息”

明星

什么是对象：是一个“个体”

杨幂 欧阳娜娜 李沁 都属于 “明星”类

![1206_1](C:\Users\wangz\OneDrive\桌面\Java folder\1206_1.jpg)

**明星类：**

<u>潘长江对象：</u>

名字：潘长江（attribute）

身高：165cm（attribute）

打篮球：非专业（method）

<u>姚明对象：</u>

名字：姚明（attribute）

身高：220cm（attribute）

打篮球：NBA专业球员（method）



```java
//创建一个class

public class Student{
//attribute    
    int student_id;
    String name;
    int age;
    char sex;
    String address;
//变量必须先声明，再赋值才能访问
//对于变量来说，没有手动赋值时，系统默认赋值
/*
    类型            默认值
——————————————————————————
	byte			0
    short 			0
    int				0
    long			0L
    float			0.0F
    double			0.0
    boolean			false
    char			\u0000
    引用数据类型		null
*/
}
```

```java
//创建一个main class 
public class Student_test{
    public static void main(String[] args){
        Student s1 = new Student(110,"张三",19,'M',"哈尔滨王府井");
        //创建object
    }
}
```

#### 基本数据类型和引用数据类型

​                                  ┏数值型         ┳━整数型：byte short int long

​       ┏基本数据类型┫                    ┗━浮点型：float double 

​       ┃                        ┣字符型：char

数据类型╋               ┗布尔型：Boolean 

​       ┃                      ┏类（class）

​       ┗引用数据类  ╋接口（interface）

​                                ┗数组（array）

基本数据类型primitive

引用数据类型reference type

### 03  JVM内存结构

<img src="https://pic1.zhimg.com/v2-a3d1d7f4b1cc4569b46908536609edc4_r.jpg" alt="preview" style="zoom:80%;" />

三个关键区域：

method area	/	heap	/	stacks

stacks: 

栈的活动最频繁，一直压栈弹栈

main方法的活动空间

heap：

凡是通过new运算符创建出来的对象，都储存在堆当中

method area：

方法区是最先有的，因为类最先被加载

#### 对象和引用的区别？

对象是new出来的，在heap内存中储存

引用是:只要这个变量中保存的是一个对象的内存地址，那么这个变量就叫做“引用”

```java
Student s1 = new Student(...);// s1 = 内存地址 （保存在heap当中）
```

![8979](C:\Users\wangz\OneDrive\桌面\Java folder\8979.PNG)

#### 画内存图结构

先给一个程序， 然后根据程序，模拟出JVM的工作模式

————————————————————————————————————————————————————————————

```java
public class Address{
	String city;
    String street;
    String zipcode;
}
```

```java
public class User{
    int id;
    String username;//引用数据类型
    Addresss addr;//引用数据类型
}
```

```java
//JVM 执行步骤
//第一步：class加载
//第二步：调用test类的main方法（调用方法要push stack）
public class Test{
    public static void main(String[] args){
        Address a = new Address();
        a.city = "北京";
        a.street = "大兴区长安街";
        a.zipcode = "450001";
        User u = new User();
        System.out.println(u.id);//0
        System.out.println(u.username);//null
        System.out.println(u.addr);//null
        u.id = 111;
        u.addr = a;
        System.out.println(u.addr.city);//北京
    }
}
```

![23223](C:\Users\wangz\OneDrive\桌面\Java folder\23223.PNG)

#### 空指针异常

```java
public class NullPointerTest{
    public static void main(String[] args){
        Customer c = new Customer();// c 访问了一个类型地址 = 0x1234
        System.out.println(c.id);
        
        c.id =  9521;
        System.out.println(c.id);
        
        c = null;//此时 c 不保存任何内存地址了
        System.out.println(c.id);//报错，空指针异常
    }
}

class Customer{
    int id;
}
```

#### 方法调用

```java
public class Test1{
    public static void main(String[] args){
        int i = 10;
        add(i);
        System.out.println("main方法中的i---->"+i);
        //run结果 
        //add方法中的i是11 
        //main方法中的i是10
    }
    public static void add(int i){
        i++;
        System.out.println("add方法中的i---->"+i);
    }
}
```

```java
/*
java 中 关于方法调用时参数传递实际上只有一个规则：
不管你是基本数据类型，还是引用数据类型，实际上在传递的时候都是将变量中保存的那个“值”复制一份，传过去
*/
public class Test2{
    public static void main(String[] args){
        Person p = new Person();
        p.age = 10;
        add(p);
        System.out.println("main方法中的age---->"+p.age);//11
    }
    public static void add(Person p){
        p.age++;
        System.out.println("add方法中的age---->"+p.age);//11
    }
}

class Person{
    int age;
}
```

### 04 构造方法constructor

```java
/*
构造方法是用来创建对象，并且给对象属性赋值的（没有手动赋值，系统会赋默认值）

default constructor: 当一个类没有提供任何构造方法，系统会提供一个无参数的构造方法
如果手动提供了constructor，那么系统将不在提供default constructor
可以调用default construtor和overload constructor

constructor语法结构：
[修饰符列表] ConstructorName（Parameter）{
		Body;
}
注意：
1.修饰符统一用 public
2.ConstructorName 必须和ClassName保持一直
*/
public class User{
    int id;
    String name;
    int age;
    
    public User(){ 
/*
无参constructor里面的默认初始化代码
	id = 0;
	name = null;
	age = 0;
*/
    }
    //overload constructor
    public User(){
        
    }
    
}

public class ConstructorTest{
    public static void main(String[] args){
        User s1 = new User();
        
        System.out.println(s1);
    }
}
```

### 05 封装（encapsulation）

#### 什么是封装？

现实生活中，比如手机，电视机，照相机，这些外部都有一个壳，封装起来保护内部的部件，保证内部的部件是安全的。另外封装了以后，对于我们使用者来说，我们是看不见内部的复杂结构的，我们也不需要关心内部有多么复杂，

#### 封装有什么用？

保证内部结构的安全

屏蔽复杂，暴露简单（来保证数据的安全性）

```java
//怎么进行封装？
//1. 属性私有化（private）
//2. 对外提供简单的访问入口（一个attribute对应get and set 方法，set方法可以修改attribute的值，get方法来返回值）
public class Person{
    
    private int age;//private 表示私有，只有在这个class才能访问
    
    public Person(){
        
    }
    
    public int getAge(){
        return age;
    }//get方法专门用来读取attribute的值
    public void setAge(int newAge){
        if(newAge < 0 || newAge > 150){
            System.out.println("not available");
        }
        age = newAge;
    }//set方法专门用来改attribute的值
}
/*
public type getName(no parameter){
	return xxx;
}
***get 里面没有任何的 parameter 因为 你不需要给他 set 值*** 它只会return一个值
public type setName(one parameter){
	xxx = parameter;
}
***set里面有parameter因为你需要给他set值***
*/
public class PersonTest{
    public static void main(String[] args){
        Person p1 = new Person();
        
        int p1_age = p1.getAge();
        System.out.println(p1_age); // return 0
        
        p1.setAge(20);
        System.out.println(p1_age);// return 20
        System.out.println(p1.getAge());//return 20
        
        p1.setAge(-100);
        System.out.println(p1.getAge());//return not available
    }
}
```

### 06 static 关键字

static 被翻译成“静态的”

****所有static修饰的，都是采用“类名.”都方式访问

static修饰的变量：静态变量

static修饰的方法：静态方法

#### 变量的划分？

变量根据声明的位置进行划分：

在方法体当中声明的变量叫做：局部变量 local variable

在方法体外声明的变量叫做：成员变量 member variable

成员变量又可以分为：

实例变量 instance variable

静态变量 static variable

![6565](C:\Users\wangz\OneDrive\桌面\Java folder\6565.PNG)

```java
class VarTest{
    
    //成员变量中的实例变量 instance variable
    int i;
    //实例方法 instance method
    public void m2(){
        int x = 20; //局部变量 local variable
    }
    
    //*******以上实例的，都是和对象本身相关的，访问时采用“引用.”的方式访问。需要先new对象。
    
    //成员变量中的静态变量 static variable，静态变量不会产生 空指针异常
    static int k;
    //静态方法 static method
    public static void m1(){
        int y = 30; // 局部变量 local variable
    }

    
    //*******以上静态的，都是和class本身相关的，访问时采用“className.”的方式访问。不需要new对象。

}
```

#### 什么时候变量声明为instance variable，什么时候变量声明为static variable？

如果这个类型的所有对象的某一个属性都是一样的，不建议定为instance variable，浪费内存空间，建议定为static variable，在方法区中只保留一份，节省内存开销。

```java
public class StaticTest{
    public static void main(String[] args){
        Chinese c1 = new Chinese("1234444","张三","中国");
        Chinese c2 = new Chinese("2334545","李四","中国");
        
        System.out.println(Chinese.country);
        //访问Chinese class的国籍
        //静态变量应该使用类名.的方式进行访问
        
        System.out.println(c1.idCard);//1234444
        System.out.println(c2.name);//李四
        System.out.println(c1.country);//也可以采用 引用.的方式进行访问，但不建议
    }
}


//定义一个类：中国人
class Chinese{
    String idCard; // 每个人的身份证号不同 instance variable
    
    String name;//每个人的姓名不同 instance variable
    
    static String country = "中国";//中国人的国籍都相同是一个固定值,可以使用静态变量
    //静态变量 不需要new对象 在class加载的时候初始化，静态变量的空间就开出来了
    
    public Chinese(){
        
    }
    
    public Chinese(String s1, String s2, String s3){
        idCard = s1;
        name = s2;
        country = s3;
    }
}
```

#### 当变量是实例变量instance variable，内存是怎样的？

![453](C:\Users\wangz\OneDrive\桌面\Java folder\453.PNG)

#### 当变量是静态变量的时候，内存是怎样的？

![565](C:\Users\wangz\OneDrive\桌面\Java folder\565.PNG)

#### 关于instance method 和 static method的访问

```java
public class StaticTest{
    public static void main(String[] args){
        staticTest.doSome();
        
        StaticTest st = new StaticTest();
        st.doSome();
        st.doOther();
    }
    //静态方法（不需要new对象，直接使用”类名.“来访问）
    public static void doSome(){
        System.out.println("静态方法执行了");
    }
    
    //实例方法（需要new对象，使用”引用.“来访问）
    public void doOther(){
        System.out.println("实例方法执行了");
    }
}
```

#### 什么时候声明static method 什么时候声明为instance method？

如果说该行为必须由对象去触发，那么该方法定义为instance method

如果说该方法不需要new对象，那么该方法定义为static method

```java
public class StaticTest{
	public static void main(String[] args){
		User u1 = new User();
        u1.printName();
	}
}

class User{
	private int id;
    private String name;
	
	public void SetId(int i){
		id = i;
	}
	
	public int getId(){
		return id;
	}
    
    public void printName(){
        System.put.println(name);
    }
}
```

#### 静态代码块

在类加载的时候执行，并且在main方法执行之前就执行

静态代码块按照自上而下的顺序执行

```java
public class StaticTest{
	static{
		System.out.println("A");
	}
    static{
        System.out.println("B");
    }
	public static void main(String[] args){
		System.out.println("Hello World");
	}
    static{
        System.out.println("C");
    }
    /*
    return 
    A
    B
    C
    Hello World
    
    */
}
```

```java
public class StaticTest{
    
    static int i =100;
    
    static{
        
        System.out.println("i = "+i);
        
    }//可以访问i，静态代码块可以访问static variable
    
    public static void main(String[] args){
        
    }
}
```

### 07 this关键字

this 存储在堆（heap）当中

this代表的是当前对象的内存地址

this只能使用在instance method 当中,代表的是 “当前对象”



```java
public class thisTest{
    
    public static void main(String[] args){
        
        Customer c1 = new Customer("张三");
        Customer c2 = new Customer("lisa");
        
        c1.shopping();//c1调用了method --->this就是c1
        c2.shopping();//c2调用了method --->this就是c2
    }
}


class Customer{
    
    String name;//实例变量（必须才用“引用.”的方式去访问）
    
    public Customer(){
        
    }
    public Customer(String s1){
        name = s1;
    }
    
    public void shopping(){
        //这里的this是谁？ this指的是“当前对象”
        System.out.println(this.name + " is on shopping!");
    }
}
```

#### this什么时候不能省略？

```java
public class thisTest{
	public static void main(String[] args){
        Student n1 = new Student(112,"jimbo"); 
    }
}
class Student{
    private int no;
    private String name;
    
    public student(){
        
    }
    public student(int no, String name){
        this.no = no;//本类中的no 等于 main method里面的overload constructor 赋的值
        this.name = name;
        //this 在这里面区分实例变量和局部变量（name为local variable/ this.name为instance variable）
        
    }
    
    public int getNo(){
        return no;
    }
    public void setNo(int no){
        this.no = no;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String a){
        name = a;
    }
}

```

#### this除了可以用在instance method 中，还可以用在构造方法中

```java
public class ThisTest{
	public static void main(String[] args){

}
}

class Date{
 private int year;
 private int month;
 private int day;
 
 public Date(){
     /*
 	this.year = 1970;
    this.month= 1;
    this.day  = 1;
    */
     this(1970,1,1);//和上面效果一样 this（）调用另外一个constructor
     //this（）只能出现在constructor的第一行
 }
 public Date(int year, int month, int day){
     this.year = year;
     this.month = month;
     this.day = day;
 
 }
 public void setYear(int year){
 	this.year = year;
 }
 public int getYear(){
     return year;
 }
public void setMonth(int month){
    this.month = month;
}
public int getMonth(){
    return month;
}
public void setDay(int day){
    this.day = day;
}
public int getDay(){
    return day;
}
}
```

### 08 继承 inheritance

#### 继承的作用

基本作用：子类继承父类，代码可以得到复用

重要作用：因为有了继承关系，才有了后期的方法覆盖和多态机制

#### 继承的相关特性

1）class [子类名（subclass）] extends [父类名（superclass）]

​	class B extends A

2）Java中只支持单继承，不支持多继承

3）父类可以有多个子类

class B extends A

class C extends A

4）Java中规定，子类直接继承父类，除constructor不能继承之外，剩下的都可以继承

5）Java中，所有的类都是默认继承object类

```java
//代码过于臃肿
class Account{
    private int act_no;
    private double balance;
    public Account(){
        
    }
    public Account(int act_no, double balance){
        this.act_no = act_no;
        this.balance = balance;
    }
    public void setAct_no(int act_no){
        this.act_no = act_no;
    }
    public int getAct_no(){
        return act_no;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    
}

class CreditAccount{
    private String act_no;
    private double balance;
    private double credit;
    
    public CreditAccount(){
        
    }
    public Account(int act_no, double balance){
        this.act_no = act_no;
        this.balance = balance;
    }
    public void setAct_no(int act_no){
        this.act_no = act_no;
    }
    public int getAct_no(){
        return act_no;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setCredit(double credit){
        this.credit = credit;
    }
    public double getCredit(){
        return credit;
    }
}
```

```java
//利用继承解决上面代码过于臃肿的问题
class Account{
    private int act_no;
    private double balance;
    public Account(){
        
    }
    public Account(int act_no, double balance){
        this.act_no = act_no;
        this.balance = balance;
    }
    public void setAct_no(int act_no){
        this.act_no = act_no;
    }
    public int getAct_no(){
        return act_no;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    
}
class CreditAccount extends Account{
     
    private double credit;
    public CreditAccount(){
        
    }
    public void setCredit(double credit){
        this.credit = credit;
    }
    public double getCredit(){
        return credit;
    }
    
}
```

#### 子类继承之后可以使用子类调用父类的方法吗？

当然可以，本质上，子类继承父类之后，是将父类继承过来的方法归为自己所有。实际上调用的也不是父类的方法，是他子类自己的方法（因为已经继承过来了）

```java
public class Extends{
	public static void main(String[] args){
        Cat c = new Cat();
        c.move();
    }
}

class Animal{
    String name;
    
    public void move(){
        System.out.println(name + "正在移动");
    }
}

//cat 继承 animal，会将animal中的东西都继承过来
//相当于把animal里的东西都复制一份到cat中
class Cat extends Animal{
    
}
```

#### 在实际开发中，满足什么条件，可以使用继承？

凡是采用 “is a”能描述的，都可以继承

例如：

Cat is a Animal ;

Dog is a Animal ;

Credit_Account is a Account;

### 09 方法覆盖 override

#### 什么时候我们会考虑用override？

子类继承父类。当继承过来的方法无法满足子类的业务需求时，子类有权利对这个方法进行重新编写

#### 重要结论

当子类对父类继承过来方法进行override后，一定执行override的方法

#### 什么条件满足后构成方法重写override？

条件一：两个类必须要有继承关系

条件二：override重写之后和之前方法具有相同的：

​				返回值类型

​				方法名

​				形式参数列表

条件三：访问权限不能更低，可以更高

条件四：重写之后的方法不能比之前抛出更多的异常，可以更少

#### override的注意事项

override只针对method，和attribute无关

private method无法override

构造方法不能被继承，进而无法override

override只针对于实例方法，静态方法覆盖没有意义

```java
/*
当前程序最大的设计问题？
Bird class extends Animal class 所以 它也继承了Animal的move方法，可是move方法里输出的结果“动物在移动”不够具体，单指鸟儿可以变为“鸟儿在飞翔”
*/

public class Override{
    public static void main(String[] args){
    	
        Bird b = new bird();
        b.move();//return：动物在移动
    }
}

class Animal{
    public void move(){
        System.out.println("动物在移动");
    }
}

class Bird extends Animal{
    //子类继承过来的method不能满足子类的业务需求
}
```

```java
//用override 改进
public class Override{
    public static void main(String[] args){
    	
        Bird b = new bird();
        b.move();//return：鸟儿在飞翔
    }
}

class Animal{
    public void move(){
        System.out.println("动物在移动");
    }
}

class Bird extends Animal{
    @override
    public void move(){
        System.out.println("鸟儿在飞翔");
    }   //对move方法进行方法覆盖
    //最好将父类方法copy 过来
}
```

### 10 方法重载 overload

#### 什么时候考虑使用重载overload？

当在一个类当中，如果功能相似的话，建议将名字定义成一样的，这样代码美观，并且方便编程

#### 什么条件满足后构成方法重载overload？

条件一：在同一个类中

条件二：方法名相同

条件三：参数列表不同（个数，顺序，类型）

### 11 多态（polymorphism）

#### 普及两个概念 在多态学习之前

第一个：向上转型(upcasting)

子---->父（自动类型转换）

第二个：向下转型(downcasting)

父---->子（强制类型转换，需要加instanceof）

无论是哪个，必须要有继承关系



```java
//为下面的多态code搭建三个class

public class Animal{
    public void move(){
        System.out.println("动物在移动");
    }
}

public class Cat extends Animal{
    @override
    public void move(){
        System.out.println("猫在走猫步");
    } 
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}

public class Bird extends Animal{
     @override
     public void move(){
        System.out.println("鸟儿在飞翔");
    }       
}

```

#### 多态的基础语法

想要理解多态从两个方面：静态绑定阶段（编译阶段）和 动态绑定阶段（运行阶段）

每一个阶段都需要通过————>才能产生多态

```java
/*
        Animal 和 cat之间有继承关系：
        cat is a Animal
        父类 name = new 子类（）;
        父类型的引用指向子类对象
*/
Animal a2 = new Cat();//底层对象是一只猫，向上转型
a2.move();//return 猫在走猫步
  
//******多态
//真正参与的是cat对象，所以会调用cat当中的move方法
        
编译阶段 编译器只知道a2是animal，所以在检查语法的时候会去animal.class文件当中找到move（）方法，绑定move（）方法编译通过，静态绑定成功
运行阶段 在heap中创建的java对象是cat对象，所以move的时候，真正参与move的对象是猫，会动态执行cat对象的move（）方法
    
```



#### 多态：当子类中特有的方法在父类中没有的时候

```java
Animal a5 = new Cat();
a5.catchMouse();
//***运行不出来，编译不过因为在编译阶段只知道a5是animal所以会上animal中找catchMouse（），但是找不到
```



#### 什么时候向下转型？

```java

//如果非得抓老鼠呢？ 这个时候必须使用向下转型
        
Animal a5 = new Cat();//a5编译时animal
        
Cat x = (Cat)a5;//用转换符（Cat）将a5强制转换为cat
        
x.catchMouse();
        
```



#### 向下转型有风险吗？

因为父类转子类，可能一个父类有很多个子类，转成具体是哪个需要判断一下

```java
Animal a6 = new Bird();
Cat y = (Cat)a6;
y.catchMouse();

//a6根本都不是一个cat 这个转型产生问题
//java.lang.classcastexception:类型转换异常

```

#### instanceof 运算符

instanceof 可以在**运行阶段动态判断**引用指向的对象的类型

instanceof的语法：

instanceof运算符的结果只能是：true/false

c是一个引用，c变量保存了内存地址中heap的对象

假设（c instanceof Cat）为true表示：c引用指向的heap中的java对象是一个cat

​		（c instanceof Cat）为false表示：c引用指向的heap中的java对象不是一个cat

```java
/*
if(a6是一个cat的时候){
	Cat y = (Cat)a6;
    y.catchMouse
}
如果a6是一个猫，我就把它转成猫
*/
//向下转型，必须加instanceof关键字
if(a6 instanceof Cat){
    Cat y = (Cat)a6;
    y.catchMouse();
}
```

#### 多态在开发中的作用

多态会增加后期的扩展性,降低程序的耦合度

尽量去抽象

```java
class Dog extends Animal{
    public void eat(){
        System.out.println("Dog is eating");
    }
}
```

```java
class Cat extends Animal{
	public void eat(){
		System.out.println("Cat is eating");
	}
}
```

```java
class Animal{
	public void eat(){
		System.out.println("Animal is eating");
	}
}
```

```java
class Master{
    public void feed(Animal a){       
        a.eat();
    }
}
```

```java
public class Test{
	public static void main(String[] args){
		Master m1 = new Master();
		Animal a1 = new dog();
		m1.feed(a1);
	}
}
```

#### Example

```java
/*
编写程序实现乐手弹奏乐器。可以弹二胡，钢琴，小提琴
*/
public class Example{
    public static void main(String[] args){
        Musician m = new Musician();
        Erhu a = new Erhu();
        m.play(a);
        
    }
}

class Musician{
    public void play(Instrument a){// 多态： Instrument a = new Erhu();
        a.sound();
    }
}

class Instrument{
    public void sound(){        
    }
}
class Erhu extends Instrument{
    @override
    public void sound(){
        System.out.println("Erhu's sound");
    }    
}
class Piano extends Instrument{
    @override
    public void sound(){
        System.out.println("Piano's sound");
    }    
}
class Violin extends Instrument{
    @override
    public void sound(){
        System.out.println("Violin's sound");
    }
}
```

### 12 super关键字

this只能出现在实例方法中和构造方法中

super只能出现在实例方法中和构造方法中

super只能出现在构造方法的第一行，通过当前的构造方法调用父类中的构造方法

#### 重要结论

当一个构造方法第一行：

既没有this（）又没有super（）的话，默认会有一个super（）

表示通过当前子类的构造方法调用父类的无参数构造方法

所以必须保证父类的无参数构造方法是存在的

```java
public class SuperTest{
    public static void main(Stringp[] args){
        
        new B();
        /*return ： 
        A constructor
        B constructor
        */
    }
}

class A{
    public A(){
        System.out.println("A constructor");
    }
}
class B extends A{
    //自动有一个super（） 模拟现实生活中：要想有儿子得先有父亲
    public B(){
      //super();  
        System.out.println("B constructor");	
    }
}
```

```java
public class SuperTest{
    public static void main(String[] args){
        new C();
    }
}

class A{
    public A(){
        System.out.println("1");
    }
}

class B extends A{
    public B(){
        System.out.println("2");        
    }
    public B(String name){
      //super();  
        System.out.println("3");
    }
}

class C extends B{
    public C(){
        this("zhangsan");
        System.out.println("4");        
    }
    public C(String name){
        this(name,20);
        System.out.println("5");        
    }
    public C(String name, int age){
        super(name);
        System.out.println("6");        
    }
}
//run: 13654
```

#### 在恰当的时间使用super

```java
public class SuperTest{
    public static void main(String[] args){
        CreditAccount ca1 = new CreditAccount();
        CreditAccount ca2 = new CreditAccount();
    }
}
class Account{
    private int act_no;
    private double balance;
    public Account(){
        
    }
    public Account(int act_no, double balance){
        this.act_no = act_no;
        this.balance = balance;
    }
    public void setAct_no(int act_no){
        this.act_no = act_no;
    }
    public int getAct_no(){
        return act_no;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    
}
class CreditAccount extends Account{
     
    private double credit;//诚信值，子类特有属性
    //继承过来 需要自己编写constructor
    public CreditAccount(){
    }

    public CreditAccount(int act_no, double balance, double credit){
		super(act_no, balance);
        this.credit = credit;
    }
    
    public void setCredit(double credit){
        this.credit = credit;
    }
    public double getCredit(){
        return credit;
    }
    
}
```

#### super总结

super. Attribute 【访问父类的属性】

super（实参）【调用父类的构造方法】

### 13 异常exception

#### 什么是异常，异常机制有什么用？

```java
public class ExceptionTest{
    public static void main(String[] args){
        int a = 10;
        int b = 0;
        int c = a/b;//实际上，JVM会new异常对象：ArithemeticException(“/by zero”);
        System.out.println(c);//java提供了异常信息，在控制台上面；这样方便修改完善
        // Exception in thread "main" java.lang.ArithemeticException
        //JVM 打印出来异常
    }
}
```

#### Java 语言中，异常以什么形式存在？

异常在java中以类存在，每一个异常类都可以创建异常对象

```java
public class ExceptionTest{
    public static void main(String[] args){
        
        NumberFormatException nfe = new NumberFormatException("数字格式化异常发生了");
        System.out.println(nfe);
        
        NullPointerException npe = new NullPointerException("空指针异常发生了");
        System.out.println(npe);        
    }
}
```

#### 异常对应的现实生活是怎样？

火灾（异常类）：

2008.1.1 小明家着火了（异常对象）

2008.1.2 小刚家着火了（异常对象）

2008.1.3 小红家着火了（异常对象）

#### JAVA的异常处理机制

什么是UML？有什么用？

UML是一种统一建模语言

在UML途中可以描述类和类之间的关系，程序执行的流程，对象的状态等等

![exceptionUML](C:\Users\wangz\OneDrive\桌面\Java folder\exceptionUML.png)

runtime exception：是在运行时异常，编写阶段可以处理也可以不处理

编译时异常，在编写程序的时候对该异常进行预处理

#### JAVA对异常处理使用两种方式

第一种方式：throws关键字，抛给上一级（谁调用我我就抛给谁）

第二种方式: 使用try..catch语句进行异常的捕捉

example：

我是公司的小职员，因为我的失误，导致公司损失1000元（异常发生）

两种处理方式：

第一种方式：告诉领导（异常上抛）

第二种方式：自己掏钱（异常的捕捉）

JAVA中如果异常一直上抛，抛给了调用者，调用者抛给main，main抛给jvm，程序只能终止

```java
public class ExceptionTest{
    public static void main(String[] args) throws ClassNotFoundException{
        doSome();
        //编译器报错信息：
    }
    
    public void doSome() throws ClassNotFoundException{
        
    }
}
```

```java
public class ExceptionTest{
    public static void main(String[] args){
        
        try{
            doSome();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
                
    }
    
    public void doSome() throws ClassNotFoundException{
        
    }
}
```

```java
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println("main begin");
        m1();
        System.out.println("main over");
    }

    private static void m1(){
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }

    private static void m2(){
        System.out.println("m2 begin");
        try {
            m3();//这里需要对异常进行处理,因为m3对异常throw了
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在，可能是路径错误");
        }
        System.out.println("m2 over");
    }

    private static void m3() throws FileNotFoundException {
        new FileInputStream("C:\\Users\\wangz\\OneDrive\\桌面\\everything");
    }

    /*
    报错的原因是什么？
    第一：这里调用了一个构造方法：FileInputStream（String name）
    第二：这个构造方法的声明位置上有：throws FileNotFoundException
    第三：通过类的继承结构：FileInputException父类是IOException，IOException的父类是Exception
    最终知道，FileNotFoundException是编译时异常
        public FileInputStream(String name) throws FileNotFoundException {
        this(name != null ? new File(name) : null);
    }

     */
}

```

#### 异常在实际开发中的实例

##### Example 01

```java
/*
编写程序：使用一维数组，模拟栈数据结构
要求：
1.这个栈可以存储java中任何引用类型的数据
2.在栈中提供push方法模拟压栈（栈满了 有提示信息）
3.在栈中提供pop方法模拟弹栈（栈空了 也有提示信息）
4.编写测试程序，new栈对象，调用push pop方法来模拟压栈弹栈的动作
5.假设栈的默认初始化容量为10
 */

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

    public void push(Object ele) throws MyStackOperationException{
        //这是一个压栈的方法
        if(this.index >= this.elements.length - 1 ){
            /*输出一句话 太低级
            System.out.println("栈已满程序结束，压栈失败");
            return;
            */
            MyStackOperationException e = new MyStackOperationException("压栈失败,栈已满");
            throw e;
            //创建异常对象，然后手动将异常抛出去
        }
        //程序能走到这里说明栈没满
        this.index++;//栈帧向上移动一个位置，当向栈中
        this.elements[index]  = ele;//index最新指向的位置，就是它的index位置
        System.out.println("压栈"+ ele + "成功，栈帧指向" + index);

    }

    //弹栈的方法，从数组中往外取元素
    public void pop() throws MyStackOperationException{

        if (index < 0) {
            /*
            System.out.println("弹栈失败，栈已空");
            return;
            */
            MyStackOperationException e = new MyStackOperationException("压栈失败,栈已空");
            throw e;
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
```

```java

public class ArrayProblem01 {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        //创建一个栈对象，初始化容量为10个元素
        //调用方法压栈、
        try{
        stack.push("abc-2");
        stack.push("abc-1");
        stack.push("abc0");
        stack.push("abc1");
        }catch(MyStackOperationException e){
            System.out.println(e.getMesssage());
        }

        //调用方法弹栈，往外弹，返回ele
        stack.pop();
        stack.pop();
//try..catch 捕捉异常
    }

}

```

```java
//栈操作异常
public class MyStackOperationException extends Exception{
    public MyStackOperationException(){
        
    }
    public MyStackOperationException(String s){
        super(s);
    }
}
```

##### Example 02

```java
/*
编写程序模拟用户注册：
1.在程序开始执行时，提示用户输入“用户名”和“密码”信息
2.输入信息之后，后台java程序模拟用户注册
3.注册时用户名要求长度在【6-14】之间，小于或大于都是表示异常
注意：
完成注册的方法放到一个单独的类中
异常类自定义即可

class UserService{
    public void register(String username,String password){
    //这个方法中完成注册
    }
}

编写main方法，在main方法中接收用户输入的信息，在main方法中调用userservice的register方法完成注册
*/

```

```java
/*
用户业务类，处理用户的相关业务，例如登录，注册等功能
*/
public class UserService{
    public void register(String username,String password) throws illegalException{
        if(username == null || username.length() < 6 || username.length() > 14){
            //System.out.println("用户名不合法，长度必须在6-14之间");
            throw new illegalException("用户名不合法，长度必须在6-14之间");
        }
        System.out.println("用户名合法，欢迎"+username);
    }
}
```

```java
//创建异常类
public class illegalException extends Exception{
    public illegalException(){
        
    }
    
    public illegalException(String s){
        super(s);
    }
}
```

```java
public class Test{
    public static void main(String[] args){
        try{        
            userService.register(jack, 123);            
        }catch(illegalException e){
            System.out.println(e.getMessage());
        }

    }
}
```

### 14 集合 set（没有写完）

#### 什么是集合？

集合实际上就是一个容器可以容纳其他类型的数据

#### 集合为什么在开发中很多使用？

集合是一个容器，是一个载体，可以一次容纳多个对象，

集合不能直接存储基本数据类型，不能直接存储java对象

集合中任何时候存储的都是引用（内存地址）

集合中可以套集合

在java中每一个不同的集合，底层会对应不同的数据结构

```java
new ArrayList(); 创建一个集合，底层是数组
new LinkedList(); 创建一个集合对象，底层是链表
new TreeSet(); 创建一个集合对象，底层是二叉树
```

### 15 linked list 链表

对于链表数据结构：

基本的单元是节点node

对于单向链表来说，任何一个节点都有两个属性

第一：存储的数据 	第二：下一节点的内存地址

```java
public class Node{
    /*
    单链表中的节点：
    节点是单向链表中最基本的单元
    每一个节点node都有两个属性：
    存储的数据
    下一个节点的内存地址
    */
    Object element;
    
    Node next;
    
    int size = 0;
    
    public Node(){
        
    }
    public Node(Object element, Node next){
        this.element = element;
        this.next = next;
    }
    
    public int size(){
        return size;
    }
}
```

```java
public class SingleLink{
	
	Node header = null;
	
	public void add(Object obj){
	//创建一个新的节点对象
    //让之前的单链表的末尾节点next指向新节点对象
    //有可能是第一个，也可能是第二个
        if(header == null){//说明还没有对象
            //new一个节点对象，作为节点对象
            header = new Node(data, null);//既是头节点，又是末尾节点
        }else{
            //说明头不是空
            //找出当前末尾节点，让当前末尾节点的next是新节点
            Node currentLastNode = findLast(header);
            currentLastNode.next = new Node(data, null); //找到最后一个节点的next即为新加的node
        }
        size++;
	}
    
    private Node findLast(Node node){
        if(node.next == null){//如果一个节点的next是null，说明这个节点就是末尾节点
            return node;
        }
        //程序能到这里说明node不是末尾节点
        return findLast(node.next);//递归算法！
    }
	
	public void remove(Object obj){
	
	}
	
	public void modify(Object newObj){
	
	}
	
	public int find (Object obj){
		return index;
	}
}

public class Test{
    public static void main(String[] args){
        List list = new SingleLink();
        list.add("a");
        list.add("b");
        list.add("c");
        
        for(int i = 0 ; i < list.size(); i ++){
            Object obj = list.get(i);
            System.out.println(obj); 
        }
    }
}
```

![jkj](C:\Users\wangz\OneDrive\桌面\Java folder\jkj.PNG)

#### single list 和 double list code

```java
class LinkedListNode{
    int value;
    LinkedListNode next;
    
    public LinkedListNode(int value, LinkedListNode next){
        this.value = value;
        this.next = next;
    }
}
```



```java
class SingleLinkedList{
    LLNode head;
    
    public SingleLinkedList(LLNode h){
        head = h;
    }
    
    public void traverse(){
        LLNode indx = head;
        while(indx != null){
            System.out.println(indx.value);
            indx = indx.next;
        }
    }
    
    public void insertAtFirst(int value){
        
        LinkedListNode newN1 = new LinkedListNode(value, head);
        head = newN1;
        
    }
    
    public void insertAfterValue(int val, int target){
         
        LinkedListNode newN1 = new LinkedListNode(value, null); 
        LinkedListNode indx = head;  
        while(indx != null){
            //find the node you want to addTarget  
            if(indx.value == target){
                //add
                 newN1.next = indx.next;
                 indx.next = newN1;
                 return;
            }
             
            indx = indx.next;
        }
        // I did not find target
        System.out.println("Target did not exist");
    }
    
    public void deleteTarget(int target){
        
        LinkedListNode indx = head;  
        
        
        //special case1: target is at head
        if(head.value ==target){
            head = head.next;
            return;
        }
        
        //this is the normal case
        // it also handles empty lists
        while(indx != null){
             //find the node you want to deleteTarget
            if(indx.next.value == target){
                // delete
                indx.next = indx.next.next;

                 return;
            }
             
            indx = indx.next;
        } 
        
            // I did not find target
        System.out.println("Target did not exist");
    
    }
    
    
}
```

![1210_1](C:\Users\wangz\OneDrive\桌面\Java folder\1210_1.jpg)