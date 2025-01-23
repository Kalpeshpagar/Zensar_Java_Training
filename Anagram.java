import java.util.*;

public class Anagram {

    public static void isAnagram(String str, String str1) {
        String s1 = str.toLowerCase();
        String s2 = str1.toLowerCase();

        if (s1.length() != s2.length()) {
            System.out.println("Strings are not Anagram");
        } else {
            char[] s3 = s1.toCharArray();
            char[] s4 = s2.toCharArray();

            Arrays.sort(s3);
            Arrays.sort(s4);

            if (Arrays.equals(s3, s4)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }

        }
    }

    public static void main(String[] args) {
        String str = "kalpesh";
        String str1 = "Kalshpe";

        isAnagram(str, str1);
    }
}
