import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        int num1, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = s.nextInt();
        num1 = a;

        for (int i = 1; i < num1; i++) {
           if (a % i == 0) {
               sum += i;
           }
        }

        if (sum == num1) {
            System.out.println(num1+" is Perfect number");
        } else {
            System.out.println(num1+" is not a Perfect number");
        }

    }

}
