import java.util.Scanner;

public class ExceptionHandlingDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Oops! Exception Occurred: " + e.getLocalizedMessage());
        } catch (Exception e) {
            System.out.println("Oops! Exception Occurred: " + e.getMessage());
        } finally {
            sc.close();
        }

        System.out.println("After exception also I am running");
    }
}
