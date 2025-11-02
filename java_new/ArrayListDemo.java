import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> ds = new ArrayList<>();
        ds.add(12);
        ds.add(14);
        ds.add(17);
        // 12 14 17

        ds.set(1, 55);
        ds.remove(1);
        System.out.println(ds);
    }
}
