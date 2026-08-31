package Grind75;

import java.util.HashMap;
import java.util.Map;

public class ValidBrackets {
    public boolean checkBrackets1(String brackets) {
        StringBuilder lookup = new StringBuilder();
        Map<Character, Character> data = new HashMap<>();
        data.put(')' , '(');
        data.put('}', '{');
        data.put(']' , '[');
        for (int i = 0; i < brackets.length(); i++) {
            char currectCharacter = brackets.charAt(i);
            if(data.containsValue(currectCharacter)) lookup.append(currectCharacter);
            //Closing bracket
            if(data.containsKey(currectCharacter)){
                //Look up for the open bracket
                if (lookup.isEmpty() ||
                        lookup.charAt(lookup.length() - 1) != data.get(currectCharacter)) return false;
                lookup.deleteCharAt(lookup.length() - 1);
            }
        }
        //if there is open brackect which are not closed
        return lookup.isEmpty();
    }

}
