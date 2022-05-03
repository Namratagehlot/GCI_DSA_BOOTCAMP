import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the last digit: ");
        int num = s.nextInt();

        for (int i = 1; i <= num; i++) {
            if (strongNumber(i)) {
                System.out.println(i + " is a perfect number");
            }
            
        }
    }

    static boolean strongNumber(int n){
        int fact, sum = 0;
        int newNum = n;
        while (n != 0) {
            fact = 1;
            int num = n % 10;

            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }

            sum = sum + fact;

            n = n / 10;
            
        }

        if (sum == newNum) {
            return true;
        }else{
            return false;
        }
    }
}
