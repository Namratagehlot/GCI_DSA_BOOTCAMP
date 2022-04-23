import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        int n, count = 0, a, b, c, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = s.nextInt();
        a = num;
        c = num;
        
        // count total number of digits
        while (a > 0) {
            a /= 10;
            count++;
        }

        while (num > 0) {
            b = num % 10;
            sum =(int) (sum + Math.pow(b, count));
            num /= 10;
        }
        if (sum == c) {
            System.out.println("Given umber is an armstrong number.");
        } else {
            System.out.println("Given umber is not an armstrong number.");
        }

        

    }
}
