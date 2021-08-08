//Nhập 4 số nguyên a, b, c và d.
//Hãy sắp xếp giá trị của 4 số nguyên này theo thứ tự tăng dần

package Date_0608;
import java.util.Scanner;
import java.util.Arrays;


public class Exercise06_0608 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Nhập a, b, c và d:");
        int[] array = new int[4];
        for (int i = 0; i < 4; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < 5; i++){
            for (int k = 0; k <= 5 - i - k; k++){
                if(array[k] > array[k+1]){
                    int temp = array[k];
                    array[k] = array[k+1];
                    array[k+1] = temp;
                }
            }
        }
        System.out.println("Thứ tự tăng dần của a, b, c và d là: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
