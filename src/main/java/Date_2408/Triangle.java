package Date_2408;

import java.util.Scanner;

//Tam giác
public class Triangle {
    private int a, b, c;

    public Triangle() {

    }

    //Nhập kích thước tam giác
    public void inputTriangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a: ");
        this.a = input.nextInt();
        System.out.print("Input b: ");
        this.b = input.nextInt();
        System.out.print("Input c: ");
        this.c = input.nextInt();
    }

    //Xuất kích thước tam giác
    public void printTriangle() {
        if (this.a + this.b > this.c) {
            System.out.format("Dimensions of 3 sides of triagnle sequently are %d, %d and %d\n", this.a, this.b, this.c);
        } else System.out.println("This is NOT a triangle!!!");
    }

    //Tính chu vi tam giác
    public int perimeterTriangle() {
        return this.a + this.b + this.c;
    }

    //Tính diện tích tam giác
    public Double areaTriangle() {
        int halfPerimeter = perimeterTriangle() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - this.a) * (halfPerimeter - this.b) * (halfPerimeter - this.c));
    }

//Bài thầy sửa theo tọa độ Điểm:
//     private Diem d1, d2, d3;
//
//      public TamGiac() {
//        this.d1 = Diem.generate();
//        this.d2 = Diem.generate();
//        this.d3 = Diem.generate();
//      }
//
//      public TamGiac(Diem d1, Diem d2, Diem d3) {
//        this.d1 = d1;
//        this.d2 = d2;
//        this.d3 = d3;
//      }
//
//      @Override
//      public String toString() {
//        final StringBuffer sb = new StringBuffer("TamGiac {\n");
//        sb
//          .append("  d1 = ").append("(").append(d1.getX()).append(", ").append(d1.getY()).append(")").append("\n")
//          .append("  d2 = ").append("(").append(d2.getX()).append(", ").append(d2.getY()).append(")").append("\n")
//          .append("  d3 = ").append("(").append(d3.getX()).append(", ").append(d3.getY()).append(")").append("\n")
//          .append('}');
//        return sb.toString();
//      }
//
//      public double calculatePerimeter() {
//        double a = this.d1.distance(this.d2);
//        double b = this.d1.distance(this.d3);
//        double c = this.d2.distance(this.d3);
//        return a + b + c;
//      }
//
//      public double calculateArea() {
//        double a = this.d1.distance(this.d2);
//        double b = this.d1.distance(this.d3);
//        double c = this.d2.distance(this.d3);
//        double p = (a + b + c) / 2;
//        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
//      }
}
