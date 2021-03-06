public class ques2 {
    public static void main(String[] args) {
        String binary = "101";
        printtwosComplement(binary);
     }
 
     static char flip(char c ){
         return(c == '0') ? '1' : '0'; 
     }
 
     static void printtwosComplement(String binary){
         int n = binary.length();
         String ones = " ", twos = " ";
         ones = twos = " ";
         int i;
 
         for ( i = 0; i < n; i++) {
            ones += flip(binary.charAt(i)) ;
         }
        
         twos = ones ;
         for (i = n - 1; i >= 0; i--) {
            if (ones.charAt(i) == '1')
            {
                twos = twos.substring(0, i) + '0' + twos.substring(i + 1);
            }
            else
            {
                twos = twos.substring(0, i) + '1' + twos.substring(i + 1);
                break;
            }
         }

         if (  i == -1)
         {
             twos = '1' + twos;
         }
 
         System.out.println("2's complement is:"+twos);
     }
}
