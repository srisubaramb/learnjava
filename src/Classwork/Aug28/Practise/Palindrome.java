package Classwork.Aug28.Practise;

public class Palindrome {
    public boolean isAPalindrome(int num){
        //Finding the reverse using reverse logic
        int reversed = new ReverseNumber().reverseNumber(num);
        return reversed == num;
    }
}
