package Date_1109;

//-Hình tam giác: 3 điểm

import java.util.Scanner;

public class Triangle extends LandShape {
    protected Point pointB, pointC;

    public Triangle() {
    }

    public Triangle(Point pointA, double landArea, double pricePerUnit,
                    double pricePerLand, Point pointB, Point pointC) {
        super(pointA, landArea, pricePerUnit, pricePerLand);
        this.pointB = pointB;
        this.pointC = pointC;
    }

    //Tính diện tích tam giác khi có tọa độ 3 điểm
    public static double getLandArea(Point pointA, Point pointB, Point pointC) {
        return 1 / 2 * Math.abs((pointB.getX() - pointA.getX()) * (pointC.getY() - pointA.getY())
                - (pointC.getX() - pointA.getX()) * (pointB.getY() - pointA.getY()));
    }

    //Nhập thông tin đất
    @Override
    public void fromConsole(Scanner input) {
        System.out.println("Coordinates of 3 points are: ");
        System.out.println("Point A:");
        System.out.print("x = ");
        int x = input.nextInt();
        System.out.print(", y = ");
        int y = input.nextInt();
        this.pointA = new Point(x, y);

        System.out.println("Point B:");
        System.out.print("x = ");
        int z = input.nextInt();
        System.out.print(", y = ");
        int k = input.nextInt();
        this.pointB = new Point(z, k);

        System.out.println("Point C:");
        System.out.print("x = ");
        int i = input.nextInt();
        System.out.print(", y = ");
        int j = input.nextInt();
        this.pointC = new Point(i, j);

        System.out.print("Price of 1 unit of square land: ");
        this.pricePerUnit = input.nextInt();
    }

    //Xuất thông tin đất
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Triangle Land {");
        sb.append("Point A = ").append(pointA.toString());
        sb.append(", point B = ").append(pointB.toString());
        sb.append(", point C = ").append(pointC.toString());
        sb.append(", land area = ").append(Triangle.getLandArea(pointA, pointB, pointC));
        sb.append(", price/unit = ").append(pricePerUnit);
        sb.append(", price/land = ").append(landArea * Triangle.getLandArea(pointA, pointB, pointC));
        sb.append('}');
        return sb.toString();
    }

}
