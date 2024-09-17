package BasicArrayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class QueryPresentArray {
    public static int[] frequentArray(int[] nums){
        int[] makeFrequent = new int[100001];
        for (int value : nums) {
            makeFrequent[value]++;
        }
        return makeFrequent;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("enter the element of the array");
        for(int i=0; i< size; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Array : "+ Arrays.toString(array));
        int[] frequentArray = frequentArray(array);
        System.out.println("enter who many times do you want to check");
        int checkTime = scanner.nextInt();
        int i = 0;
        while(i < checkTime){
            System.out.println("enter the element do you want to check");
            int checkNumber = scanner.nextInt();
            if(frequentArray[checkNumber] > 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            i++;
        }
    }
}
