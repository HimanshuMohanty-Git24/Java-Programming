//Write a Java program to generate an ArrayIndexOutofBoundsException and handle it using a catch statement.
package Lab10;

class Q3_IndexBoundExp {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[6] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index out of bounds.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
