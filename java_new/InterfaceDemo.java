import java.util.Scanner;

interface Shape {
    // Abstract Methods
    void calculateArea();
    void calculateCircumference();

    // Static Methods
    static void work() {
        System.out.println("I am working");
    }

    // Regular Methods
    default void cry() {
        System.out.println("I am crying");
    }
}

class Circle implements Shape {
    @Override
    public void calculateArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int radius = sc.nextInt();
        double area = 3.142*radius*radius;
        System.out.println("Area of circle is: " + area);
        sc.close();
    }
    @Override
    public void calculateCircumference(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int radius = sc.nextInt();
        double circumference = 2 * 3.142 * radius;
        System.out.println("Circumference of circle is " + circumference);
        sc.close();
    }

    void display() {
        System.out.println("I am circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void calculateArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth: ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        double area = length * breadth;
        System.out.println("Area of rectange is: " + area);
        sc.close();
    }
    @Override
    public void calculateCircumference(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth: ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        double circumference = 2 * (length + breadth);
        System.out.println("Circumference of rectange is " + circumference);
        sc.close();
    }

    void dance() {
        System.out.println("I am dancing");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Shape obj = new Rectangle();
        obj.calculateCircumference();
//        Shape.work();
    }
}
