package Date_2008;



/*Nhập vào int ngày, int tháng, int năm, int giờ, int phút, int giây: phát sinh ra timestamp (giây).
Nhập vào timestamp (giây): phát sinh ra ngày, tháng, năm, giờ, phút, giây.
1. Không dùng class hỗ trợ ngày, tháng, năm, chỉ dùng if, for, while bình dân.
2. Dùng các class hỗ trợ ngày, tháng, năm.*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input yyyy/MM/DD - hh/mm/ss");
        long[] arr = new long[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextLong();
        }
        System.out.println("To timestamp: " + convertToTimestamp(arr));

    }

    //1. Không dùng class hỗ trợ ngày, tháng, năm, chỉ dùng if, for, while bình dân.
    public static long convertToTimestamp(long[] arr) {
        arr[0] = arr[0] * 946080000;
        arr[1] = arr[1] * 2592000;
        arr[2] = arr[2] * 86400;
        arr[3] = arr[3] * 3600;
        arr[4] = arr[4] * 60;
        long startDay = 946080000 * 1969 + 2592000 * 12 + 86400 * 31 + 23 * 3600 + 60 * 59 + 59;
        long timeStamp = arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5] - startDay;
        return timeStamp;
    }
}
