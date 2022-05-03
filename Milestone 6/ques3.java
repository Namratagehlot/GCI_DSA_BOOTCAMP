import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        int sum = 0, fact;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
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
            System.out.println(sum+ " is a strong number");
        }else{
            System.out.println(sum + " is not a strong number");
        }
    }
}
