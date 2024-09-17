package BasicArrayProgramming;

public class FirstRepeatedElement {
    public static int findFirstRepeated(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 5, 3, 4, 6, 3, 4};
        int[] nums2 = {1, 2, 4, 6, 7};
        System.out.println(findFirstRepeated(nums1));
        System.out.println(findFirstRepeated(nums2));
    }
}
