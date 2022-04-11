import java.util.Scanner;

public class Level2Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter 4-digit number: ");
        int num = s.nextInt();

        int firstDigit = num%10;
        int secondDigit = (num/10)%10;
        int thirdDigit = (num/100)%10;
        int fourthDigit = (num/1000)%10;

        int newNum = (firstDigit*1000) + (secondDigit*100) + (thirdDigit*10) + (fourthDigit) ;
        System.out.println(newNum);
    }
}
