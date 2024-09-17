package BasicArrayProgramming;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverseArray(int[] arr){
        int i=0, j = arr.length -1;
        while(i < j){
            //swap two number
            arr[i] = arr[j] + arr[i];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {12, 14, 16, 18, 20};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }
}
