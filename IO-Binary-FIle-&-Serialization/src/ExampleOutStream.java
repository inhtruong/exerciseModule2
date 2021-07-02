import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class ExampleOutStream {
    public static void main(String[] args) {
        try {
            File dir = new File("OutStream");

            dir.mkdirs();
            // Tạo một luồng ký tự đầu ra với mục đích ghi thông tin vào file
            OutputStream w = new FileOutputStream(
                    "OutStream/test_outputStream.txt");

            String str = "Hello";
            // Tạo một mảng byte ,ta sẽ ghi các byte này vào file nói trên .
            byte[] ch = new byte[] { 'H', 'e', 'l', 'l', 'o' };
            int n = 1000;

            byte[] i = new byte[]{'1','0','0','0'};
//            // Ghi lần lượt các ký tự vào luồng
//            for (byte b : ch) {
//                // Ghi ký tự vào luồng
//                w.write(b);
//            }
            w.write(i);
            // Đóng luồng đầu ra lại việc ghi xuống file hoàn tất.
            w.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
