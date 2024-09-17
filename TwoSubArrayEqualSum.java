package PrefixArray;
/*
Check if we can partition the array into two sub array with equal sum.
More formally, check that the prefix sum of a part of the array is equal to the suffix.
 */
public class TwoSubArrayEqualSum {
    public static int[] findSuffixSum(int[] arr){
        int[] suffix = new int[arr.length];
        int sum =0;
        for(int i=arr.length-1; i>=0; i--){
            sum = sum + arr[i];
            suffix[i] = sum;
        }
        return suffix;
    }
    public static int[] findPrefixSum(int[] arr){
        int[] prefix = new int[arr.length];
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
            prefix[i] = sum;
        }
        return prefix;
    }
    public static boolean checkEqualSum(int[] arr){
        int[] suffixArray = findSuffixSum(arr);
        int[] prefixArray = findPrefixSum(arr);
        for(int i=0; i<arr.length-1; i++){
            if(prefixArray[i] == suffixArray[i+1]){
                System.out.print("index at : "+i+" is check equal : ");
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums1 = {5, 3, 2, 6, 3, 1};
        int[] nums2 = {1, 3, 2, 4, 5};
        System.out.println(checkEqualSum(nums1));
        System.out.println(checkEqualSum(nums2));
    }
}
