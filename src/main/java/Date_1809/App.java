package Date_1809;
//Xây dựng chương trình tính BMI đơn giản
//Công thức: bmi = weight/height2
//Đoạn hàm tính bmi cần được tách riêng thành một function, bao gồm phần tính bmi và kiểm tra tính đúng đắn của các tham số đầu vào
//public static double calculateBMI(int w, int h) {
//  double bmi = 0;
//  return bmi;
//}
//Hàm main() sẽ bắt tất cả các exception có thể có của toàn bộ chương trình và hiển thị thông báo phù hợp
import Date_1809.utils.BMI;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w, h;
        try {
            System.out.print("w = ");
            w = Integer.parseInt(scanner.nextLine());
            System.out.print("h = ");
            h = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(e);
            return;
        }

        try {
            double bmi = BMI.calculateBMI(w, h);
            System.out.format("BMI = %f\n", bmi);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}