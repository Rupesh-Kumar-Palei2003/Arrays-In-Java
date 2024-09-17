package PrefixArray;

import java.util.Scanner;

/*
    Given an array of integers of size n. Answer q queries where you need to print the sum
    of values in a given range of indices from l to r (both included).
    Note : The values of l and r in queries follow 1-based indexing.
    l : source, r : destination
 */
public class SumFromSourceDestination {
    public static void printArray(int[] nums){
        System.out.print("[ ");
        for(int i=1; i<=nums.length; i++){
            System.out.print(nums[i]+" , ");
        }
        System.out.println(" ]");
    }
    // Brute Force Approach
    public static int sumOfStoD(int[] arr, int source, int destination){
        int sum =0;
        for(int i= source; i<= destination; i++){
            sum += arr[i];
        }
        return sum;
    }
    // Best Approach
    public static void makePrefixSum(int[] arr){
        int sum =0;
        for(int i=1; i<=arr.length; i++){
            sum = sum + arr[i];
            arr[i] = sum;
        }
    }
    public static int sumOfStartToEnd(int[] arr, int start, int destination){
        makePrefixSum(arr);
        return arr[destination] - arr[start-1];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = scanner.nextInt();
        int[] arr = new int[size+1];
        System.out.println("enter the element");
        for(int i=1; i<= arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print("Array is : ");
        printArray(arr);
        System.out.println("enter how many times do you want to sum");
        int wantTime = scanner.nextInt();
        int i=0;
        while(i< wantTime){
            System.out.println("enter source : ");
            int source = scanner.nextInt();
            System.out.println("enter destination : ");
            int destination = scanner.nextInt();
            System.out.println("sum from source to destination : "+sumOfStoD(arr, source, destination));
            System.out.println("sum from start to end : "+sumOfStartToEnd(arr, source, destination));
            i++;
        }

    }
}
