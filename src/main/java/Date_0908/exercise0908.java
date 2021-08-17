package Date_0908;

public class exercise0908 {
    public static boolean isSymmetry(int number1A) {
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
            return true;
        } else {
            System.out.println("Không đối xứng!");
            return false;
        }
    }

    static boolean isSquareNumber(double number1B) {
        double squareRoot = Math.sqrt(number1B);
        return ((squareRoot - Math.floor(squareRoot)) == 0);
    }

    static int calculateFactorial(int number2D) {
        int factorialResult = 1;
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

    public static boolean isPrimeNumber(int number4) {
        if (number4 < 2) {
            return false;
        } else if (number4 == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(number4); i++) {
                if (number4 % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    static int sumOfPrimeNumber(int number4) {
        int sum = 0;
        for (int i = 0; i < number4; i++) {
            if (isPrimeNumber(i)) {
                sum += i;
            }
        }
        return sum;
    }

    static long reversedNumber(long Number5) {
        long unit = 0L;
        while (Number5 != 0) {
            unit = Number5 % 10;
            System.out.print(unit);
            Number5 /= 10;
        }
        return Number5;
    }

    public static void multi2SumNumber() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if ((i * j == 2 * (i + j)) && ((10 * i + j) <= 99)) {
                    int a = 10 * i + j;
                    System.out.format("%d ", a);
                }
            }
        }
    }

    public static int greatestCommonDivisor(int a, int b) {
        int max, greatestDivisor = 0;
        if (a > b) {
            max = a;
        } else max = b;
        for (int i = 1; i <= max; i++) {
            if ((a % i == 0 && b % i == 0)) {
                greatestDivisor = i;
            }
        }
        return greatestDivisor;
    }

    public static void fibonacyNumber(int number8) {
        int i = 1;
        int j = 1;
        if (number8 == 0) {
            System.out.print(i);
        } else if (number8 == 1) {
            System.out.print(i + ", " + j);
        } else if (number8 > 1) {
            System.out.print(i + ", " + j + ", ");
            while (i <= number8) {
                int numN = i + j;
                if (numN == number8) {
                    break;
                }else {
                    System.out.print(numN + ", ");
                    i = j;
                    j = numN;
                }
            }
        } else {
            System.out.print("n không hợp lệ!");
        }
    }
}


