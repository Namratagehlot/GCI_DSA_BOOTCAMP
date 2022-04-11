import java.util.Scanner;

public class Level2Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the year: ");
        int year = s.nextInt();

        if( year % 4 == 0 || year % 400 == 0){
            System.out.println("It is a leap year!");
        }else{
            System.out.println("It is not a leap year!");
        }
    }
}
