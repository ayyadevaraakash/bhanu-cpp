import java.util.*;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ds = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        for (int i=0;i<n;i++) {
            ds.add(sc.nextInt());
        }

        // output printing of ds
//        for (Integer x : ds) {
//            System.out.println(x);
//        }

        Stream<Integer> machine = ds.stream();

//        Stream<Integer> machineOne = Stream.of(12, 54, 65, 23, 98);

//        List<Integer> ans = machine.distinct().toList();

//        List<Integer> ans = machine.filter(x -> x>5).sorted().toList();

//        List<Integer> ans = machine.map(x -> x + 1).toList();

//         int ans = machine.filter(y -> y % 2 == 0).reduce(0, (a, b) -> a + b);
        int ans = machine.filter(y -> y % 2 == 0).reduce(0, Integer::sum);

//        int ans = machine.filter(y -> y % 2 == 0).reduce(1, (a, b) -> a * b);

//        machine.filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));
//        machine.filter(x -> x % 2 == 0).forEach(System.out::println);

//        Object[] arr = machine.map(x -> x + 100).toArray();
//        System.out.println(Arrays.toString(arr));

//        int ans = machine.map(x -> x + 100).mapToInt(x -> x).sum();
//        System.out.println(ans);

//        OptionalDouble ans = machine.map(x -> x + 100).mapToInt(x -> x).average();
//        double ans = machine.map(x -> x + 100).mapToInt(x -> x).average().getAsDouble();
//        System.out.println(ans);

//        int ans = machine.map(x -> x + 100).mapToInt(x->x).min().getAsInt();
//        System.out.println(ans);

//        long ans = machine.filter(x -> x%2==0).count();
//        System.out.println(ans);

    }
}
