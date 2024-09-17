package BasicArrayProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateElement {
    public static int[] removeDuplicates(int[] nums) {
        List<Integer> ls = new ArrayList<Integer>();
        ls.add(nums[0]);
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                ls.add(nums[i]);
            }
        }

            int[] eliminateDuplicate = new int[ls.size()];
            int index=0;
            for(Integer obj : ls){
                eliminateDuplicate[index++] = obj;
            }
            return eliminateDuplicate;
    }

    public static void main(String[] args) {
        int[] array1 = {-3,-1,0,0,0,3,3};
        int[] array2 = {1,1,2,2};
        System.out.println(Arrays.toString(removeDuplicates(array1)));
        System.out.println(Arrays.toString(removeDuplicates(array2)));
    }
}
