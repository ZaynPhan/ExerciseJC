package Date_2408;

//Phân số
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(){
    }

    //Nhập phân số:
    public static Fraction fromString(String str) {
        String[] segregation = str.split("/");
        Fraction fraction = new Fraction();
        fraction.numerator = Integer.parseInt(segregation[0]);
        fraction.denominator = Integer.parseInt(segregation[1]);
        return fraction;
    }

    //Kiểm tra là phân số?
    public boolean isFraction() {
        return this.denominator != 0;
    }

    //Xuất phân số:
    public void printFraction() {
        if (isFraction()) {
            System.out.format("%d/%d", this.numerator, this.denominator);
            System.out.println();
        }
    }

    //Rút gọn phân số
    public Fraction reduceFraction() {
        Fraction fr = new Fraction();
        if (isFraction()) {
            for (int i = Math.min(this.numerator, this.denominator); i > 1; i--) {
                if (this.numerator % i == 0 && this.denominator % i == 0) {
                    fr.numerator = this.numerator / i;
                    fr.denominator = this.denominator / i;
                    break;
                }
            }
        }
        return fr;
    }

    //Cộng hai phân số
    public Fraction sum2Fraction (Fraction fr1){
        Fraction fr2 = new Fraction();
        if(isFraction()){
            fr2.numerator = this.numerator* fr1.denominator + this.denominator*fr1.numerator;
            fr2.denominator = this.denominator*fr1.denominator;
        }
        return fr2;
    }

    //Trừ hai phân số
    public Fraction subtract2Fraction (Fraction fr1){
        Fraction fr2 = new Fraction();
        if(isFraction()){
            fr2.numerator = this.numerator* fr1.denominator - this.denominator*fr1.numerator;
            fr2.denominator = this.denominator*fr1.denominator;
        }
        return fr2;
    }

    //Nhân hai phân số
    public Fraction multi2Fraction (Fraction fr1){
        Fraction fr2 = new Fraction();
        if(isFraction()){
            fr2.numerator = this.numerator*fr1.numerator;
            fr2.denominator = this.denominator*fr1.denominator;
        }
        return fr2;
    }

    //Chia hai phân số
    public Fraction divide2Fraction (Fraction fr1){
        Fraction fr2 = new Fraction();
        if(isFraction()){
            fr2.numerator = this.numerator* fr1.denominator;
            fr2.denominator = this.denominator*fr1.numerator;
        }
        return fr2;
    }

    //Tìm ƯCLN:
    public int greatestCommonDivisor(int a, int b) {
        int tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    //Kiểm tra phân số tối giản?
    public boolean isReduceFraction() {
        if (isFraction()) {
            if (Math.abs(greatestCommonDivisor(this.numerator, this.denominator)) == 1) {
                return true;
            }
        }
        return false;
    }

    //Tìm BCNN:
    public int findMinCommonDivisor (int a, int b){
        int minCommonDivisor = Math.max(a, b);
        for (int i = Math.max(a, b); i <= a*b; i++) {
            if(i % a == 0 && i % b == 0){
                minCommonDivisor = i;
                break;
            }
        }
        return minCommonDivisor;
    }


}
