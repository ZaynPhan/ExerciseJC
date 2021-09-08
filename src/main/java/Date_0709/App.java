package Date_0709;

import java.util.Scanner;
//Hãy xây dựng chương trình cho phép nhân viên trong
//trung tâm thực hiện các chức năng sau:
//(1) Nhập vào thông tin của các giảng viên
//(2) Xuất danh sách toàn bộ giảng viên
//(3) Xuất danh sách giảng viên cơ hữu
//(4) Xuất danh sách giảng viên thỉnh giảng
//(5) Tính tổng số tiền lương của toàn bộ giảng viên
//(6) Tìm loại giảng viên có tổng lương cao nhất.

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

    //1.Nhập vào thông tin của các giảng viên
        //Nhập số lượng giảng viên
        System.out.println("=====Lecturer information=====");
        System.out.println("Input quantity of lecturer: ");
        int quantityTotal = input.nextInt();

        //Nhập thông tin giảng viên theo loại

        //Nhập thông tin giảng viên cơ hữu
        System.out.println("Quantity of faculty member is: ");
        int quantityFM = input.nextInt();
        FacultyMember[] listFacultyMember = FacultyMember.listFacultyMember(quantityFM);

        //Nhập thông tin giảng viên thỉnh giảng
        System.out.println("Quantity of visiting lecturer is: ");
        int quantityVL = quantityTotal - quantityFM;
        VisitingLecturer[] listVisitingLecturer = VisitingLecturer.listVisitingLecturer(quantityVL);

    //2. Xuất toàn bộ danh sách giảng viên:
        System.out.println("===> Full list of lecturer");
        FacultyMember.printListFacultyMember(listFacultyMember);
        VisitingLecturer.printListVisitingLecturer(listVisitingLecturer);

    //3. Xuất danh sách giảng viên cơ hữu
        System.out.println("* list of faculty member");
        FacultyMember.printListFacultyMember(listFacultyMember);

    //4. Xuất danh sách giảng viên thỉnh giảng
        System.out.println("* list of visiting lecturer");
        VisitingLecturer.printListVisitingLecturer(listVisitingLecturer);

    //5. Tính tổng số tiền lương của toàn bộ giảng viên
        double totalWageOfAllLecturer = FacultyMember.totalWageOfAllFacultyMember(listFacultyMember) +
                VisitingLecturer.totalWageOfAllVisitingLecturer(listVisitingLecturer);
        System.out.println("Total wage of all lecturer is " + totalWageOfAllLecturer);

    //(6) Tìm loại giảng viên có tổng lương cao nhất.
        if (FacultyMember.totalWageOfAllFacultyMember(listFacultyMember) >
                VisitingLecturer.totalWageOfAllVisitingLecturer(listVisitingLecturer)) {
            System.out.println("Faculty member's total wage is higher than visiting lecturer's");
        } else System.out.println("Visiting lecturer's total wage is higher than faculty member's");
    }
}
