import java.util.Scanner;

class Level2Q2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the natural number: ");
        int n = s.nextInt();
        int i = n;

        while(i>=1){
            System.out.println(i);
            i--;
        }
    }
}