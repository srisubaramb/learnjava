package Classwork.Aug28.Practise;

public class ReverseNumber {
    public int reverseNumber(int num){
        int reversed = 0;
        while (num > 0) {
            int lastNumber = num % 10;
            reversed = (reversed * 10) + lastNumber;
            num /= 10;
        }
        return reversed;
    }
}
