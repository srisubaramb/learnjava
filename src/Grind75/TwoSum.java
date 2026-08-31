package Grind75;

import java.util.HashMap;
import java.util.Map;

//int[] nums = {3,3};
//int target = 6;
public class TwoSum {

     public int[] findIndexReduceToTarget1(int[] data , int target) {
        for(int i = 0; i < data.length ; i++){
            for(int j = i + 1; j < data.length; j++) {
                if(data[i] + data[j] == target) {
                    return new int[]{i , j};
                }
            }
        }
        //no indices found
        return new int[]{-1,-1};
    }
    public int[] findIndexReduceToTarget2(int[] nums ,int target ) {
         Map<Integer , Integer> memory = new HashMap<>();
         for(int i = 0; i < nums.length ; i++){
             final int balance = target - nums[i];
             if(memory.containsKey(balance)){
                 return new int[]{ memory.get(balance), i};
             }
             memory.put(nums[i] , i);
         }
         return new int[]{-1,-1};
    }
}
