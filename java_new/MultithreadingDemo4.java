class P extends Thread {
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(100);
                System.out.println("I am thread 1 : " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println("Exception Occurred");
            }
        }
    }
}

class Q extends Thread {
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("I am thread 2 : " + Thread.currentThread().getName());
        }
    }
}

public class MultithreadingDemo4 {
    public static void main(String[] args) throws InterruptedException {
        P t1 = new P();
        t1.setName("worker 1");
//        t1.setPriority(1);
        t1.start();
        Q t2 = new Q();
        t2.setName("worker 2");
//        t2.setPriority(10);
        t2.start();

        System.out.println("priority:" + t1.getPriority());

        t1.join();
        t2.join();

        System.out.println("All threads finished working finished");
    }
}
