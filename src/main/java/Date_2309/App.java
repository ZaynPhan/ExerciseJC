package Date_2309;
/*Câu 1:
Tìm tất cả các chuỗi ngày tháng có định dạng dd-mm-yyyy hoặc dd/mm/yyyy trong chuỗi văn bản text1

Câu 2:
Tìm tất cả các địa chỉ email có trong chuỗi văn bản đầu vào text. Định nghĩa email:
- Bắt đầu bằng chữ cái.
- Chỉ chứa chữ cái, chữ số, dấu gạch ngang -
- Chứa một ký tự @, sau @ là tên miền.
- Tên miền có thể là domain.xxx.yyy hoặc domain.xxx. Trong đó xxx và yyy là các chữ cái và có độ dài từ 2 trở lên.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. Tìm tất cả chuỗi định dạng dd-mm-yyyy hoặc dd/mm/yyyy
        System.out.println("=====Exercise 1=====");
        System.out.println("Input your compared string: ");
        String input = sc.nextLine();

        String regex = "\\d{1,2}[\\-|\\/]\\d{1,2}[\\-|\\/]\\d{4}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);

        boolean matchFound = m.find();
        System.out.println("Matched string(s) found:");
        while (matchFound) {
            String dmY = input.substring(m.start(), m.end());
            System.out.println(dmY);

            matchFound = m.find();
        }

        //2. Tìm tất cả các địa chỉ email có trong chuỗi:
        System.out.println("=====Exercise 2=====");
        System.out.println("Input your compared string: ");
        String inputText = sc.nextLine();

        String regexEmail = "\\b[a-zA-Z][\\w\\-]{0,63}\\@[a-zA-Z]{1,}\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?\\b";
        Pattern patternEmail = Pattern.compile(regexEmail);
        Matcher matcher = patternEmail.matcher(inputText);

        boolean emailFound = matcher.find();
        System.out.println("Matched string(s) found:");
        while (emailFound) {
            String emailResult = inputText.substring(matcher.start(), matcher.end());
            System.out.println(emailResult);

            emailFound = matcher.find();
        }
    }
}
