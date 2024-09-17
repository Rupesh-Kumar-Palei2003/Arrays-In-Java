package BasicArrayProgramming;

/*
 Question : find unique number in a given array where all the elements are being repeated
            twice with one value being unique.
 */
public class FindUniqueNumber {
    public static void findUnique1(int[] arr){
        boolean[] unSeen = new boolean[arr.length];
        for(int i=0; i<arr.length ; i++){
            unSeen[i] = true;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    unSeen[i] = false;
                    break;
                }
            }
        }
        for(int i=0; i< unSeen.length; i++){
            if(unSeen[i]){
                System.out.println("unique element is : "+arr[i]);
                return;
            }
        }
    }

    public static void findUnique2(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                    break;
                }
            }
        }
        for(int value : arr){
            if( value > 0){
                System.out.println("Unique number is : "+value);
                return;
            }
        }
    }


    public static void findUnique3(int[] arr){
        int uniqueNumber = arr[0];
        for(int i=1; i<arr.length; i++){
            uniqueNumber = uniqueNumber ^ arr[i];
        }
        System.out.println("Unique number is : "+uniqueNumber);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1, 3};
        findUnique1(arr);
        findUnique2(arr);
        findUnique3(arr);
    }
}
