package projecteuler;

public class Problem7 {
//    By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
//    we can see that the 6th prime is 13.
//
//    What is the 10 001st prime number?
    public static int nthPrime(int nthNumber){
        int currNumber = 2;
        int kthPrime = 1;

        while(kthPrime < nthNumber){
            currNumber++;
            if(Problem5.isPrime(currNumber)){
                kthPrime++;
            }
        }
        return currNumber;
    }
}
