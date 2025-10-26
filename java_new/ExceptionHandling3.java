class Calculator {
    Calculator(String password) throws Exception {
        if (!password.equals("root")) {
            throw new Exception("You are unauthorized user");
        }
    }

    int add(int a, int b) {
        return a + b;
    }

    int div(int a, int b) throws ArithmeticException {
        return a / b;
    }
}

public class ExceptionHandling3 {
    public static void main(String[] args) {
        Calculator obj = null;
        try {
            obj = new Calculator("bhanu123");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
//        try {
//            obj.div(6, 0);
//        } catch (Exception e) {
//            System.out.println("Exception Handling: " + e.getMessage());
//        }

        System.out.println("Normal Execution is always working");
    }
}
