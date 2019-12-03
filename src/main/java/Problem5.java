public class Problem5 {
//    2520 is the smallest number that can be
//    divided by each of the numbers from 1 to
//    10 without any remainder.
//
//    What is the smallest positive number that
//    is evenly divisible by all of the numbers
//        from 1 to 20?

    //  210 * 4/2 * 8/4 * 9/3
    //  this is * divisor / remainder
    //  could also be / (remainder / divisor)

    // if the number is prime then multiple it in
    // if the number is not prime then multiple divisor / remainder

    public static int smallestMultiple(int min, int max){
        if(min < 0){throw new IllegalArgumentException("Must be greater than zero");}
        if(max < min){throw new IllegalArgumentException("max is less than min");}
        int total = 1;
        for(int i = min; i < max; i++){
            if(isPrime(i)){
                total *= i;
            } else {
                int remainder = total % i;
                if(remainder != 0){
                    total *= (i / remainder);
                }
            }
        }
        return total;
    }

    public static boolean isPrime(int input){
        if(input < 1){throw new IllegalArgumentException("input must be greater than zero");}

        if(input == 1 || input == 2){return true;}

        for(int i = 2; i < input; i++){
            if(input % i == 0){
                return false;
            }
        }
        return true;
    }
}
