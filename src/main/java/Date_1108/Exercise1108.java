package Date_1108;

public class Exercise1108 {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.format("%d, ", arr[i]);
        }
        System.out.println();
    }

    public static boolean isPrimeNumber(int[] arr2B) {
        for (int n : arr2B) {
            if (n < 2) {
                return false;
            } else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isAscending(int[] arr2C){
        for (int i = 0; i <= arr2C.length - 1; i++) {
            if (arr2C[i] >= arr2C[i+1]){
                return false;
            }
        }
        return true;
    }

    public static int module4Not5(int[] arr3A){
        int amount = 0;
        for (int i = 0; i < arr3A.length; i++) {
            if ((arr3A[i] % 4 == 0) && (arr3A[i] % 5 !=0)){
                amount++;
            }
        }
        return amount;
    }

    public static int sumPrimeNumber(int[] arr3B){
        int sum = 0;
        for (int i = 0; i < arr3B.length; i++) {
            if(isPrimeNumber(arr3B[i])){
                sum += arr3B[i];
            }
        }
        return sum;
    }
}
