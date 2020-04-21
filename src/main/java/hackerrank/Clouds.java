package hackerrank;

public class Clouds {
    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int index = 0;
        int numJumps = 0;
        while(index < c.length){
            if(index + 2 < c.length && c[index + 2] == 0){
                index += 2;
                numJumps++;
                continue;
            } else if(index + 1 < c.length && c[index + 1] == 0){
                index += 1;
                numJumps++;
            } else {
                index++;
            }
        }
        return numJumps;
    }
}
