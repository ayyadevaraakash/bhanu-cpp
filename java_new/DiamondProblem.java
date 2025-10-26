interface FatherDemo {
    default void stayStrong() {
        System.out.println("I am there so stay strong");
    }
    default void giveSupport() {
        System.out.println("I will give support");
    }
    default void giveCare() {
        System.out.println("Father giving care");
    }
}

interface MotherDemo {
    default void giveCare() {
        System.out.println("Mother is giving care");
    }
    default void giveFood() {
        System.out.println("I will give food");
    }
}

class ChildDemo implements FatherDemo, MotherDemo {
    void playCricket() {
        System.out.println("I am playing cricket");
    }
    // Solution 1 - to diamond problem
//    public void giveCare() {
//        System.out.println("No need of care");
//    }

    // Solution 2 - to diamond problem
    public void giveCare() {
        MotherDemo.super.giveCare();
    }
}

public class DiamondProblem {
    public static void main(String[] args) {
        ChildDemo obj = new ChildDemo();
        obj.giveCare();
    }
}
