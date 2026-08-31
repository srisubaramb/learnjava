package Grind75;


public class MergeList {
    public int[] mergeSortedList1(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] arr = new int[len1 + len2];
        int i = 0 , j = 0 , index = 0;
        while (i < len1 && j < len2) {
            if(arr1[i] < arr2[j]) {
                arr[index] = arr1[i];
                i++;
            } else if (arr[i] == arr2[j]) {
                arr[index] = arr1[i];
                i++;
            } else {
                arr[index] = arr2[j];
                j++;
            }
            index++;
        }
        while (i < len1) {
            arr[index] = arr1[i];
            index++;
            i++;
        }
        while (j < len2) {
            arr[index] = arr2[j];
            index++;
            j++;
        }
        return arr;
    }
}
