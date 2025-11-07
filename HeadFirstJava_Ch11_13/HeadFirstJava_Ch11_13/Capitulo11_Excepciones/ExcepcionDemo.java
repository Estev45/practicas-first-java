public class ExcepcionDemo {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0; // This will cause an exception
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: You can't divide by zero!");
        } finally {
            System.out.println("This block always runs.");
        }
    }
}
