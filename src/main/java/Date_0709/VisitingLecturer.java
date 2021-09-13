package Date_0709;

import java.util.Scanner;

public class VisitingLecturer extends Lecturer {
    protected String company;
    protected int teachingHours;
    protected double totalWage = teachingHours * 200000;

    public VisitingLecturer() {
    }

    public VisitingLecturer(String company, int teachingHours, double totalWage) {
        this.company = company;
        this.teachingHours = teachingHours;
        this.totalWage = totalWage;
    }

    public double getTotalWage() {
        return this.teachingHours * 200000;
    }

    //Nhập thông tin giảng viên thỉnh giảng
    public void inputVisitingLecturer() {
        super.inputLecturerInfo();

        Scanner input = new Scanner(System.in);
        System.out.println("From company: ");
        this.company = input.nextLine();

        System.out.println("Teaching hours: ");
        this.teachingHours = input.nextInt();
    }

    //Nhập danh sách giảng viên thỉnh giảng
    public static VisitingLecturer[] listVisitingLecturer(int quantity) {
        VisitingLecturer[] listVisitingLecturer = new VisitingLecturer[quantity];
        for (int i = 0; i < quantity; i++) {
            listVisitingLecturer[i] = new VisitingLecturer();
            listVisitingLecturer[i].inputVisitingLecturer();
        }
        return listVisitingLecturer;
    }

    //Xuất thông tin giảng viên thỉnh giảng:
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(" ");
        super.toString();
        sb.append("Teaching hours: ").append(teachingHours).append('\n');
        sb.append("From company: ").append(company).append('\n');
        sb.append("Total wage in month: ").append(teachingHours * 200000).append('\n');
        sb.append("Type: Visiting Member").append('\n');
        return sb.toString();
    }

    //Xuất danh sách giảng viên thỉnh giảng
    public static void printListVisitingLecturer(VisitingLecturer[] listVisitingLecturer) {
        for (int i = 0; i < listVisitingLecturer.length; i++) {
            System.out.println((i + 1) + ". " + listVisitingLecturer[i].toString());
            System.out.println();
        }
    }

    //Tổng số tiền lương của tất cả giảng viên tỉnh giảng
    public static double totalWageOfAllVisitingLecturer(VisitingLecturer[] listVisitingLecturer) {
        double totalWageOfAllVisitingLecturer = 0;
        for (int i = 0; i < listVisitingLecturer.length; i++) {
            totalWageOfAllVisitingLecturer += listVisitingLecturer[i].getTotalWage();
        }
        return totalWageOfAllVisitingLecturer;
    }
}
