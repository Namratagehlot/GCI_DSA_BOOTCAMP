import java.util.Scanner;

public class Milestone2Q8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(" Please enter the number of classes held: ");
        int a = s.nextInt();
        System.out.print(" Please enter the number of classes attended: ");
        int b = s.nextInt();
        float c = (b*100)/a;
        System.out.println("The percentage of class attended: "+c+"%");

        if(c >= 75){
            System.out.println("The student is allowed to sit in exam");
        }else{
            System.out.println("The student is not allowed to sit in exam");
        }
    }
}
