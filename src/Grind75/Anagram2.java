package Grind75;

public class Anagram2 {
    public boolean isAnagram(String s, String t){
        int[] arr = new int[26];
        int l1 = s.length();
        int l2 = t.length();
        if(l1!=l2) return false;
        for(int i = 0; i<l1; i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++) {
            if(arr[i] != 0) return false;
        }
        return true;
    }
}
