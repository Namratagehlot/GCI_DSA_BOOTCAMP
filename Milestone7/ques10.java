import java.util.Scanner;

public class ques10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();

        String octal = Integer.toOctalString(n);
        System.out.println("The octal of given number is: "+ octal);
    }
}
