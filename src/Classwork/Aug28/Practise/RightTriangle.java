package Classwork.Aug28.Practise;

public class RightTriangle {
    public void drawRightTriangle(char element , int rows, int cols){
        for(int i = 0 ; i < rows; i++) {
            for(int j = 0; j < cols ; j++) {
                //for the current row print that much element eg '*'
                if(j <= i) System.out.print(element + " ");
            }
            System.out.println();//Next line
        }
    }
}
