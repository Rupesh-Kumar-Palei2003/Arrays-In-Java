package BasicArrayProgramming;

import java.util.Arrays;

/*
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
 */
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[j++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return j;
    }
    public static void main(String[] args) {
        int[] num = {1,3,2,3};
        System.out.println(removeElement(num, 3));
    }
}
