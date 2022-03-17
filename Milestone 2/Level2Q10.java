import java.util.Scanner;

class Level2Q10{
    public static void main(String[] args) {
        int count = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = s.nextInt();

        while( num!=0 ){
            num = num/10;
            count++;
        }
        System.out.println("Number of digits in the entered number is "+ count);
    }
}