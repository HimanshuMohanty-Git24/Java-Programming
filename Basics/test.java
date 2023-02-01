// write a program to find the factor of a number
class test {
    public static void main(String args[]) {
        int i, n = 10;
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}