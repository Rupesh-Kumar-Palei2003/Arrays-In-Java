package TwoPointerArray;

import java.util.Arrays;

public class ArrayContain1_0s {
    public static void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    //Using Two Pointer :
    public static  void sort1_0sArray(int[] arr){
        int start =0, end = arr.length - 1;
        while(start < end){
            if(arr[start] == 1 && arr[end] == 0){
                swap(start, end, arr);
                return;
            }
            if(arr[start] == 0){
                start++;
            }
            if(arr[end] == 1){
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    // Using Normal Method:
    public static void sortArray1_0s(int[] arr){
        int zerosCount = 0;
        for (int j : arr) {
            if (j == 0) zerosCount++;
        }
        for(int i=0; i<arr.length; i++){
            if(i<zerosCount){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 0, 0, 1, 0};
        sortArray1_0s(arr);
        sort1_0sArray(arr);
    }
}
