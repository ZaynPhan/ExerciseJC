package Date_0908;

public class exercise0906 {
    static void isSymmetry(int number1A) {
        int reversed = 0;
        int origin = number1A;
        while (number1A >= 0) {
            int digit = number1A % 10;
            reversed = reversed * 10 + digit;
            number1A /= 10;
            if (number1A == 0) {
                break;
            }
        }
        if (reversed == origin) {
            System.out.println("Đối xứng!");
        } else {
            System.out.println("Không đối xứng!");
        }
    }

    static boolean isSquareNumber(double number1B) {
        double squareRoot = Math.sqrt(number1B);
        return ((squareRoot - Math.floor(squareRoot)) == 0);
    }

        static long calculateFactorial(int number2D) {
        long factorialResult = 1;
        for (int i = 2; i <= number2D; i++) {
            factorialResult *= i;
        }
        return factorialResult;
    }

    static int factorialSum(int number2E) {
        int sum = 0;
        for (int i = 1; i <= number2E; i++) {
            sum += calculateFactorial(i);
        }
        return sum;
    }

    static boolean isPrimeNumber(int number4) {
        if (number4 < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number4); i++) {
                if (number4 % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    static int sumOfPrimeNumberSum (int number4) {
        int sum = 0 ;
        for (int i = 0; i < number4; i++) {
            if (isPrimeNumber(i)) {
                sum += i;
            }
        }
        return sum;
    }

    static int reversedNumber (int Number5) {
        int unit = 0;
        while (Number5 != 0) {
            unit = Number5 % 10;
            System.out.print(unit);
            Number5 /= 10;
        }
        return Number5;
    }
}
