import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the ending number : ");
        int num2 = s.nextInt();

        for (int i = 2; i <= num2; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                   isPrime = false;
                   break;
                }
            }
            if (isPrime == true) {
                System.out.println(i);
            }
        }
        s.close();
    }
}
