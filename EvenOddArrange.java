package TwoPointerArray;

import java.util.Arrays;

public class EvenOddArrange {
    public static void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static boolean checkEven(int num){
        return num % 2 == 0;
    }
    public static  void arrangeInEvenOdd(int[] arr){
        int start = 0, end = arr.length-1;
        while(start < end){
            if(!checkEven(arr[start]) && checkEven(arr[end])){
                swap(start, end, arr);
                start++;
                end--;
            }
            if(checkEven(arr[start])){
                start++;
            }
            if(!checkEven(arr[end])){
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 6, 0, 8, 9, 5};
        arrangeInEvenOdd(arr);
    }
}
