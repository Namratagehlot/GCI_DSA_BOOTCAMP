public class ques1 {
    public static void main(String[] args) {
       String binary = "101";
       printOnesComplement(binary);
    }

    static char flip(char c ){
        return(c == '0') ? '1' : '0'; 
    }

    static void printOnesComplement(String binary){
        int n = binary.length();
        String ones = " ";

        for (int i = 0; i < n; i++) {
           ones += flip(binary.charAt(i)) ;
        }

        System.out.println("1's complement is:"+ones);
    }
}
