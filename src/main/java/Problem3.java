import java.util.LinkedList;

public class Problem3 {
//    The prime factors of 13195 are 5, 7, 13 and 29.
//
//    What is the largest prime factor of the number 600851475143 ?
    public static int maxPrimeFactor(long input){
        int numIterations = (int)Math.sqrt(input);
        LinkedList<Integer> factors = new LinkedList<>();

        //checking all possible prime values
        for(int i = 2; i < numIterations; i++){
            //to find factors
            if(input % i == 0 ){
                //need a prime test
                // to be prime it should not be contained in factors
                // or divisible by factors already stored.

                if(!factors.contains(i)){
                    boolean divisible = false;
                    for(Integer factor : factors){
                        if(i % factor == 0){
                            divisible = true;
                        }
                    }
                    if(divisible == false){
                        factors.add(i);
                    }
                }
            }
        }
        return factors.getLast();
    }
}
