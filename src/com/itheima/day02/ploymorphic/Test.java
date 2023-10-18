package com.itheima.day02.ploymorphic;

public class Test {
    public static void main(String[] args) {
//        普通创建对象
        Cat cat = new Cat();
//        多态创建对象(左边是父类，右边是子类)
        Animal animal = new Cat();
        whatAnimalEat(cat);
        whatAnimalEat(animal);

//        方法的多态性
        cat.catchFish();//捉鱼
        animal.catchFish();//捉鱼


//        属性是没有多态的
        System.out.println(cat.type);//英短
        System.out.println(animal.type);//猫

//        强制转型真实的子类型 ->父转子(可以调用子类的特有方法，是真实的子类对象)
        if (animal instanceof Cat) {
            Cat cat1 = (Cat) animal;
            cat1.climbTree();
        }

//        Dog dog1 = (Dog) animal;//ClassCastException类型强制转换异常
//        学过的异常：1、数组越界异常 IndexOutOfBoundsException
//                  2、算数异常 ArithmeticException
//                  3、类型强制转换异常：ClassCastException
//                  4、空指针异常：NullPointerException


        Dog dog = new Dog();
        Animal animal1 = new Dog();
        whatAnimalEat(dog);
        whatAnimalEat(animal1);
    }

    public static void whatAnimalEat(Animal animal) {
        animal.eat();
    }
}
