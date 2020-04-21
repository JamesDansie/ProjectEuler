package hackerrank;

public class RepeatedString {
    static long repeatedString(String s, long n) {
        long aPerLoop = 0;
        long aTotal = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a') aPerLoop++;
        }
        long fullLoops = n / s.length();
        aTotal = fullLoops * aPerLoop;
        long remainder = n % s.length();
        for(int i = 0; i < remainder; i++){
            if(s.charAt(i) == 'a') aTotal++;
        }
        return aTotal;
    }
}
