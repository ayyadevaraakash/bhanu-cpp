import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Set<Integer> ds = new HashSet<>();
//        Set<Integer> ds = new TreeSet<>();
        Set<Integer> ds = new LinkedHashSet<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            ds.add(x);
        }

        System.out.println(ds);
    }
}
