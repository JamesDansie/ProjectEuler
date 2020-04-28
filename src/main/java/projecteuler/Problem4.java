package projecteuler;

public class Problem4 {
//    A palindromic number reads the same both ways.
//    The largest palindrome made from the product of
//        two 2-digit numbers is 9009 = 91 × 99.
//
//    Find the largest palindrome made from the product
//    of two 3-digit numbers.
    public static int largestPalindrome(int numDigits){
        int max = (int)Math.pow(10, numDigits);
        int largestPal = 0;
        for(int i = 1; i < max; i++){
            for(int j = 1; j < max; j++){
                int curInt = i * j;
                if(curInt > largestPal && isPalindrome(curInt)){
                    largestPal = curInt;
                }
            }
        }
        return largestPal;
    }

    public static boolean isPalindrome(Integer input){
        String strInput = input.toString();

        for(int i = 0; i < strInput.length()/2; i++){
            if(strInput.charAt(i) !=
                    strInput.charAt(strInput.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}
