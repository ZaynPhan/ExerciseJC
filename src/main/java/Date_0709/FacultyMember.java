package Date_0709;
//Thông tin giảng viên cơ hữu: tên giảng viên, email, địa
//chỉ, điện thoại, số giờ giảng dạy trong tháng, lương
//thỏa thuận và số giờ quy định chung trong tháng.

import java.util.Scanner;

public class FacultyMember extends Lecturer {
    protected int teachingHours, overtimeHours;
    protected double agreedWage;

    public FacultyMember() {
    }

    public FacultyMember(int teachingHours, int hourLimit, double agreedWage) {
        this.teachingHours = teachingHours;
        this.overtimeHours = overtimeHours;
        this.agreedWage = agreedWage;
    }

    //Nhập thông tin giảng viên cơ hữu
    public void inputFacultyMember() {
        super.inputLecturerInfo();

        Scanner input = new Scanner(System.in);
        System.out.println("Teaching hours in month: ");
        this.teachingHours = input.nextInt();

        System.out.println("Agreed Wage: ");
        this.agreedWage = input.nextDouble();

        System.out.println("Overtime hours in month: ");
        this.overtimeHours = input.nextInt();
    }

//    //Nhập danh sách giảng viên cơ hữu
//    public static FacultyMember[] listFacultyMember(int quantity) {
//        FacultyMember[] listFacultyMember = new FacultyMember[quantity];
//        for (int i = 0; i < quantity; i++) {
//            listFacultyMember[i] = new FacultyMember();
//            listFacultyMember[i].inputFacultyMember();
//        }
//        return listFacultyMember;
//    }

    //Xuất thông tin giảng viên cơ hữu:
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(" ");
        super.toString();
        sb.append("Teaching hours: ").append(teachingHours).append('\n');
        sb.append("Agreed wage: ").append(agreedWage).append('\n');
        sb.append("Overtime hours: ").append(overtimeHours).append('\n');
        sb.append("Type: Faculty Member").append('\n');
        return sb.toString();
    }


}
