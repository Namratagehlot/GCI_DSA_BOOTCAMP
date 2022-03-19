import java.util.Scanner;

class Milestone3Q1{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int a = s.nextInt();
        int n = a;
       
       while( n >= 10 ){
            n /= 10;
        }
        System.out.println("The first digit is "+ n);

        int lastDigit = a % 10;
        System.out.println("The last digit is "+ lastDigit);

    }
}