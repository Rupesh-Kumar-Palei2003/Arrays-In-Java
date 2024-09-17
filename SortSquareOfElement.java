package TwoPointerArray;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
    Given an integer array 'a' sorted in non-decreasing order, return an array of the squares of each number sorted in
    non-decreasing order.
    TestCase 1 : {2, 4, 8, 29}
    TestCase 2 : {-10, -3, -2, 1, 4, 5}
 */
public class SortSquareOfElement {
    public static int[] sortSquare(int[] nums){
        int[] squareArray = new int[nums.length];
        int start =0, end = nums.length - 1, index =0;
        while(start <= end){
            if(square(nums[start]) < square(nums[end])){
                squareArray[index++] = square(nums[end]);
                end--;
            }
            else{
                squareArray[index++] = square(nums[start]);
                start++;
            }
        }
        return reverseArray(squareArray);
    }
    public static int square(int num){
        num = Math.abs(num);
        return num * num;
    }
    public static int[] reverseArray(int[] arr){
        int start =0, end = arr.length -1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 4, 8, 29};
        int[] nums2 = {-10, -3, -2, 1, 4, 5};
        System.out.println(Arrays.toString(sortSquare(nums1)));
        System.out.println(Arrays.toString(sortSquare(nums2)));

    }
}
