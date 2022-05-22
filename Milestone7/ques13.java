public class ques13 {
    public static void main(String[] args) {
        String hexDec = "51";
        int n = Integer.parseInt(hexDec, 16);
        String octal = Integer.toOctalString(n);
        System.out.println("The octal of given hexadecimal number is: "+ octal); 
    }
}
