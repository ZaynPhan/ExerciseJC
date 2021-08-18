package Date_1808;

import java.util.Scanner;

public class exercise1808 {
    public static int[][] inputMatrix() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Số dòng: ");
        int r = sc.nextInt();

        System.out.println("Số cột: ");
        int c = sc.nextInt();

        int[][] ret = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.format("a[%d][%d] = ", i, j);
                ret[i][j] = sc.nextInt();
            }
        }
        return ret;
    }

    public static int[][] generateMatrix(int r, int c, int min, int max) {
        int[][] ret = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ret[i][j] = (int) Math.floor(Math.random() * (max - min) + min);
            }
        }
        return ret;
    }

    public static void printMatrix(int[][] a) {
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                System.out.format("%-4d", a[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean hasContainX(int[][] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập x = ");
        int x = sc.nextInt();

        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                if (x == a[i][j]) {
                    System.out.format("Vị trí của x trong mảng là: %d, %d", i, j);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isPrimeNumber(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2, squareRoot = (int) Math.sqrt(n); i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeMatrix(int[][] a) {
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                if (!isPrimeNumber(a[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int findMax(int[][] a) {
        int max = a[0][0];
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                }
            }
        }
        return max;
    }

    public static int sumRow(int[][] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input row index:");
        int r = sc.nextInt();
        int sumR = 0;
        for (int i = 0, rl = a.length; i < rl; i++) {
            sumR += a[r][i];
        }
        return sumR;
    }

    public static int sumColumn(int[][] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input column index:");
        int c = sc.nextInt();
        int sumC = 0;
        for (int i = 0, rc = a[0].length; i < rc; i++) {
            sumC += a[i][c];
        }
        return sumC;
    }

    public static int sumMainDiagonal(int[][] a) {
        int sum = 0;
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0; j < r; j++) {
                if (i == j) {
                    sum += a[i][j];
                }
            }
        }
        return sum;
    }

    public static int sumAuxiliaryDiagonal(int[][] a) {
        int sum = 0;
        for (int i = 0, r = a.length; i < r; i++) {
            sum += a[i][r - 1 - i];
        }
        return sum;
    }

    public static int sumHalfAboveMainDiagonal(int[][] a) {
        int sum = 0;
        for (int j = 0, m = a.length; j < m; j++) {
            for (int i = 0; i <= j; i++) {
                sum += a[i][j];
            }
        }
        return sum;
    }

    public static int sumHalfUnderneathMainDiagonal(int[][] a) {
        int sum = 0;
        for (int i = 0, m = a.length; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                sum += a[i][j];
            }
        }
        return sum;
    }

    public static int sumHalfAboveAuxiliaryDiagonal(int[][] a) {
        int sum = 0;
        for (int j = 0, l = a.length; j < l; j++) {
            for (int i = 0; i < (l - j); i++) {
                sum += a[i][j];
            }
        }
        return sum;
    }

    public static int sumHalfUnderneathAuxiliaryDiagonal(int[][] a) {
        int sum = 0;
        for (int j = 0, l = a.length; j < l; j++) {
            for (int i = l - 1 - j; i < l; i++) {
                sum += a[i][j];
            }
        }
        return sum;
    }
}

