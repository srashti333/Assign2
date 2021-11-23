package two;
import java.util.Scanner;
public class Wrap2 {
    public static void main(String[] args) {
        int n ;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();

        System.out.println("Given Number: " + n);
        System.out.println("Binary equivalent: " + Integer.toBinaryString(n));
        System.out.println("Octal equivalent: " + Integer.toOctalString(n));
        System.out.println("Hexadecimal equivalent: " + Integer.toHexString(n));

    }
}
