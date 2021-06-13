package com.tippy;

public class Person {

    String name;
    float weight;
    float height;

//    多建構子 -> Overloading (多載)
    public Person(){
        System.out.println("無參數建構子");
    }

    public  Person( float weight , float height ){
        this.weight = weight;
        this.height = height;
        System.out.println("float weight , float height 建構子");
    }

    public Person( String name , float weight , float height){
//        使用上方建構子時，須放在第一行
        this(weight, height);
        this.name = name;
        System.out.println("String name , float weight , float height 建構子");
    }


    public void detail(){
        System.out.println("My name is " + this.name);
        System.out.println("My weight is " + this.weight);
        System.out.println("My height is " + this.height);
    }

    public void hello(){
        System.out.println("Hello Word !!");
    }
}
