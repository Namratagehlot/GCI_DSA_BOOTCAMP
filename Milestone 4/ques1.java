import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = s.nextInt();
        System.out.print("Enter the exponenet: ");
        int exp = s.nextInt();
        int n = 1;

        for (int i = 1; i <= exp; i++) {
            n = n * base;
        }

        System.out.println(n);
        s.close();
    }
    
}
