package Date_3009;
//Bài tập: ghép nội dung 2 tập tin text sang tập tin khác

import java.io.*;

public class App {
    public static void main(String[] args) {
        try {
            FileInputStream fos1 = new FileInputStream("data1.txt");
            FileInputStream fos2 = new FileInputStream("data2.txt");

            FileOutputStream fos = new FileOutputStream("data.txt");
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

            InputStreamReader isr1 = new InputStreamReader(fos1);
            BufferedReader reader1 = new BufferedReader(isr1);
            String line1 = reader1.readLine();
            if (line1 != null) {
                bw.write(line1);
            }
            InputStreamReader isr2 = new InputStreamReader(fos2);
            BufferedReader reader2 = new BufferedReader(isr2);
            String line2 = reader2.readLine();
            if (line2 != null) {
                bw.write(line2);
            }
            bw.flush();
            bw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
