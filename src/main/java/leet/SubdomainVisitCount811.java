package leet;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/subdomain-visit-count/
public class SubdomainVisitCount811 {
    public static List<String> subdomainVisits(String[] cpdomains) {
        // seperate on the period going from left to right
        // use that string as a key for a hashmap
        // update the value with the new number
        HashMap<String, Integer> hm = new HashMap<>();

        for(String inputString: cpdomains){
            String[] spaceSplit = inputString.split(" ");
            Integer visits = Integer.parseInt(spaceSplit[0]);

            String[] periodSplit = spaceSplit[1].split("\\.");
            String subdomains = "";
            for(int i = periodSplit.length - 1; i >= 0; i--){
                if(i == periodSplit.length -1){
                    subdomains += periodSplit[i];
                } else {
                    subdomains = periodSplit[i]+"."+subdomains;
                }
                Integer storedValue = hm.get(subdomains);
                if(storedValue == null){
                    hm.put(subdomains, visits);
                } else {

                    hm.put(subdomains, storedValue + visits);
                }
            }
        }
        List<String> answer = new LinkedList<>();
        hm.forEach((k,v) -> {
            String answerString = "";
            answerString = String.format("%s %s", v, k);
            answer.add(answerString);
        });
        return answer;
    }
}
