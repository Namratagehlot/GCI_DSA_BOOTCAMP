public class ques3 {
      public static void main(String[] args) {
          String binary = "101";
          int n = Integer.parseInt(binary, 2);
          String octal = Integer.toOctalString(n);
          System.out.print("The octal of given binary number is: "+ octal);
      }    
}
