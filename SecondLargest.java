package BasicArrayProgramming;

public class SecondLargest {
    public static int findMaxElement(int[] arr){
        int maxElement = Integer.MIN_VALUE;
        for (int currentElement : arr) {
            if (maxElement < currentElement) {
                maxElement = currentElement;
            }
        }
        return maxElement;
    }
    public static int secondLargest(int[] arr){
        int eliminateLargest = findMaxElement(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i] == eliminateLargest){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        return findMaxElement(arr);
    }
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 9, 15, 7};
        System.out.println("second largest element is : "+secondLargest(arr));

    }
}
