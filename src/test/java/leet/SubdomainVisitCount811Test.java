package leet;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SubdomainVisitCount811Test {

    @Test
    public void subdomainVisits() {
        String[] input = {"9001 discuss.leetcode.com"};
        String[] output = {
                "9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"
        };
        List<String> answer = SubdomainVisitCount811.subdomainVisits(input);
        for(String stuff: output){
            assertTrue(answer.contains(stuff));
        }
    }
}