package leet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

//https://leetcode.com/problems/find-duplicate-file-in-system/
//Example 1:
//
//Input:
//["root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"]
//Output:
//[["root/a/2.txt","root/c/d/4.txt","root/4.txt"],["root/a/1.txt","root/c/3.txt"]]

//Algo;
//1. Use scanner to break up incoming str
//2. store the first part as a root
//3. parse up to "(" store as subroot
//4. parse up to ")" store as file
//5. add to hashmap file as key, root+subroot as value
//6. foreach K,V if V.length > 1 add to list


public class FindDupFilesInSys {
    public List<List<String>> findDuplicate(String[] paths) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        for(String path: paths){
            Scanner sc = new Scanner(path);
            String root = sc.next();
            while(sc.hasNext()){
                String filestr = sc.next();
                int openningParen;
                int closingParen;
                for(char ch: filestr.toCharArray()){
                    if(ch == '('){
                        
                    }

                }
            }
        }
    }

    //tester code
    public static void main(String[] args){
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        hm.put("1", list);

        System.out.println(hm);
        System.out.println(hm.get("1"));
        hashadd(hm, "1", "one again");
        hashadd(hm, "2", "two");
        System.out.println(hm);
    }

    public static void hashadd(HashMap<String, ArrayList<String>> hm, String key, String value){
        if(hm.containsKey(key)){
            ArrayList<String> list = hm.get(key);
            list.add(value);
        } else {
            ArrayList<String> newlist = new ArrayList<>();
            newlist.add(value);
            hm.put(key, newlist);
        }
    }
}
