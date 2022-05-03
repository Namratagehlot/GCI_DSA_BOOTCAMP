import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter last digit : ");
        int a = s.nextInt();

        for (int i = 1; i < a; i++) {
           if (perfectNumber(i)) {
            System.out.println(i);
           }

        }
        
    }

    static boolean perfectNumber(int num){
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
         }
 
         if (sum == num) {
           return true;
         } else{
           return false;
         }

    }
}
