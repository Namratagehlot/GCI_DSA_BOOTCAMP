import java.util.Scanner;

public class Milestone2Q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(" Please enter the age of first person: ");
        int a = s.nextInt();
        System.out.print(" Please enter the age of second person: ");
        int b = s.nextInt();
        System.out.print(" Please enter the age of third person: ");
        int c = s.nextInt();

        if( a > b && b > c){
            System.out.println(" The first person is the oldest.");
            System.out.println(" The third person is the youngest.");
        }else if(b > a && a > c){
            System.out.println(" The second person is the oldest.");
            System.out.println(" The third person is the youngest.");
        }else if(c > a && a > b){
            System.out.println(" The third person is the oldest.");
            System.out.println(" The second person is the youngest.");
        }else if(c > b && b > a) {
            System.out.println(" The third person is the oldest.");
            System.out.println(" The first person is the youngest.");
        }else if( a > c && c > b) {
            System.out.println(" The first person is the oldest.");
            System.out.println(" The second person is the youngest.");
        }else if(b > c && c > a) {
            System.out.println(" The second person is the oldest.");
            System.out.println(" The first person is the youngest.");
        }
    }
}