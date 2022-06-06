import java.util.Scanner;

public class SubstringComparisons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i + k <= s.length(); i++) {
            String ithSubstring = s.substring(i, i + k);
            if(ithSubstring.compareTo(smallest) <= 0) {
                smallest = ithSubstring;
            }
            if(ithSubstring.compareTo(largest) >= 0) {
                largest = ithSubstring;
            }
        }

        return smallest + "\n" + largest;
    }
}
