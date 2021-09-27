package Date_2509;

/*ArrayList
Xây dựng chương trình cho phép người dùng chọn
các chức năng sau:
– Nhập vào danh sách các phân số, sau đó cho phép
– Xuất danh sách phân số
– Thêm phân số
– Xóa phân số tại vị trí thứ k
– Cập nhật phân số tại vị trí thứ k
– Tìm các phân số có giá trị lớn nhất
– Xóa tất cả các phân số
 */

import Date_2408.Fraction;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Nhập vào danh sách các phân số
        System.out.println("Input quantity of fraction: ");
        int capacity = input.nextInt();
        ArrayList<Fraction> listFraction = new ArrayList<>(capacity);

        System.out.println("Input fraction(s): ");
        for (int i = 0; i < capacity; i++) {
            listFraction.add(i, Fraction.fromString(input.nextLine()));
        }

        //Danh sách các lệnh được lặp lại mãi mãi theo id
        do {
            System.out.println("These are your commands, pick 1 of them");
            System.out.println("1. Print list of input fractions");
            System.out.println("2. Add 1 more fraction to list");
            System.out.println("3. Eliminate fraction at index k");
            System.out.println("4. Update fraction at index k");
            System.out.println("5. Scan for the biggest fraction");
            System.out.println("6. Eliminate all fractions in list");

            try {
                System.out.print("Your command:");
                int command = input.nextInt();
                switch (command) {
                    case 1: //Xuất danh sách phân số
                        for (Fraction e : listFraction) {
                            System.out.println(e.toString());
                        }
                        break;
                    case 2: //Thêm phân số
                        listFraction.add(Fraction.fromString(input.nextLine()));
                        break;
                    case 3: //Xóa phân số tại vị trí thứ k
                        System.out.print("Input index k of fraction you want to eliminate: ");
                        int k = input.nextInt();
                        listFraction.remove(k);
                        break;
                    case 4: //Cập nhật phân số tại vị trí thứ k
                        System.out.print("Input index l of fraction you want to update: ");
                        int l = input.nextInt();
                        System.out.println("Input new fraction:");
                        listFraction.set(l, Fraction.fromString(input.nextLine()));
                        break;
                    case 5: //Tìm các phân số có giá trị lớn nhất
                        System.out.println("The biggest fraction of list is: ");
                        Fraction.findMax(listFraction);
                        break;
                    case 6: //Xóa tất cả phân số
                        listFraction.clear();
                        break;
                    default:
                        break;
                }
            } catch (InvalidCommand invalidCommand) {
                System.out.println(invalidCommand);
                return;
            }

            System.out.println("----------^v----------");

        } while (true);
    }
}
