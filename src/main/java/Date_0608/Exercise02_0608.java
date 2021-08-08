package Date_0608;
//Nhập một chữ cái
//Nếu là chữ thường thì đổi sang chữ hoa
//ngược lại đổi sang chữ thường.

import java.util.Scanner;

public class Exercise02_0608 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập một chữ cái: ");
        String inputChar = input.next();
        String lower = inputChar.toLowerCase();
        String upper = inputChar.toUpperCase();
        if(inputChar.equals(lower)){
            System.out.println("Ngược lại của chữ cái đó là: " + upper);
        }else{
            System.out.println("Ngược lại của chữ cái đó là: " + lower);
        }
    }
}
