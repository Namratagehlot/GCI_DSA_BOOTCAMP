import java.util.Scanner;

public class Milestone2Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(" Please enter your salary: ");
        float a = s.nextFloat();
        System.out.print(" Please enter the year of service: ");
        int b = s.nextInt();

        if( b>5){
           float c = (float) (a * 0.05);
           a = a+c;
            System.out.println(a);
        }else {
            System.out.println(" No bonus.");
        }
    }
}
