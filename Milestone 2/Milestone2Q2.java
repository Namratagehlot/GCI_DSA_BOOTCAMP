import java.util.Scanner;

public class Milestone2Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(" Please enter the first number: ");
        int a = s.nextInt();
        System.out.print(" Please enter the second number: ");
        int b = s.nextInt();

        if( a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

}
