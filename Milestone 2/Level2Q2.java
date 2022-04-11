import java.util.Scanner;

public class Level2Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter your age:");
        int age = s.nextInt();
        System.out.print("Please enter your sex (M:Male,F:Female): ");
        String sex = new String();
        sex = s.next();
        System.out.print("Please enter marital status (Y:Married,N:Unmarried): ");
        String marStat = s.next();

        if( sex == "F"){
            System.out.println("You'll work only in urban areas.");
        }else{
            if(age >= 20 && age <= 40){
                System.out.println("You may work anywhere.");
            }else if(age >= 40 && age <= 60){
                System.out.println("You'll work only in urban areas.");
            }else{
                System.out.println("ERROR");
            }
        }
    }
}
