package Classwork.Aug28.Practise;

public class Pyramid {
    public void drawPyramid(char element , int rows, int cols){
        for(int i = 1 ; i <= rows ; i++){
            //Printing spaces;
            for(int j = 1;j<=rows-i;j++) {
                System.out.print(" ");
            }
            //Printing Element
            for(int j = 1;j<= i + (i - 1) ; j++) {
                System.out.print("*");
            }
            System.out.println();//Next line
        }
    }
}
