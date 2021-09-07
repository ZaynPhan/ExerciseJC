package Date_0709;

import java.util.Scanner;

public class VisitingLecturer extends Lecturer {
    protected String company;
    protected int teachingHours;

    public VisitingLecturer() {
    }

    public VisitingLecturer(String company, int teachingHours) {
        this.company = company;
        this.teachingHours = teachingHours;
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

//    //Nhập danh sách giảng viên cơ hữu
//    public static FacultyMember[] listFacultyMember(int quantity) {
//        FacultyMember[] listFacultyMember = new FacultyMember[quantity];
//        for (int i = 0; i < quantity; i++) {
//            listFacultyMember[i] = new FacultyMember();
//            listFacultyMember[i].inputFacultyMember();
//        }
//        return listFacultyMember;
//    }

    //Xuất thông tin giảng viên thỉnh giảng:
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(" ");
        super.toString();
        sb.append("Teaching hours: ").append(teachingHours).append('\n');
        sb.append("From company: ").append(company).append('\n');
        sb.append("Type: Visiting Member").append('\n');
        return sb.toString();
    }
}
