import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();
        System.out.println(A.equals(palindrome(A)) ? "Yes" : "No");
    }

    public static String palindrome(String s) {
       return new StringBuilder(s).reverse().toString();
    }
}
