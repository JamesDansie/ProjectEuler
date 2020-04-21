package hackerrank;

import java.util.*;

public class Socks {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int key: ar){
            Integer value = hm.get(key);
            if(value == null){
                hm.put(key, 1);
            } else {
                hm.put(key, value+1);
            }
        }
        int ans = 0;
//        System.out.println(hm);
        Iterator it = hm.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            int value = (int)pair.getValue();
            int quotient = value / 2;
            ans += quotient;
        }

        return ans;
    }
}
