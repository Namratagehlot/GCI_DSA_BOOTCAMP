import java.util.Scanner;

class Milestine3Q3{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = s.nextInt();
        int n = num;
  
        while(n>=10){
            n /= 10;
        }

        int lastdigit = num % 10;

        num = (num - lastdigit) + n;
        num %= 1000;
        int swap = lastdigit * 1000 + num;
        System.out.println("New number is: "+ swap);
    }
}