import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        boolean x = true;

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                x = false;
            }
        }
        if (x == true) {
                System.out.println("Entered number is prime");
        } else {
                System.out.println("Entered number is composite");
        }
        s.close();
    }
}
