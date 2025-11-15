import java.util.function.*;

public class FunctionalInterfaceInbuilt {
    public static void main(String[] args) {
//        Predicate<Integer> isEven = x -> x % 2 == 0;
//        System.out.println(isEven.test(6));

//        BiPredicate<Integer,Integer> isFirstNumberGreater = (a, b) -> a > b;
//        System.out.println(isFirstNumberGreater.test(9, 4));

//        Supplier<String> giveItems = () -> {
//            return "I am a good boy";
//        };
//
//        System.out.println(giveItems.get());

//        Consumer<Integer> car = x -> System.out.println("I consumed " + x + " litres of petrol");
//        car.accept(5);

//        BiConsumer<Integer, Integer> children = (x, y) -> System.out.println("We took " + x + " apples and " + y + " oranges");
//        children.accept(5, 9);

//        Function<Integer, Integer> machine = x -> x + 100;
//        System.out.println(machine.apply(54));

        BiFunction<Integer, Integer, String> child = (x, y) -> {
            return "Addition is " + (x + y);
        };

        System.out.println(child.apply(56, 90));
    }
}
