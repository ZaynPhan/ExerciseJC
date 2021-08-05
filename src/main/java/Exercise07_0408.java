//Bài 7
//Nhập điểm thi và hệ số 3 môn Toán, Lý, Hóa của một học sinh
//Tính điểm trung bình của học sinh đó.

public class Exercise07_0408 {
    public static void main(String[] args){
        int math = 9;
        int physic = 9;
        int chemistry = 6;
        final int mathFactor = 3;
        final int physicFactor = 2;
        final int chemistryFactor = 1;
        float averageScore = (math*mathFactor + physic*physicFactor + chemistry*chemistryFactor)/(mathFactor + physicFactor + chemistryFactor);
        System.out.println("Điểm trung bình: " + averageScore);
    }
}
