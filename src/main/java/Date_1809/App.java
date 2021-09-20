package Date_1809;
//Xây dựng chương trình tính BMI đơn giản
//Công thức: bmi = weight/height2
//Đoạn hàm tính bmi cần được tách riêng thành một function, bao gồm phần tính bmi và kiểm tra tính đúng đắn của các tham số đầu vào
//public static double calculateBMI(int w, int h) {
//  double bmi = 0;
//  return bmi;
//}
//Hàm main() sẽ bắt tất cả các exception có thể có của toàn bộ chương trình và hiển thị thông báo phù hợp

import Date_1809.entities.BMI;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Input your weight: ");
        String weight = input.nextLine();
        boolean validateWeight = BMI.validate(weight);

        System.out.println("Input your height: ");
        String height = input.nextLine();
        boolean validateHeight = BMI.validate(height);

        if(validateWeight && validateHeight){
            double valueBMI = BMI.calculateBMI(Double.parseDouble(weight),Double.parseDouble(height));
            System.out.println("Your BMI is " + valueBMI);
            try {
                if (valueBMI < 18.5) {
                    System.out.println("Your body is Thin");
                } else if (valueBMI >= 18.5 && valueBMI < 25) {
                    System.out.println("Your body is Normal");
                } else if (valueBMI >= 25 && valueBMI < 30) {
                    System.out.println("Your body is Overweight");
                } else if (valueBMI >= 30 && valueBMI < 35) {
                    System.out.println("Your body is Overweight type 1");
                } else if (valueBMI >= 35 && valueBMI < 40) {
                    System.out.println("Your body is Overweight type 2");
                } else {
                    System.out.println("Your body is Overweight type 3");
                }
            } catch (InputMismatchException inputMismatchException){
                throw new InputMismatchException("Un-existed BMI value of normal Human!");
            } catch (Exception exception){
                exception.getMessage();
            }

            System.out.println("Next, please!");
        }
    }
}
