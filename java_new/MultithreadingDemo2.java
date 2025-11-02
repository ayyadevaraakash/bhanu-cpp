class D implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<1000;i++){
            System.out.println(1);
        }
    }
}

class E implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<1000;i++){
            System.out.println(2);
        }
    }
}

public class MultithreadingDemo2 {
    public static void main(String[] args) {
        D obj = new D();
        Thread t1 = new Thread(obj);
        t1.start();

        E obj1 = new E();
        Thread t2 = new Thread(obj1);
        t2.start();
    }
}
