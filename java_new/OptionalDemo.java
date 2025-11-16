import java.util.HashMap;
import java.util.Optional;

public class OptionalDemo {
    static String databaseOperation(Integer employeeId) {
        HashMap<Integer, String> db = new HashMap<>();
        db.put(1019117, "akash");
        db.put(1011923, "bhanu");
        db.put(1023453, "nagur");

        return Optional.ofNullable(db.get(employeeId)).orElse("Employee not found");
    }

    public static void main(String[] args) {
        String employeeName = databaseOperation(1043785);
        System.out.println(employeeName);
    }
}
