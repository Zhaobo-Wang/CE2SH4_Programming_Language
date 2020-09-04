package demo5.array;

public class ArrayPoly {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal[] animals = {a1,a2};//数组中存的是对象的内存地址

        for(int i = 0; i < animals.length; i++){
            /*
            Animal a = animals[i];//Animal 类型数组，每次取得值都是Animal，取出a的值
            a.move();
             */
            animals[i].move();
        }
        
        Animal[] ani = new Animal[2];
        
        ani[0] = new Animal();
        
        ani[1] = new Cat();
        //多态
        //cat是animal的子类，可以放在animal数组中
        
        Animal[] ani2 = {new Bird(),new Cat()};
        for(int i = 0; i < ani2.length; i++){
            /*
            Animal x = ani2[i];
            //取出来的x有可能是cat也有可能是bird，但是一定是一个animal
            x.move();//调用子类override方法
             */

            //调用子类特有方法的话需要向下转型
            if(ani[i] instanceof Cat){

                Cat cat = (Cat) ani2[i];
                cat.catchMouse();

            }else if(ani2[i] instanceof Bird){

                Bird bird = (Bird) ani2[i];
                bird.sing();
            }

        }

    }
}

class Animal{
    public void move(){
        System.out.println("Animal move...");
    }

}

class Cat extends Animal{
    public void move(){
        System.out.println("猫步...");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠...");
    }


}

class Bird extends Animal{
    public void move(){
        System.out.println("bird fly...");
    }

    //特有的方法
    public void sing(){
        System.out.println("鸟儿歌唱...");
    }
}
