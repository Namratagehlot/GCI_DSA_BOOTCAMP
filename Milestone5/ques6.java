import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        int n, count = 0, a, b, c, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the ending digit: ");
        int num = s.nextInt();
        
        for (int i = 1; i <= num; i++) {
            n = i;
            
            while ( n > 0) {
                b = n % 10;
                sum = sum + (b * b * b);
                n /= 10; 
            }

            if (sum == i) {
                System.out.println(i);
            }
            sum = 0;
        }

    }
}
