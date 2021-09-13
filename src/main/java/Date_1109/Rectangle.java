package Date_1109;

//-Hình chữ nhật: điểm-trái-trên, chiều-dài, chiều-rộng

import java.util.Scanner;

public class Rectangle extends LandShape {
    protected int width, longs;

    public Rectangle() {
    }

    public Rectangle(Point pointA, double landArea, double pricePerUnit, double pricePerLand, int width, int longs) {
        super(pointA, landArea, pricePerUnit, pricePerLand);
        this.width = width;
        this.longs = longs;
    }

    //Tính diện tích đất
    @Override
    public double getLandArea() {
        return this.width * this.longs;
    }

    //Nhập thông tin đất
    @Override
    public void fromConsole(Scanner input) {
        System.out.println("Coordinates of the top-left point are: ");
        System.out.print("x = ");
        int x = input.nextInt();
        System.out.print("y = ");
        int y = input.nextInt();
        this.pointA = new Point(x, y);

        System.out.print("The longs of rectangle land: ");
        this.longs = input.nextInt();
        System.out.print("The width of rectangle land: ");
        this.width = input.nextInt();

        System.out.print("Price of 1 unit of rectangle land: ");
        this.pricePerUnit = input.nextInt();
    }

    //Xuất thông tin đất
    @Override
    public String toString() {
        Rectangle rectangle = new Rectangle();
        final StringBuffer sb = new StringBuffer("Rectangle land {");
        sb.append("Top-left point = ").append(pointA.toString());
        sb.append(", longs = ").append(longs);
        sb.append(", width = ").append(width);
        sb.append(", land area = ").append(rectangle.getLandArea());
        sb.append(", price/unit = ").append(pricePerUnit);
        sb.append(", price/land = ").append(pricePerUnit * rectangle.getLandArea());
        sb.append('}');
        return sb.toString();
    }
}
