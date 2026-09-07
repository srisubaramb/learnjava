package Classwork.Aug28.Practise;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Leap year
        int year = 2026;
        boolean isALeapYear = new LeapYear().isALeapYear(year);
        System.out.printf("%d is a leap year? %b\n" ,year, isALeapYear);

        //Finding largest of three
        int[] threeNos = {1,2,3};
        int largest = new LargestOfThree().findLargestOfThree(threeNos);
        System.out.printf("The largest of this %s three number is %d\n" , Arrays.toString(threeNos) , largest);

        //Reverse number
        int numberToReverse = 700;
        int reverseNumber = new ReverseNumber().reverseNumber(numberToReverse);
        System.out.printf("The number %d is reversed as %d\n", numberToReverse , reverseNumber);

        //Palindrome
        int numberToCheckForPalindrome = 121;
        boolean isAPalindrome = new Palindrome().isAPalindrome(numberToCheckForPalindrome);
        System.out.printf("The Given number %d is palindrome? %b\n" , numberToCheckForPalindrome , isAPalindrome);

        //Armstrong
        int numberToCheckForArmstrong = 153;
        boolean isAArmStrong = new Armstrong().isAArmstrong(153);
        System.out.printf("The Given number %d is a armstrong? %b\n" , numberToCheckForArmstrong , isAArmStrong);

        //Right angle triangle
        char element = '*';
        int rows = 4, cols = 4;
        new RightTriangle().drawRightTriangle(element ,rows , cols);

        //Pyramid
        new Pyramid().drawPyramid(element ,rows, 7);
    }
}
