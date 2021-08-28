package Date_2408;

import java.util.Scanner;

//Điểm trong mặt phẳng tọa độ Oxy:
public class Point {
    private int x, y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public static Point generate() {
        final int max = 10;
        final int min = -10;
        int x = (int) Math.floor(Math.random() * (max - min)) + min;
        int y = (int) Math.floor(Math.random() * (max - min)) + min;
        return new Point(x, y);
    }

    //Nhập tọa độ x, y
    public void inputPoint() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input x: ");
        this.x = input.nextInt();
        System.out.print("Input y: ");
        this.y = input.nextInt();
    }

    //Xuất tọa độ x, y
    public void printPoint() {
        System.out.format("(%d,%d)\n", this.x, this.y);
    }

    //Point to String
    public String pointToString() {
        return String.format("(%d,%d)\n", this.x, this.y);
    }

    //Khoảng cách giữa 2 điểm
    public Double toPoint(Point a) {
        return Math.sqrt(Math.pow(this.x - a.x, 2) + Math.pow(this.y - a.y, 2));
    }

    //Điểm đối xứng qua gốc tọa độ (0,0)
    public Point symmetricThoughO() {
        Point dxO = new Point();
        dxO.x = -this.x;
        dxO.y = -this.y;
        return dxO;
    }

    //Điểm đối xứng 0x
    public Point symmetricOxWith() {
        Point dxOx = new Point();
        dxOx.x = this.x;
        dxOx.y = -this.y;
        return dxOx;
    }

    //Điểm đối xứng 0x
    public Point symmetricOyWith() {
        Point dxOy = new Point();
        dxOy.x = -this.x;
        dxOy.y = this.y;
        return dxOy;
    }

    //Kiểm tra điểm thuộc phần tư nào?
    public void inQuadrant() {
        if (this.x > 0 && this.y > 0) {
            System.out.println("This point is in Quadrant I");
        } else if (this.x < 0 && this.y > 0) {
            System.out.println("This point is in Quadrant II");
        } else if (this.x < 0 && this.y < 0) {
            System.out.println("This point is in Quadrant III");
        } else {
            System.out.println("This point is in Quadrant IV");
        }
    }

}
