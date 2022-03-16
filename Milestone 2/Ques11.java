import java.util.Scanner;

class Ques11{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the alphabet: ");
        char alpha = s.next().charAt(0);

        if(alpha>='A' && alpha<='Z'){
            System.out.println("Entered character belongs to uppercase.");
        }
        if(alpha>='a' && alpha<='z'){
            System.out.println("Entered character belongs to lowecase.");
        }
    }
}