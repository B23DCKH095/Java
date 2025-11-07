import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class TaoFileNhiPhan {
    public static void main(String[] args) {
        Random rand = new Random();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("DATA2.in"))) {
            ArrayList<Integer> ds = new ArrayList<>();
            // Ghi 100000 số nguyên dương ngẫu nhiên < 1000
            for (int i = 0; i < 100000; i++) {
                // rand.nextInt(999) + 1 để đảm bảo số dương [1, 999]
                // Nếu 0 cũng được tính là hợp lệ, dùng rand.nextInt(1000)
                ds.add(rand.nextInt(1000));
            }
            oos.writeObject(ds); // Ghi số vào file
            System.out.println("Đã tạo file DATA.IN thành công!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}