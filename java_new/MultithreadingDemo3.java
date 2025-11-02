class Android {
    void runCamera(){
        System.out.println("Camera App is running");
    }
}

class Nothing extends Android implements Runnable {
    void runRingtone(){
        for (int i=0;i<1000;i++){
            System.out.println("Ringtone is playing");
        }
    }

    @Override
    public void run() {
        runRingtone();
    }
}

class Samsung extends Android implements Runnable {
    void runUpi() {
        for (int i=0;i<1000;i++){
            System.out.println("Transaction is happening");
        }
    }

    @Override
    public void run() {
        runUpi();
    }
}

public class MultithreadingDemo3 {
    public static void main(String[] args) {
        Nothing o1 = new Nothing();
        Samsung o2 = new Samsung();

        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);

        t1.start();
        t2.start();

        System.out.println("All Threads finished their work");
    }
}
