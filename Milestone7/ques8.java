public class ques8 {
    public static void main(String[] args) {
        String octal = "121";
        int n = Integer.parseInt(octal, 8);
        String hexDec = Integer.toHexString(n);

        System.out.println("The hexadecimal of given octal number is : "+ hexDec);
    }
}
