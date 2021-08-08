package Date_0608;
//Nhập một số bất kỳ
//Hãy đọc giá trị của số nguyên đó nếu nó có giá trị từ 1 đến 9,
//ngược lại thông báo không đọc được

import java.util.Scanner;

public class Exercise01_0608 {
    public static void main(String[] args){
        Scanner random = new Scanner(System.in);
        System.out.print("Nhap mot so bat ky: ");
        Integer randomNum = random.nextInt();
        switch (randomNum){
        case 1:
            System.out.println("Một!");
            break;
        case 2:
            System.out.println("Hai!");
            break;
        case 3:
            System.out.println("Hai!");
            break;
        case 4:
            System.out.println("Bốn!");
            break;
        case 5:
            System.out.println("Năm!");
            break;
        case 6:
            System.out.println("Sáu!");
            break;
        case 7:
            System.out.println("Bảy!");
            break;
        case 8:
            System.out.println("Tám!");
            break;
        case 9:
            System.out.println("Chín!");
            break;
        default:
            System.out.println("Không đọc được!");
        }
    }
}
