package BasicArrayProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArray2 {
    public static int[] findIntersection(int[] arr1, int[] arr2){
        boolean[] seen = new boolean[1001];
        for(int num: arr1){
            seen[num] = true; // first of all mark all element true.
        }
        ArrayList<Integer> ls = new ArrayList<>();
        for(int num: arr2){
            if(seen[num]){
                ls.add(num);
                seen[num] = false; // avoid the duplicate element
            }
        }
        int[] intersectionElement = new int[ls.size()];
        int index = 0;
        for(Integer num: ls){
            intersectionElement[index++] = num;
        }
        return intersectionElement;
    }
    public static void main(String[] args) {
        int[] arr1 = {1000,2,2,1000};
        int[] arr2 = {1000,1000};
        System.out.println(Arrays.toString(findIntersection(arr1, arr2)));
    }
}
