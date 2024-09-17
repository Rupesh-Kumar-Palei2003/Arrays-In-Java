package BasicArrayProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class UnionOfTwoArray {
    public static int[] findUnion(int[] nums1, int[] nums2){
        boolean[] seen = new boolean[1001];
        ArrayList<Integer> al = new ArrayList<>();
        for(int num: nums1){
            seen[num] = true;
            al.add(num);
        }

        for(int num: nums2){
            if(!seen[num]){
                al.add(num);
            }
        }
        int[] unionArray = new int[al.size()];
        int index = 0;
        for(Integer num: al){
            unionArray[index++] = num;
        }
        return unionArray;
    }
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 6, 7, 8};
        int[] arr2 = {7, 8, 9, 10};
        System.out.println(Arrays.toString(findUnion(arr1, arr2)));

    }
}
