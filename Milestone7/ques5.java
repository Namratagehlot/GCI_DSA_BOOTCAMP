public class ques5 {
    public static void main(String[] args) {
        String binary = "101";
          int n = Integer.parseInt(binary, 2);
          String hexaDec = Integer.toHexString(n);
          System.out.print("The hexadecimal of given binary number is: "+ hexaDec);
    }
}
