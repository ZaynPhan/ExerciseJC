package Date_0908;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    //1a. Nhập 1 số nguyên dương. Kiểm tra xem số đó có phải là số đối xứng?
        System.out.println("1a. Nhập n = ");
        int number1A = input.nextInt();
        exercise0906.isSymmetry(number1A);

    //1b. Nhập 1 số nguyên dương. Kiểm tra xem số đó có phải là số chính phương?
        System.out.println("1b. Nhập n = ");
        int number1B = input.nextInt();
        if (exercise0906.isSquareNumber(number1B)){
            System.out.println(number1B + " là số chính phương");
        } else {
            System.out.println(number1B + " KHÔNG PHẢI là số chính phương");
        }

    //2. Nhập một số nguyên dương n. Tính:
    //d. S = 1*2*...*n = n!
        System.out.println("2d. Nhập n =");
        int number2D = input.nextInt();
        int fatorialNumber = exercise0906.calculateFactorial(number2D);
        System.out.println("S = " + fatorialNumber);

    //e. S = 1! + 2! + ... + n!
        System.out.println("2e. Nhập n =");
        int number2E = input.nextInt();
        int factorialSum = exercise0906.factorialSum(number2E);
        System.out.println("S = " + factorialSum);

    //4.Tính tổng các số nguyên tố nhỏ hơn n (0 < n < 50)
        System.out.println("4. Nhập n (0 < n < 50):");
        int number4 = input.nextInt();
        int sumOfPrimeNumber = exercise0906.sumOfPrimeNumber(number4);
        if (number4 < 0 || number4 > 50){
            System.out.println("n không hợp lệ!");
        }else{
            System.out.println("Tổng các số nguyên tố nhỏ hơn n là: " + sumOfPrimeNumber);
        }


        //5.Nhập một số nguyên dương n. Xuất ra số ngược lại. Ví dụ: Nhập 1706  Xuất 6071.
        System.out.println("5. Nhập n nguyên dương: ");
        long Number5 = input.nextInt();
        if (Number5 > 0) {
            System.out.format("Số ngược lại của %d là: ", Number5);
            exercise0906.reversedNumber(Number5);
        }
    }
}




