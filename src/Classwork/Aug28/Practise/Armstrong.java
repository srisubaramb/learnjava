package Classwork.Aug28.Practise;

public class Armstrong {
    public boolean isAArmstrong(int num){
        int armstrongValue = 0;
        int temp = num;
        while (temp > 0) {
            double digits = temp % 10;
            armstrongValue += (int) Math.pow(digits , 3.0);//Finding cube
            temp /= 10;
        }
        return num == armstrongValue;
    }
}
