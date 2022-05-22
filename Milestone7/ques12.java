public class ques12 {
    public static void main(String[] args) {
        String hexDec = "51";
        int n = Integer.parseInt(hexDec, 16);
        String binary = Integer.toBinaryString(n);
        System.out.println("The binary of given hexadecimal number is: "+ binary);
    }
}
