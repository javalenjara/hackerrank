import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
            System.out.println("================================");
            for(int i = 0; i < 3; i ++){
                String s1 = sc.next();
                int x = sc.nextInt();
                System.out.format("%-15s", s1);
                System.out.format("%03d%n", x);
            }
            System.out.println("================================");
    }
}
