import java.util.Scanner;

class Milestine3Q4{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = s.nextInt();
        int sum = 0;
        
        while( num!=0){
            
            int n = num % 10;
            sum = sum + n;
            num /= 10;
        }
        System.out.println(sum);
        }
    }
