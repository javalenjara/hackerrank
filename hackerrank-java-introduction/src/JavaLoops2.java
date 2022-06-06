import java.util.Arrays;
import java.util.Scanner;

public class JavaLoops2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0;i < t;i ++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int[] elements = seriesElements(a, b, n);
            Arrays.stream(elements).forEach(x -> System.out.print(x + " "));
            System.out.println();
        }
        in.close();
    }

    private static int[] seriesElements(int a, int b, int n){

        int[] series = new int[n];
        series[0] = a + b;

        for (int i = 1; i <= n - 1; i++) {
            series[i] = series[i - 1] + ((int) (Math.pow(2, i) * b));
        }

        return series;

    }
}