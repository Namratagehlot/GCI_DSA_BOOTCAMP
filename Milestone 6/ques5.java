import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        int a = 0, b = 1 , c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = s.nextInt();
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < terms; i++) {
            c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
            
        }
    
    }
}
