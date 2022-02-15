import java.io.InputStream;
import java.util.Scanner;
class Main {
    {
    public static void main (String [] args) {
         Scanner scan = novo Scanner (System.in);
        System.out.println ("digite um numero");
        int N = scan.nextInt ();
        para (int i = 0; i <= N; i ++) {
             if ((i% 2)! = 0) {
                   System.out.println (i);
            }
        }
    }