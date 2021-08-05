//Nhập vào số xe của bạn (gồm tối đa 5 chữ số).
//Cho biết số xe của bạn được mấy nút?

public class Exercise09_0408 {
    public static void main(String[] args){
        int abcde = 24347;
        int a = abcde/10000;
        int b = abcde/1000 - a*10;
        int c = abcde/100 - a*100 - b*10;
        int d = abcde/10 - a*1000 - b*100 - c*10;
        int e = abcde - a*10000 - b*1000 - c*100 - d*10;
        int sum = a+b+c+d+e;
        int unitOfSum = sum % 10;
        System.out.println("Biển số xe là " + abcde);
        System.out.println(unitOfSum);

    }
}
