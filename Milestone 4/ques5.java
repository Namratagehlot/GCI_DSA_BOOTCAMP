import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        int lcm = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = s.nextInt();
        System.out.print("Enter second number:");
        int num2 = s.nextInt();
        
        lcm = (num1 > num2) ? num1 : num2;

        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                System.out.println("The lcm of given two numbers is: "+lcm);
                break;
            }
            lcm++;
        }
        
    }
}


