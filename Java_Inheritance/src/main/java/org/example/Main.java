package org.example;


class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("I am flying");
    }
    public void sing(){
        System.out.println("I am singing");
    }
    @Override
    void walk(){
        System.out.println("I am walking");
    }

}

public class Main{

    public static void main(String args[]){

        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

    }
}