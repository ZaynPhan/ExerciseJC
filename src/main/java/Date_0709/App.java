package Date_0709;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

    //1.Nhập vào thông tin của các giảng viên
        //Nhập số lượng giảng viên
        System.out.println("=====Lecturer information=====");
        System.out.println("Input quantity of lecturer: ");
        int quantity = input.nextInt();

        //Nhập thông tin giảng viên theo loại
        for (int i = 0; i < quantity; i++) {
            System.out.println("Lecturer type (1 - Faculty Member or 2 - Visiting Lecturer): ");
            int lecturerType = input.nextInt();

            if (Lecturer.getLecturerType(lecturerType) == 1){
                FacultyMember fm1 = new FacultyMember();
                fm1.inputFacultyMember();
            }

            if (Lecturer.getLecturerType(lecturerType) == 2){
                VisitingLecturer fm2 = new VisitingLecturer();
                fm2.inputVisitingLecturer();
            }
        }
    }
}
