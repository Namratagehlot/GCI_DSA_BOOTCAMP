import java.util.Scanner;

class Milestine3Q5{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = s.nextInt();
        int mul = 1;
        
        while( num!=0){
            
            int n = num % 10;
            mul = mul * n;
            num /= 10;
        }
        System.out.println(mul);
        }
    }
