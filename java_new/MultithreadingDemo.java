class A extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {
        A t1 = new A();
        t1.start();
    }
}
