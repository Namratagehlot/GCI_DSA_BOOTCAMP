import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num1 = s.nextInt();

        for (int num = 2; num <= num1; num++) {

            if (num1 % num == 0) {
            boolean isPrime = true;
            for (int j = 2; j <= num/2; j++) {
                if (num % j == 0) {
                   isPrime = false;
                   break;
                }
            }
            if (isPrime == true) {
                System.out.println(num);
            }
            }
        }
        }
    }

