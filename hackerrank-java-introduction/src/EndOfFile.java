import java.util.Scanner;

class EndOfFile {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int line = 0;

        while (sc.hasNext()) {
            line++;
            System.out.println(line + " " + sc.nextLine());
        }
    }
}



