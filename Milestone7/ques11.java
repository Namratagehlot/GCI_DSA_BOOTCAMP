import java.util.Scanner;

public class ques11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();

        String hexaDecimal = Integer.toHexString(n);
        System.out.println("The hexadecimal of given number is: "+ hexaDecimal);  
    }
}
