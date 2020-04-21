package hackerrank;

import java.util.Arrays;

public class NewYearsChaos {
    // Complete the minimumBribes function below.
    // sample input;

    // 2 1 5 3 4
    // diff = value - index - 1
    // 1 -1 2 -1 -1
    // all positive numbers are less than 3 and sum to 3
    // other case
    // in:   2 5 1 3 4
    // diff: 1 3 -2 -1 -1
    // would take 4 bribes, but 3 bribes for 5
    // other case
    // in:   1 2 5 3 7 8 6 4
    // diff: 0 0 2 -1 2 2 -1 -4
    // but 6 bribed 4 so should be
    // brib: 0 0 0 1 0 0 2 4
    // the most possible bribes is from the current position - 2.
    // so the second for loop checks for numbers greater than itself
    // starting at the position
    static void minimumBribes(int[] q) {
        int bribes = 0;
        for(int i = 0; i < q.length; i++){
            int diff = q[i] - i - 1;
            if(diff >= 3){
                System.out.println("Too chaotic");
                return;
            }
            for(int j = Math.max(0, q[i] -2); j < i; j++){
                if(q[j] > q[i]) bribes++;
            }
        }
        System.out.println(bribes);
    }
}
