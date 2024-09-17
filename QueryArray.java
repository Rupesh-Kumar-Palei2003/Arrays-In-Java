package BasicArrayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class QueryArray {
    public static String checkIsThere(int[] nums, int value){
        for(int element : nums){
            if(value == element){
                return "YES";
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the element of the array");
        for(int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array : "+ Arrays.toString(arr));
        System.out.println("Enter how many number do you want to check");
        int check = scanner.nextInt();
        int i=0;
        while(i<check){
            System.out.println("enter number do you want to check : ");
            int checkNumber = scanner.nextInt();
            System.out.println(checkIsThere(arr, checkNumber));
            i++;
        }
    }
}
