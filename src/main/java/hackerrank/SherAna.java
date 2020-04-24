package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class SherAna {
//    https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem

    static int sherlockAndAnagrams(String s) {
        ArrayList<HashMap<Character, Integer>> data = new ArrayList<HashMap<Character, Integer>>();
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                HashMap<Character, Integer> hm = new HashMap<>();
                for(int k = i; k <= j; k++){
                    Character key = s.charAt(k);
                    Integer value = hm.get(key);
                    if(value == null){
                        hm.put(key, 1);
                    } else {
                        hm.put(key, value + 1);
                    }
                }
                if(!hm.isEmpty()){
                    data.add(hm);
                }
            }
        }

        int total = 0;
        for(int i = 0; i < data.size(); i++){
            HashMap<Character, Integer> curr = data.get(i);
            for(int j = i+1; j < data.size(); j++){
                HashMap<Character, Integer> comparison = data.get(j);
                if(curr.equals(comparison)) total++;
            }
        }
        return total;
    }
}
