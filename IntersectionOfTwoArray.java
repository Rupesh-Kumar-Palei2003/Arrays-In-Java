package BasicArrayProgramming;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArray {
    public static int[] findIntersection(int[] arr1, int[] arr2){
        HashSet<Integer> hs = new HashSet<>();
        for (int j : arr1) {
            for (int k : arr2) {
                if (j == k) {
                    hs.add(j);
                }
            }
        }
        int[] newArray = new int[hs.size()];
        int index = 0;
        for(Integer a: hs){
            newArray[index++] = a;
        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(findIntersection(arr1, arr2)));
    }
}
