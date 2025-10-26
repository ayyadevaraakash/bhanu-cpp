interface Father {
    default void stayStrong() {
        System.out.println("I am there so stay strong");
    }
    default void giveSupport() {
        System.out.println("I will give support");
    }
}

interface Mother {
    default void giveCare() {
        System.out.println("I will give care");
    }
    default void giveFood() {
        System.out.println("I will give food");
    }
}

class Child implements Father, Mother {
    void playCricket() {
        System.out.println("I am playing cricket");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.giveCare();
    }
}
