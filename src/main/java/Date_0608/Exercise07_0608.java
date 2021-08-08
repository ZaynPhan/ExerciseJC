package Date_0608;
//Tính tiền đi taxi từ số km nhập vào. Biết:
//    a. 1 km đầu giá 15000đ
//    b. Từ km thứ 2 đến km thứ 5 giá 13500đ
//    c. Từ km thứ 6 trở đi giá 11000đ
//    d. Nếu trên 120km được giảm 10% tổng tiền.

import java.util.Scanner;

public class Exercise07_0608 {
    public static void main(String[] args){
        Scanner km = new Scanner(System.in);
        System.out.println("Nhập só km: ");
        int distance = km.nextInt();

        if(distance == 1){
            int taxiFare = distance * 15000;
            System.out.println("Giá taxi là: " + taxiFare + "đồng");
        } else if (distance>1 && distance<6){
            int taxiFare = distance * 13500;
            System.out.println("Giá taxi là: " + taxiFare);
        } else if (distance>=6){
            if(distance >= 120){
                int taxiFare = distance *11000 - (distance * 11000) /10;
                System.out.println("Giá taxi là: " + taxiFare + "đồng");
            }else {
                int taxiFare = distance * 11000;
                System.out.println("Giá taxi là: " + taxiFare + "đồng");
            }
        } else {
            System.out.println("Không tốn tiền!");
        }
    }
}
