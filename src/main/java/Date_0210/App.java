package Date_0210;

import java.io.*;
//Bài tập: viết chương trình Java cho phép copy tập tin bất kỳ trong máy tính,
// sử dụng phương pháp `đọc file nguồn => ghi file đích`

public class App {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("RadicalFile.bin");
            BufferedInputStream bis = new BufferedInputStream(fis);

            FileOutputStream fos = new FileOutputStream("CopyFile.bin");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            int text = bis.read();
            while (text != -1) {
                bos.write(text);
                text = bis.read();
            }

            bos.flush();
            bos.close();
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
