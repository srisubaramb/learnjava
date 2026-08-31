package Classwork.Aug28.Practise;

public class Pyramid {
    public void drawPyramid(char element , int rows, int cols){
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0; j < cols; j++){
                //Find the condition
                if(i == rows - 1 || j == ( rows - 1) - i - 1 ) {
                    System.out.print(element);
                }
                System.out.print(" ");
            }
            System.out.println();//Next line
        }
    }
}
