package Rupesh.Sorting.com;

//public class Rupesh.Sorting.com.Demo {
    //    public static boolean checkPrime(int num){
//        int count=0;
//        for(int i=1; i<=num/2; i++){
//            if(num%i==0){
//                count++;
//            }
//        }
//        if(count==1){
//            return true;
//        }
//        else {
//            return false;
//        }
//
//    }
public class Demo {
    public static void main(String[] args) {
        int count;
        for (int i = 1; i <= 100; i++) {
            count=0;
            for(int j=1; j<=i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
                if(count==2){
                    System.out.print(i+" ");
                }
            }
        }
    }

