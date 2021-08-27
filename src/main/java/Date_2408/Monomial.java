package Date_2408;

import java.util.Scanner;

//Đơn thức ax^n
public class Monomial {
    private int ax, index;

    public Monomial() {
    }

//    public Monomial(int a, int index) {
//        this.ax = a;
//        this.index = index;
//    }
//
//    public int getAx() {
//        return this.ax;
//    }
//
//    public int getIndex() {
//        return this.index;
//    }

    //Nhập đơn thức
    public void inputMonomial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input ax: ");
        this.ax = input.nextInt();
        System.out.print("Input index number: ");
        this.index = input.nextInt();
    }

    //Xuất đơn thức
    public void printMonomial() {
        if (this.ax == 0) {
            System.out.println("0");
        } else if (this.ax == 1 || this.index == 0) {
            System.out.println("1");
        } else if (this.index == 1) {
            System.out.println(this.ax);
        } else {
            System.out.format("%dx^%d\n", this.ax, this.index);
        }
    }

    //Monomial to String
    public String monomialToString() {
        if (this.ax == 0)
            return String.valueOf(0);

        if (this.ax == 1 || this.index == 0)
            return String.valueOf(1);

        if (this.index == 1)
            return String.format("%sx", this.ax);

        return String.format("%dx^%d", this.ax, this.index);
    }

    //Nhân 2 đơn thức cùng biến x
    public Monomial multiMonomial(Monomial a, Monomial b) {
        Monomial multi = new Monomial();
        multi.ax = a.ax * b.ax;
        multi.index = a.index + b.index;
        return multi;
    }

    //Chia 2 đơn thức cùng biến x
    public Monomial divideMonomial(Monomial a, Monomial b) {
        Monomial divide = new Monomial();
        divide.ax = a.ax / b.ax;
        divide.index = Math.abs(a.index - b.index);
        return divide;
    }

    //Đạo hàm cấp 1 của ax^n
    public Monomial firstDegreeDerivative(Monomial a) {
        a.ax = this.ax * this.index;
        a.index = this.index - 1;
        return a;
    }

    //Đạo hàm cấp k của ax^n
    public Monomial kThDegreeDerivative(Monomial a, int k) {
        if (k >= 1) {
            for (int i = 1; i <= k; i++) {
                a.ax = this.ax * this.index;
                a.index = this.index - 1;
            }
        }
        return a;
    }

    //Tính giá trị đơn thức tại x = x0
    public void calculateWithX0(Monomial a, int x) {
        System.out.format("F(%d) is %s\n", x, a.ax * Math.pow(x, a.index));
    }
}