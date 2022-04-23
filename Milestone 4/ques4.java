import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        int hcf = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = s.nextInt();
        System.out.print("Enter second number:");
        int num2 = s.nextInt();
        int num3 = num1;

        if (num1 > num2) {
            num3 = num2;
        }

        for (int i = 1; i <= num3; i++) {
            if ( num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("The HCF of given numbers is "+ hcf);
        s.close();
    }
}
