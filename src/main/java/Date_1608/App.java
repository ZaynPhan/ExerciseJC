package Date_1608;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập string s: ");
        String s = input.nextLine();

        //1. Given a string s, write a program that accepts s from the user
        // and prints uppercase characters in s on the screen.
        System.out.println("The uppercase Characters: " + exercise1608.upperCaseString(s));

        //2. Write a program that accepts a string s from the user
        // and displays non-numeric characters in s on the screen.
        System.out.println("The non-Numeric Characters: " + exercise1608.nonNumericCharacter(s));

        //3. Given a string s and a character c.
        // Write a program that accepts these two variables from the user
        // and prints the occurrences of character c in s
        System.out.println("Quantity of character c: " + exercise1608.printTimes(s, 'c'));

        //4. Nhập một chuỗi kí tự, đếm số lượng các từ trong chuỗi kí tự đó
        // (các từ có thể cách nhau bằng nhiều khoảng trắng)
        int countWord = s.split("\\s+").length;
        System.out.println("Quantity of word: " + countWord);

        //7. Đếm số lượng ký tự nguyên âm và phụ âm xuất hiện trong chuỗi.
        // Ví dụ chuỗi java có 2 nguyên âm a, 2 phụ âm j và v.
        System.out.format("There are %d vowels and %d consonants!", exercise1608.countVowel(s),
                exercise1608.countConsonant(s));
    }
}
