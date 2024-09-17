package Rupesh.Sorting.com;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static int[] mergeArray(int[] nums1, int[] nums2){
        int i=0, j=0, k=0;
        int[] nums3 = new int[nums1.length + nums2.length];
        while(i< nums1.length && j< nums2.length){
            if(nums1[i] < nums2[j]){
                nums3[k++] = nums1[i];
                i++;
            }
            else{
                nums3[k++] = nums2[j];
                j++;
            }
        }
        while(i< nums1.length){
            nums3[k++] = nums1[i];
            i++;
        }
        while(j< nums2.length){
            nums3[k++] = nums2[j];
            j++;
        }
        return nums3;
    }


    public static void main(String[] args) {
        int[] arr1 = {10, 30, 50, 60, 80};
        int[] arr2 = {20, 40, 70, 90, 100};
        System.out.println("merge two sorted Array : "+Arrays.toString(mergeArray(arr1, arr2)));
    }
}
