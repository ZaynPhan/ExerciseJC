package Date_1808;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        int[][] a = exercise1808.generateMatrix(3, 4, 0, 30);
        exercise1808.printMatrix(a);

      //1. Viết chương trình tìm xem ma trận kích thước m x n
      // có chứa phần tử có giá trị x hay không
        if (exercise1808.hasContainX(a)) {
            System.out.println(exercise1808.hasContainX(a));
        } else {
            System.out.println("Ma trận a KHÔNG chứa x!");
        }
        System.out.println();

     //2. Cho trước ma trận a kích thước m x n. Ma trận a có
     // phải là ma trận toàn các số nguyên tố hay không?
        int[][] arr2 = exercise1808.generateMatrix(3, 4, 2, 30);
        exercise1808.printMatrix(arr2);
        if (exercise1808.isPrimeMatrix(arr2)) {
            System.out.println("Ma trận toàn số nguyên tố");
        } else {
            System.out.println("Ma trận KHÔNG chứa toàn số nguyên tố!");
        }
        System.out.println();

        //3. Cho trước ma trận a, kích thước m x n.
        // Tìm giá trị lớn nhất trong ma trận (gọi là max)
        int[][] arr3 = exercise1808.generateMatrix(3, 5, 3, 20);
        exercise1808.printMatrix(arr3);
        System.out.format("Max elment is %d", exercise1808.findMax(arr3));
        System.out.println();

        //4.Cho trước ma trận a, kích thước m x n. Tính tổng các phần tử trên:
        //a. Dòng d, cột c
        int[][] arr4A = exercise1808.generateMatrix(3, 4, 1, 30);
        exercise1808.printMatrix(arr4A);

        Scanner sc = new Scanner(System.in);
        System.out.println("Input row index:");
        int r = sc.nextInt();
        System.out.println("Input column index:");
        int c = sc.nextInt();

        if (c >= 0 && c < arr4A[0].length && r >= 0 && r < arr4A.length) {
            int sumRowColumn = exercise1808.sumRow(arr4A) + exercise1808.sumColumn(arr4A) - arr4A[r][c];
            System.out.format("Total value of row %d and column %d is %d", r, c, sumRowColumn);
        } else System.out.println("Index is invalid!!");
        System.out.println();

        //b. Đường chéo chính, đường chéo phụ (ma trận vuông mxm)
        System.out.println("Input row/column: ");
        int m = sc.nextInt();

        int[][] arr4B = exercise1808.generateMatrix(m, m, 5, 30);
        exercise1808.printMatrix(arr4B);
        if (m % 2 == 0) {
            int sum = exercise1808.sumMainDiagonal(arr4B) + exercise1808.sumAuxiliaryDiagonal(arr4B);
            System.out.format("Sum of main and auxiliary diagonals is: %d", sum);
        } else {
            int midIdx = (m - 1) / 2;
            int sum = exercise1808.sumMainDiagonal(arr4B) + exercise1808.sumAuxiliaryDiagonal(arr4B) - arr4B[midIdx][midIdx];
            System.out.format("Sum of main and auxiliary diagonals is: %d", sum);
        }
        System.out.println();

        //c. Nửa trên/dưới đường chéo chính (ma trận vuông)
        System.out.println("Input row/column: ");
        int n = sc.nextInt();

        int[][] arr4C = exercise1808.generateMatrix(n, n, 0, 40);
        exercise1808.printMatrix(arr4C);

        int sumAboveMain = exercise1808.sumHalfAboveMainDiagonal(arr4C);
        System.out.format("Sum of elements above main diagonal is %d", sumAboveMain);

        System.out.println();
        int sumUnderneathMain = exercise1808.sumHalfUnderneathMainDiagonal(arr4C);
        System.out.format("Sum of elements underneath main diagonal is %d", sumUnderneathMain);
        System.out.println();

        //d.Nửa trên/dưới đường chéo phụ (ma trận vuông)
        System.out.println("Input row/column: ");
        int l = sc.nextInt();

        int[][] arr4D = exercise1808.generateMatrix(l, l, 0, 10);
        exercise1808.printMatrix(arr4D);

        int sumAboveAuxiliary = exercise1808.sumHalfAboveAuxiliaryDiagonal(arr4D);
        System.out.format("Sum of elements above auxiliary diagonal is %d", sumAboveAuxiliary);

        System.out.println();
        int sumUnderneathAuxiliary = exercise1808.sumHalfUnderneathAuxiliaryDiagonal(arr4D);
        System.out.format("Sum of elements underneath auxiliary diagonal is %d", sumUnderneathAuxiliary);
    }
}
