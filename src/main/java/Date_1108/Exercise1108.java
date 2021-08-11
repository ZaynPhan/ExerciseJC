package Date_1108;

import Date_0908.exercise0906;


public class Exercise1108 {
    public static void printArray(int[] arr) {
        for (int i = 0; i <= (arr.length - 1); i++) {
            System.out.format("%d, ", arr[i]);
        }
        System.out.println();
    }

    public static boolean isPrimeArr(int[] arr2B) {
        for (int i = 0; i <= (arr2B.length - 1); i++) {
            if (arr2B[i] < 2) {
                return false;
            } else {
                for (int j = 2; j <= Math.sqrt(arr2B[j]); j++) {
                    if (arr2B[j] % j == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isAscending(int[] arr2C) {
        for (int i = 0; i <= (arr2C.length - 1); i++) {
            if (arr2C[i] >= arr2C[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int module4Not5(int[] arr3A) {
        int amount = 0;
        for (int j : arr3A) {
            if ((j % 4 == 0) && (j % 5 != 0)) {
                amount++;
            }
        }
        return amount;
    }

    public static int sumPrimeNumber(int[] arr3B) {
        int sumPrime = 0;
        for (int i : arr3B) {
            if (exercise0906.isPrimeNumber(i)) {
                sumPrime += i;
            }
        }
        return sumPrime;
    }
}
