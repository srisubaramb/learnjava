package Grind75;

public class ValidPalindrome {
    public boolean isAPalindrome(String s) {
        StringBuilder formated = new StringBuilder();
        formated.append(s.replaceAll("[^a-zA-Z0-9]", ""));
        String lowerCase = formated.toString().toLowerCase();
        formated.reverse();
        String lowerCaseReversed = formated.toString().toLowerCase();
        return lowerCase.equals(lowerCaseReversed);
    }
}
