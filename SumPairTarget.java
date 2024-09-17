package BasicArrayProgramming;

import java.util.ArrayList;

public class SumPairTarget {
    public static void findPairSum(int[] array, int target){
        ArrayList<String> ls = new ArrayList<>();
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] + array[j] == target){
                    ls.add("("+array[i]+","+ array[j]+")");
                }
            }
        }
        System.out.println(ls);
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8};
        int target = 10;
        findPairSum(arr, target);
    }
}
