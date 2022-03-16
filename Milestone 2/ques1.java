import java.util.Scanner; 
 
 class ques1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the length of the rectangle: ");
        int a = s.nextInt();
        System.out.print("Please enter the breadth of the rectangle: ");
        int b = s.nextInt();

        if( a==b ){
            System.out.println("It is a square. ");
        }else{
            System.out.println("It is a rectangle. ");
        }
    }
}