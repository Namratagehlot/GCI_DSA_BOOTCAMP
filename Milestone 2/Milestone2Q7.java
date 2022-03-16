import java.util.Scanner;

public class Milestone2Q7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = s.nextInt();
        if( num<0 ){
            num = (-1)*num;
            System.out.println("The absolute value of number:"+ num);
        }else{
            System.out.println("The absolute value of number:"+ num);
        }
    }
}
