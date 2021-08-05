//Bài 6
//Nhập tên sản phẩm, số lượng và đơn giá
//Tính tiền và thuế giá trị gia tăng phải trả, biết:
//a. tiền = số lượng * đơn giá
//b. thuế giá trị gia tăng = 10% tiền

public class Exercise06_0408 {
    public static void main (String[] args){
        String productName = "AK47";
        int quantity = 4;
        int price = 1899;
        int grossTXNAmount = quantity * price;
        int VATtax = grossTXNAmount/10;
        System.out.println("Tên sản phẩm: " + productName);
        System.out.println("Số lượng: " + quantity);
        System.out.println("Tiền phải trả: $" + grossTXNAmount);
        System.out.println("Thuế V.A.T: $" + VATtax);
    }
}
