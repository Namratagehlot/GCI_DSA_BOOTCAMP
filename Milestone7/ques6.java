public class ques6 {
    public static void main(String[] args) {
        String octal = "121";
        int n = Integer.parseInt(octal, 8);
        String binary = Integer.toBinaryString(n);

        System.out.println("The binary of given octal number is : "+binary);
    }
}
