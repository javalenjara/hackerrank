import java.util.Scanner;

class StaticInitializerBlock {
    private static int B;
    private static int H;
    private static boolean flag = true;
    private static Scanner input = new Scanner(System.in);

     static {
         B = input.nextInt();
         H = input.nextInt();
         if(B <= 0 || H <= 0) {
             flag = false;
             System.out.println("java.lang.Exception: Breadth and height must be positive");
         }
     }

    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }//end of main
}//end of class