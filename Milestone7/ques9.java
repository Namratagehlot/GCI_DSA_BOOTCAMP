import java.util.Scanner;

class ques9{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();

        String binary = Integer.toBinaryString(n);
        System.out.println("The binary of given number is: "+ binary);
    }
}