package Lab11;

import java.util.*;

class Q2_Anagrams {
    static boolean isAnagram(String a, String b) {

        a = a.toLowerCase().replaceAll("\\s", "");
        b = b.toLowerCase().replaceAll("\\s", "");

        if (a.length() != b.length()) {
            return false;
        }

        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        Arrays.sort(aChars);
        Arrays.sort(bChars);

        return Arrays.equals(aChars, bChars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        if (isAnagram(a, b)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
