import java.util.Scanner;

public class ExceptionHandlingDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Oops! Exception Occurred: " + e.getLocalizedMessage());
        } catch (Exception e) {
            System.out.println("Oops! Exception Occurred: " + e.getMessage());
        }

        System.out.println("After exception also I am running");
    }
}
