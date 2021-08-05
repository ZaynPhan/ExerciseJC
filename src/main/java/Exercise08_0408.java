//Nhập bán kính của đường tròn.
//Tính chu vi và diện tích của hình tròn đó.

public class Exercise08_0408 {
    public static void main(String[] args){
        final double PI = 3.14;
        double R = 4.55;
        double C = 2 * PI * R;
        double S = R * R * PI;
        System.out.println("Chu vi đường tròn là: " + C);
        System.out.println("Diện tích hình tròn là: " + S);
    }
}
