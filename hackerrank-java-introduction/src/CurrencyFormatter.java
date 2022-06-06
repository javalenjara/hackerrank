import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        final NumberFormat indianNF = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

        final String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        final String india = indianNF.format(payment);
        final String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        final String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        // Write your code here.

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
