package Date_1108;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //2. Các thao tác kiểm tra
        //b. Mảng có phải là mảng toàn số nguyên tố?
        System.out.println("==========Exercise 2B==========");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng: ");
        int n = input.nextInt();
        int[] arr2B = new int[n];
        for (int i = 0; i <= (n - 1); i++) {
            System.out.format("a[%d] = ", i);
            arr2B[i] = input.nextInt();
        }
        Exercise1108.printArray(arr2B);

        boolean checkPrimeArr = Exercise1108.isPrimeArr(arr2B);
        if (checkPrimeArr) {
            System.out.println("Là mảng chứa toàn số nguyên tố");
        } else {
            System.out.println("KHÔNG PHẢI là mảng chứa toàn số nguyên tố");
        }

        //2. Các thao tác kiểm tra
        //c. Mảng có phải là mảng tăng dần?
        System.out.println("==========Exercise 2C==========");
        System.out.print("Nhập độ dài mảng: ");
        int l = input.nextInt();
        int[] arr2C = new int[l];
        for (int i = 0; i <= (l - 1); i++) {
            System.out.format("a[%d] = ", i);
            arr2C[i] = input.nextInt();
        }
        Exercise1108.printArray(arr2C);

        if (Exercise1108.isAscending(arr2C)) {
            System.out.println("Là mảng tăng dần");
        } else {
            System.out.println("KHÔNG PHẢI Là mảng tăng dần");
        }

        //3. Các thao tác tính toán
        //a. Có bao nhiêu số chia hết cho 4 nhưng không chia hết cho 5
        System.out.println("==========Exercise 3A==========");
        System.out.print("Nhập độ dài mảng: ");
        int m = input.nextInt();
        int[] arr3A = new int[m];
        for (int i = 0; i <= (m - 1); i++) {
            System.out.format("a[%d] = ", i);
            arr3A[i] = input.nextInt();
        }
        Exercise1108.printArray(arr3A);

        System.out.format("Có %d số chia hết cho 4 nhưng không chia hết cho 5", Exercise1108.module4Not5(arr3A));
        System.out.println();

        //b. Tổng các số nguyên tố có trong mảng
        System.out.println("==========Exercise 3B==========");
        System.out.print("Nhập độ dài mảng: ");
        int o = input.nextInt();
        int[] arr3B = new int[o];
        for (int i = 0; i <= (o - 1); i++) {
            System.out.format("a[%d] = ", i);
            arr3B[i] = input.nextInt();
        }
        Exercise1108.printArray(arr3B);
        System.out.format("Tổng các số nguyên tố trong mảng 3B là: %d", Exercise1108.sumPrimeNumber(arr3B));


        //5d. Sắp xếp mảng sao cho các số dương đứng đầu mảng giảm dần, kế đến là các số âm tăng dần
        //cuối cùng là các số 0.
        System.out.println("==========Exercise 5D==========");
        System.out.print("Nhập độ dài mảng: ");
        int p = input.nextInt();
        int[] arr5D = new int[p];
        for (int i = 0; i <= (p - 1); i++) {
            System.out.format("a[%d] = ", i);
            arr5D[i] = input.nextInt();
        }
        Exercise1108.printArray(arr5D);
        System.out.println("Mảng sau khi được sắp xếp thỏa đề bài là:");
        for (int i = 0; i < arr5D.length; i++) {
            Exercise1108.sort(arr5D);
        }
    }
}
