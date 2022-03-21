import java.util.Scanner;

import javax.swing.undo.CannotRedoException;

class Milestone3Q2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int a = s.nextInt();
        int n = a;
       
       while( n >= 10 ){
            n /= 10;
        }

        int lastDigit = a % 10;
        
        int sum = n + lastDigit;
        System.out.println("The sum of first and last digit of the number is "+ sum);


       }
}