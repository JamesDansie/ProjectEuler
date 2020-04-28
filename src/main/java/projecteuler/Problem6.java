package projecteuler;

public class Problem6 {
//    The sum of the squares of the first ten natural numbers is,
//        1^2 + 2^2 + ... + 10^2 = 385
//    The square of the sum of the first ten natural numbers is,
//        (1 + 2 + ... + 10)^2 = 552 = 3025
//    Hence the difference between the sum of the squares of the
//    first ten natural numbers and the square of the sum is
//    3025 − 385 = 2640.
//
//    Find the difference between the sum of the squares of the
//    first one hundred natural numbers and the square of the sum.
    public static int SumSquareDifference(int min, int max){
        int sumSquare = 0;
        for(int i = min; i <= max; i++){
            sumSquare += Math.pow(i, 2);
        }

        int squareSum = 0;
        for(int i = min; i <= max; i++){
            squareSum += i;
        }
        squareSum = (int)Math.pow(squareSum, 2);

        return squareSum - sumSquare;
    }
}
