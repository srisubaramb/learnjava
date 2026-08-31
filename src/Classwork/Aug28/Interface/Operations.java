package Classwork.Aug28.Interface;

interface Operation{
    int calculate(int a, int b);
}
public class Operations {
    public static void main(String[] args) {
        Operation add = ( a ,  b) -> a + b;
        //using method ref
        Operation add1 = Integer::sum;
        System.out.println(add.calculate(1,3));
        System.out.println(add1.calculate(1,3));

    }
}
