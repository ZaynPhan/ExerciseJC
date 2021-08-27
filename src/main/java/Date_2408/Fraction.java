package Date_2408;

import java.util.Scanner;

//Phân số
public class Fraction {
    private int numerator, denominator;

//    public int getNumerator() {
//        return this.numerator;
//    }
//
//    public int getDenominator() {
//        return this.denominator;
//    }

    public Fraction() {
    }

//    public Fraction(int numerator, int denominator) {
//        this.numerator = numerator;
//        this.denominator = denominator;
//    }

    //Nhập phân số:
    public void inputFraction() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input numberator: ");
        this.numerator = input.nextInt();
        System.out.print("Input denominator: ");
        this.denominator = input.nextInt();
    }

    public static Fraction fromString(String str) {
        String[] segregation = str.split("/");
        Fraction fraction = new Fraction();
        fraction.numerator = Integer.parseInt(segregation[0]);
        fraction.denominator = Integer.parseInt(segregation[1]);
        return fraction;
    }

    //Fraction to String
    public String fractionToString() {
        return String.format("%d/%d", this.numerator, this.denominator);
    }

    //Xuất phân số:
    public void printFraction() {
        System.out.format("%d/%d\n", this.numerator, this.denominator);
    }

    //Kiểm tra là phân số?
    public boolean isFraction() {
        return this.denominator != 0;
    }

    //Tìm ƯCLN:
    private static int greatestCommonDivisor(int a, int b) {
        if (a == b)
            return a;

        if (a > b) {
            return greatestCommonDivisor(a - b, b);
        }

        return greatestCommonDivisor(a, b - a);
    }

    //Kiểm tra phân số tối giản?
    public boolean isReducible() {
        if (isFraction()) {
            return Math.abs(greatestCommonDivisor(this.numerator, this.denominator)) == 1;
        }
        return false;
    }

    //Rút gọn phân số
    public void reduceFraction() {
        int gcd = greatestCommonDivisor(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    //Kiểm tra âm hay dương?
    public boolean isPositive() {
        if (this.numerator == 0) {
            return false;
        }
        return (this.numerator > 0 && this.denominator > 0) || (this.numerator < 0 && this.denominator < 0);
    }

    //So sánh 2 phân số:
    public int compareTo(Fraction fr1) {
        int tmp1 = this.numerator * fr1.denominator;
        int tmp2 = this.denominator * fr1.numerator;

        return Integer.compare(tmp1, tmp2);
    }

    //Cộng hai phân số
    public Fraction sum2Fraction(Fraction fr1) {
        Fraction fr2 = new Fraction();
        if (isFraction()) {
            fr2.numerator = this.numerator * fr1.denominator + this.denominator * fr1.numerator;
            fr2.denominator = this.denominator * fr1.denominator;
        }
        return fr2;
    }

    //Trừ hai phân số
    public Fraction subtract2Fraction(Fraction fr1) {
        Fraction fr2 = new Fraction();
        if (isFraction()) {
            fr2.numerator = this.numerator * fr1.denominator - this.denominator * fr1.numerator;
            fr2.denominator = this.denominator * fr1.denominator;
        }
        return fr2;
    }

    //Nhân hai phân số
    public Fraction multi2Fraction(Fraction fr1) {
        Fraction fr2 = new Fraction();
        if (isFraction()) {
            fr2.numerator = this.numerator * fr1.numerator;
            fr2.denominator = this.denominator * fr1.denominator;
        }
        return fr2;
    }

    //Chia hai phân số
    public Fraction divide2Fraction(Fraction fr1) {
        Fraction fr2 = new Fraction();
        if (isFraction()) {
            fr2.numerator = this.numerator * fr1.denominator;
            fr2.denominator = this.denominator * fr1.numerator;
        }
        return fr2;
    }


    //Tìm BCNN:
    public int findMinCommonDivisor(int a, int b) {
        int minCommonDivisor = Math.max(a, b);
        for (int i = Math.max(a, b); i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                minCommonDivisor = i;
                break;
            }
        }
        return minCommonDivisor;
    }

    //Quy đồng 2 phân số:
    public Fraction reduceFractionToCommonDenominator(Fraction another) {
        Fraction fr1 = new Fraction();
        int minCommonDivisor = findMinCommonDivisor(this.denominator, another.denominator);
        fr1.numerator = this.numerator * (minCommonDivisor / this.denominator);
        fr1.denominator = minCommonDivisor;
        return fr1;
    }

    //
}
