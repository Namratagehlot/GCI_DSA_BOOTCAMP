import java.util.Scanner;

class Level2Q9{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int n = s.nextInt();
        
        for( int i=1; i<=10; i++){
            int num = n*i;
            System.out.println(num);
        }
        
        
    }
}