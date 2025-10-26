// ABSTRACT CLASS

abstract class Animal {
    // abstract methods
    abstract void run();
    abstract void swim();

    // regular methods
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    @Override
    void run() {
        System.out.println("Dog is running");
    }

    @Override
    void swim() {
        System.out.println("Dog is swimming");
    }

    void play() {
        System.out.println("Dog is playing");
    }
}

class Cat extends Animal {
    @Override
    void run() {
        System.out.println("Cat is running");
    }

    @Override
    void swim() {
        System.out.println("Cat is swimming");
    }

    void dance() {
        System.out.println("Cat is dancing");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
