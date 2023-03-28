//Write a Java program to illustrate try..catch..finally block.
package Lab10;

class Q2_Exception {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("Result = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
