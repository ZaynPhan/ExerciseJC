package Date_0709;
//Thông tin giảng viên cơ hữu: tên giảng viên, email, địa
//chỉ, điện thoại, số giờ giảng dạy trong tháng, lương
//thỏa thuận và số giờ quy định chung trong tháng.

import java.util.Scanner;

public class FacultyMember extends Lecturer {
    protected int specifiedHours = 40;
    protected int overtimeHours;
    protected int teachingHours = specifiedHours + overtimeHours;
    protected double totalWage = teachingHours * 200000;

    public FacultyMember() {
    }

    public FacultyMember(int specifiedHours, int overtimeHours, int teachingHours, double totalWage) {
        this.specifiedHours = specifiedHours;
        this.overtimeHours = overtimeHours;
        this.teachingHours = teachingHours;
        this.totalWage = totalWage;
    }

    public double getTotalWage() {
        return (this.specifiedHours + this.overtimeHours) * 200000;
    }

    //Nhập thông tin giảng viên cơ hữu
    public void inputFacultyMember() {
        super.inputLecturerInfo();

        //Nhập số giờ vượt quá số giờ quy định trong tháng
        Scanner input = new Scanner(System.in);
        System.out.println("Overtime hours in month: ");
        this.overtimeHours = input.nextInt();
    }

    //Nhập danh sách giảng viên cơ hữu
    public static FacultyMember[] listFacultyMember(int quantity) {
        FacultyMember[] listFacultyMember = new FacultyMember[quantity];
        for (int i = 0; i < quantity; i++) {
            listFacultyMember[i] = new FacultyMember();
            listFacultyMember[i].inputFacultyMember();
        }
        return listFacultyMember;
    }

    //Xuất thông tin 1 giảng viên cơ hữu:
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("");
        super.toString();
        sb.append("Specified teaching hours in month: ").append(specifiedHours).append('\n');
        sb.append("Overtime hours in month: ").append(overtimeHours).append('\n');
        sb.append("Total teaching hours in month: ").append(specifiedHours + overtimeHours).append('\n');
        sb.append("Total wage in month: ").append((specifiedHours + overtimeHours) * 200000).append('\n');
        sb.append("Type: Faculty Member").append('\n');
        return sb.toString();
    }

    //Xuất danh sách giảng viên cơ hữu
    public static void printListFacultyMember(FacultyMember[] listFacultyMember) {
        for (int i = 0; i < listFacultyMember.length; i++) {
            System.out.println((i + 1) + ". " + listFacultyMember[i].toString());
            System.out.println();
        }
    }

    //Tổng số tiền lương của tất cả giảng viên cơ hữu
    public static double totalWageOfAllFacultyMember(FacultyMember[] listFacultyMember) {
        double totalWageOfAllFacultyMember = 0;
        for (int i = 0; i < listFacultyMember.length; i++) {
            totalWageOfAllFacultyMember += listFacultyMember[i].getTotalWage();
        }
        return totalWageOfAllFacultyMember;
    }
}
