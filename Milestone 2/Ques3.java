import java.util.Scanner;

class Ques3{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter quantity: ");
        int a = s.nextInt();
        int b = a*100;

        if( b <= 1000){
            System.out.println("No Discount.");
            System.out.print("The cost of purchased quantity is "+b); 
        }else{
            int c = (b*10)/100;
            b = b-c;
            System.out.println("You get a discount of "+c);
            System.out.print("The cost of purchased quantity is "+b);
        }
    }
}