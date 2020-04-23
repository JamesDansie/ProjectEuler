package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class Magazine {
    static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String, Integer> magHM = new HashMap<>();
        HashMap<String, Integer> noteHM = new HashMap<>();

        for(String magWord : magazine){
            Integer magCount = magHM.get(magWord);
            if(magCount == null){
                magHM.put(magWord, 1);
            } else {
                magHM.put(magWord, magCount + 1);
            }
        }

        for(String noteWord: note){
            Integer noteCount = noteHM.get(noteWord);
            if(noteCount == null){
                noteHM.put(noteWord, 1);
            } else {
                noteHM.put(noteWord, noteCount + 1);
            }
        }

        for(Map.Entry<String, Integer> noteEntry : noteHM.entrySet()){
            String key = noteEntry.getKey();
            Integer value = noteEntry.getValue();

            Integer magValue = magHM.get(key);
            if(magValue < value){
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");

    }
}
