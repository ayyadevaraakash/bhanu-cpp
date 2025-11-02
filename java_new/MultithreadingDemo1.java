class B extends Thread {
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println("I am thread 1");
        }
    }
}

class C extends Thread {
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println("I am thread 2");
        }
    }
}

public class MultithreadingDemo1 {
    public static void main(String[] args) {
        B t1 = new B();
        t1.setPriority(1);
        t1.start();
        C t2 = new C();
        t2.setPriority(10);
        t2.start();
    }
}
