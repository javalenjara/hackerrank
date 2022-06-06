import java.util.Arrays;
import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        final String[] sSplitted = s.split("[\\s!,?._'@]+");
        if (Arrays.stream(sSplitted).anyMatch(s1 -> s1.equals(""))) {
            System.out.println(sSplitted.length - 1);
            Arrays.stream(sSplitted)
                .filter(s1 -> !s1.equals(""))
                .forEach(System.out::println);
        } else {
            System.out.println(sSplitted.length);
            Arrays.stream(sSplitted)
                .forEach(System.out::println);
        }
    }
}

