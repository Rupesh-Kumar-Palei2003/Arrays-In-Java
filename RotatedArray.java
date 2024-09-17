package BasicArrayProgramming;

import java.util.Arrays;

public class RotatedArray {
    public static int[] rotateArray1(int[] nums, int rotate){
        int[] tempArray = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            tempArray[(i+rotate) % nums.length] = nums[i];
        }
        return tempArray;
    }
    public static int[] rotateArray2(int[] nums, int target){
        int length = nums.length;
        int[] answerArray = new int[nums.length];
        int index = 0;
        target = target % length;
        for(int i = length - target; i< length; i++){
            answerArray[index++] = nums[i];
        }
        for(int i = 0; i< length - target; i++){
            answerArray[index++] = nums[i];
        }
        return answerArray;
    }
    public static void reverseArray(int source , int destination, int[] nums){
        while(source < destination){
            int temp = nums[source];
            nums[source] = nums[destination];
            nums[destination] = temp;
            source++;
            destination--;
        }
    }
    public static int[] rotateArray3(int[] nums, int target){
        int length = nums.length;
        target = target % length;
        reverseArray(0, length-target-1,nums);
        reverseArray(length-target, length-1, nums);
        reverseArray(0, length-1, nums);
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 8;
        System.out.println(Arrays.toString(rotateArray1(arr, target)));
        System.out.println(Arrays.toString(rotateArray2(arr, target)));
        System.out.println(Arrays.toString(rotateArray3(arr, target)));
    }
}
