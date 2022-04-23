import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = s.nextInt();
        int n =  1;
        for (int i = 1; i <= num; i++) {
            n = n * i  ;
        }

        System.out.println( "The factorial is "+n);
        s.close();
    }

}
