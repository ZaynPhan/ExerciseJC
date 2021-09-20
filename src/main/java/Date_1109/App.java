package Date_1109;
//Câu 1
//Một thương nhân thu mua bất động sản ở nhiều nơi. Mỗi lần mua,
// anh ta ghi nhận lại thông tin của mảnh đất (vốn có hình dạng không giống nhau) mình vừa mua
// được gồm các thông tin:
//-Hình chữ nhật: điểm-trái-trên, chiều-dài, chiều-rộng
//-Hình vuông: topLeft, chiều-rộng
//-Hình tròn: trung-tâm, bán-kính
//-Hình tam giác: 3 điểm
//*** Hãy xây dựng chương trình Java cho phép
//a. Ghi nhận thông tin các mảnh đất mà thương nhân mua được từ console
//b. Xuất ra thông tin các mảnh đất có một loại hình dạng nào đó (ví dụ: hình vuông, hình tròn, …)
//c. Nhận thông tin giá đất trên m2 từ console, hãy cho biết tổng tiền
//mà thương nhân cần chi trả để sở hữu tất cả các mảnh đất

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //a. Ghi nhận thông tin các mảnh đất mà thương nhân mua được từ console
        System.out.print("Số mảnh đất: ");
        int n = Integer.parseInt(input.nextLine());

        LandShape[] listLand = new LandShape[n];
        for (int i = 0; i < n; i++) {
            System.out.format("Mảnh đất thứ %d\n", i + 1);
            System.out.print("- Hình dạng mảnh đất (0. Chữ nhật / 1. Vuông / 2. Tròn / 3. Tam giác): ");
            int type = Integer.parseInt(input.nextLine());

            if (type == 0) {
                listLand[i] = new Rectangle();
            } else if (type == 1) {
                listLand[i] = new Square();
            } else if (type == 2) {
                listLand[i] = new Circle();
            } else {
                listLand[i] = new Triangle();
            }
            listLand[i].fromConsole(input);
        }

        //Xuất thông tin tất cả đất
        for (LandShape ls : listLand) {
            System.out.println(ls);
        }

        //b. Xuất thông tin tất cả đất có dạng chỉ định
        System.out.println("There are all Rectangle lands as below: ");
        for (LandShape landShape : listLand) {
            if (landShape instanceof Rectangle) {
                System.out.println(landShape);
            }
        }

        //c. Nhận thông tin giá đất trên m2 từ console, hãy cho biết tổng tiền
        // mà thương nhân cần chi trả để sở hữu tất cả các mảnh đất
        double totalPrice = 0;
        for (int i = 0; i < n; i++) {
            totalPrice += listLand[i].getPricePerLand();
        }

        System.out.println("Total expense for all lands is " + totalPrice);
    }
}
