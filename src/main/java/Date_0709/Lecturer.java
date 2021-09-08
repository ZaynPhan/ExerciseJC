package Date_0709;
//Thông tin giảng viên: tên giảng viên, email, địa
//chỉ, điện thoại,

import java.util.Scanner;

public class Lecturer {
    protected String lecturerName, lecturerEmail, lecturerAddress, lecturerPhoneNumber;

    public Lecturer() {
    }

    public Lecturer(String lecturerName, String lecturerEmail, String lecturerAddress,
                    String lecturerPhoneNumber) {
        this.lecturerName = lecturerName;
        this.lecturerEmail = lecturerEmail;
        this.lecturerAddress = lecturerAddress;
        this.lecturerPhoneNumber = lecturerPhoneNumber;
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
}

