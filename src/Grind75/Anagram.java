package Grind75;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public boolean isAnagram1(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> sourceLetters = new HashMap<>();
        //Iterating source
        for(int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if(!sourceLetters.containsKey(currentChar)){
                sourceLetters.put(currentChar, 1);
                continue;
            }
            sourceLetters.put(currentChar, sourceLetters.get(currentChar) + 1);
        }
        //Iterating the target
        for(int j = 0; j < t.length(); j++) {
            char currentChar = t.charAt(j);
            if(!sourceLetters.containsKey(currentChar)){
                return false;
            }
            int count = sourceLetters.get(currentChar);
            if(count <= 0) {
                return false;
            }
            sourceLetters.put(currentChar , --count);
        }
        return true;
    }

}

