@FunctionalInterface
interface A {
    int add(int a, int b);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        A obj = (int a, int b) -> a + b;
        System.out.println(obj.add(45, 19));
    }
}
