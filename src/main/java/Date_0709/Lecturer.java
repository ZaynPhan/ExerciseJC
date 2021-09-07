package Date_0709;
//Thông tin giảng viên: tên giảng viên, email, địa
//chỉ, điện thoại,

import java.util.Scanner;

public class Lecturer {
    protected String lecturerName, lecturerEmail, lecturerAddress, lecturerPhoneNumber;
    public static int lecturerType;

    public Lecturer() {
    }

    public Lecturer(String lecturerName, String lecturerEmail, String lecturerAddress,
                    String lecturerPhoneNumber, int lecturerType) {
        this.lecturerName = lecturerName;
        this.lecturerEmail = lecturerEmail;
        this.lecturerAddress = lecturerAddress;
        this.lecturerPhoneNumber = lecturerPhoneNumber;
        this.lecturerType = lecturerType;
    }

    public static int getLecturerType (int t){
        return lecturerType;
    }

    //Nhập thông tin giảng viên
    public void inputLecturerInfo() {
        Scanner input = new Scanner(System.in);

        System.out.println("Lecturer's Name: ");
        String lecturerName = input.nextLine();

        System.out.println("Email: ");
        String lecturerEmail = input.nextLine();

        System.out.println("Address: ");
        String lecturerAddress = input.nextLine();

        System.out.println("Phone number: ");
        String lecturerPhoneNumber = input.nextLine();
    }

    //Nhập danh sách giảng viên
    public static Lecturer[] listLecturer(int quantity) {
        Lecturer[] listLecturer = new Lecturer[quantity];
        for (int i = 0; i < quantity; i++) {
            listLecturer[i] = new Lecturer();
            listLecturer[i].inputLecturerInfo();
        }
        return listLecturer;
    }

    //Xuất thông tin giảng viên:
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(" ");
        sb.append("Name: ").append(lecturerName).append('\n');
        sb.append("Email: ").append(lecturerEmail).append('\n');
        sb.append("Address: ").append(lecturerAddress).append('\n');
        sb.append("Phone Number: ").append(lecturerPhoneNumber).append('\n');
        return sb.toString();
    }

    //Xuất danh sách giảng viên
    public static void printListLecturer(Lecturer[] listLecturer) {
        for (int i = 0; i < listLecturer.length; i++) {
            System.out.println((i+1) + ". " + listLecturer[i].toString());
            System.out.println();
        }
    }
}

