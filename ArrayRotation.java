package BasicArrayProgramming;

import java.util.Arrays;

public class ArrayRotation {
    public static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] temp = arr.clone();
        for (int i = 0; i < n; i++) {
            arr[(i + k) % n] = temp[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int k = 2;
        System.out.println("Rotated array:"+Arrays.toString(rotateArray(array, k)));
    }
}
