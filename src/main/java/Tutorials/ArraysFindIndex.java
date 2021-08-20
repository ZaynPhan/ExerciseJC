package Tutorials;

//public class ArraysFindIndex {
//    public static void main(String[] args) {
//        int[] arr = generateArray(10, -30, -2);
//        printArray(arr);
//        System.out.format("MAX = %d\n", findMax(arr));
//        System.out.format("MIN = %d\n", findMin(arr));
//        System.out.format("MAX = %d\n", arr[findMaxIndex(arr)]);
//        System.out.format("MAX = %d\n", arr[findMaxIndex(arr)]);

//        int findFistNegIdx = findFirstNegativeIndex(arr);
//        if(findFistNegIdx >= 0) {
//            System.out.format("First Negative value = %d, Index = %d\n", arr[findFistNegIdx], findFistNegIdx);
//        } else System.out.println("Không có phần tử âm trong mảng!");

//        int findLastIdx = findLastPositiveIndex(arr);
//        if(findLastIdx >= 0) {
//            System.out.format("Last Post value = %d, Index = %d\n", arr[findLastIdx], findLastIdx);
//        } else System.out.println("Không có phần tử dương trong mảng!");
//
//        int minPosIdx = findMinPositiveIndex(arr);
//        if (minPosIdx >= 0) {
//            System.out.format("Last Post value = %d, Index = %d\n", arr[minPosIdx], minPosIdx);
//        } else System.out.println("Không có phần tử dương trong mảng!");
//
//        int maxNegIdx = findMaxNegativeIndex(arr);
//        if (maxNegIdx >= 0) {
//            System.out.format("Max Post value = %d, Index = %d\n", arr[maxNegIdx], maxNegIdx);
//        } else System.out.println("Không có phần tử âm trong mảng!");
//    }
//
//    public static void printArray(int[] arr) {
//        for (int i = 0; i <= (arr.length - 1); i++) {
//            System.out.format("%d, ", arr[i]);
//        }
//        System.out.println();
//    }
//
//    public static int[] generateArray(int n, int min, int max) {
//        int[] ret = new int[n];
//        for (int i = 0; i < ret.length; i++) {
//            ret[i] = (int) Math.floor(Math.random() * (max - min)) + min;
//        }
//
//        return ret;
//    }
//
//    public static int findMax(int[] arr) {
//        int max = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//
//        return max;
//    }
//
//    public static int findMin(int[] arr) {
//        int min = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > min) {
//                min = arr[i];
//            }
//        }
//
//        return min;
//    }
//
//    public static int findMaxIndex(int[] arr) {
//        int idx = 0;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > arr[idx]) {
//                idx = i;
//            }
//        }
//        return idx;
//    }
//
//    public static int findFirstNegativeIndex(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 0) {
//                return i;
//            }
//        }
//
//        return -1; //Không có phần tử âm
//    }
//
//    public static int findLastPositiveIndex(int[] arr) {
//        for (int i = arr.length - 1; i >= 0; i--) {
//            if (arr[i] > 0) {
//                return i;
//            }
//        }
//
//        return -1; //Không có phần tử dương
//    }
//
//    public static int findMinPositiveIndex(int[] arr) {
//        int lastPosIdx = findLastPositiveIndex(arr);
//        if (lastPosIdx < 0) {
//            return -1;
//        }
//
//        int minPosIdx = lastPosIdx;
//        for (int i = lastPosIdx - 1; i >= 0; i--) {
//            if (arr[i] > 0 && arr[i] < arr[minPosIdx]) {
//                minPosIdx = i;
//            }
//        }
//
//        return minPosIdx;
//    }
//
//    public static int findMaxNegativeIndex(int[] arr) {
//        int maxNegIdx = -1;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 0 && (maxNegIdx == -1 || arr[i] > arr[maxNegIdx])){
//                maxNegIdx = i;
//            }
//        }
//
//        return maxNegIdx;
//    }

