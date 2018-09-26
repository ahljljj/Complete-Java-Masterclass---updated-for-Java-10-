public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));

    }

    public static boolean isPalindrome(int number){

         int res = 0;
         number = Math.abs(number);
         int tmp = number;

         while (tmp > 0){

             res += tmp % 10;
             res *= 10;
             tmp /= 10;
         }



        return res/10 == number;


    }
}
