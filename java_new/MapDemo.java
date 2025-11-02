import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
//        Map<Integer,String> ds = new HashMap<>();
        Map<Integer,String> ds = new TreeMap<>();
        ds.put(1, "akash");
        ds.put(2, "bhanu");

        System.out.println(ds);
    }
}
