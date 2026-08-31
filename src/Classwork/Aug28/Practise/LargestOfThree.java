package Classwork.Aug28.Practise;

public class LargestOfThree {
    public int findLargestOfThree(int[] arr) {
        try {
            int max = arr[0];
            for(int i = 1; i < arr.length ; i++) {
                max = Math.max(max , arr[i]);
            }
            return max;
        } catch (Exception e) {
            System.out.printf("Empty arr or not a numbers can't be processed error : %s", e.getMessage());
        }
        return 0;
    }
}
