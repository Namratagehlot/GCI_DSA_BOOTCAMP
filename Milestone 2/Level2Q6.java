import java.util.Scanner;

class Level2Q6{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the natural number: ");
        int n = s.nextInt();
        int sum = 0; 
        for(int i=0; i<=n; i++){
            sum = sum+i;
        }
        System.out.println(sum);
        }
}