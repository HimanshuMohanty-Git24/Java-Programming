package Lab11;

import java.util.Scanner;
import java.lang.Exception;

class TestClass {
    static void solve(int arr[]) throws Exception {
        int ans = 0;

        for (int i = 0; i < 10; i++)
            for (int j = i + 1; j < 10; j++)
                ans += arr[i] / arr[j];

        throw new MyException(ans);
    }

    public static void main(String args[]) {
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] arr = new int[n];
            in.nextLine();
            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(in.nextLine());

            String s = in.nextLine();
            System.out.println(s.charAt(10));

            solve(arr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid");
        } catch (NumberFormatException e) {
            System.out.println("Format mismatch");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index is invalid");
        } catch (ArithmeticException e) {
            System.out.println("Invalid division");
        } catch (MyException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Exception encountered");
        } finally {
            System.out.println("Exception Handling Completed");
        }
    }
}

class MyException extends Exception {
    private int detail;

    MyException(int a) {
        detail = a;
    }

    public String toString() {
        return "MyException[" + detail + "]";
    }
}