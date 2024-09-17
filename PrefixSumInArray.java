package PrefixArray;

import java.util.Arrays;

public class PrefixSumInArray {
    public static int[] prefixSum(int[] arr){
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
            arr[i] = sum;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 5};
        System.out.println(Arrays.toString(prefixSum(arr)));
    }
}
