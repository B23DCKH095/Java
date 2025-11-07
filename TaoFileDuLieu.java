import java.io.*;
import java.util.*;

public class TaoFileDuLieu {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Thêm dữ liệu mẫu (dựa trên ví dụ của bạn)
        // 17 lần số 2
        for (int i = 0; i < 17; i++)
            list.add(2);

        // 15 lần số 11
        for (int i = 0; i < 15; i++)
            list.add(11);

        // 8 lần số 997
        for (int i = 0; i < 8; i++)
            list.add(997);

        // Thêm một vài số nguyên tố khác
        list.add(3);
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(5);
        list.add(3);

        // Thêm một vài hợp số (không phải số nguyên tố)
        list.add(1); // Không phải SNT
        list.add(4);
        list.add(9);
        list.add(100);
        list.add(500);

        // Xáo trộn danh sách để dữ liệu không bị sắp xếp
        Collections.shuffle(list);

        try (
                FileOutputStream fos = new FileOutputStream("SONGUYEN.IN");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            // Ghi đối tượng ArrayList vào file
            oos.writeObject(list);
            System.out.println("Đã tạo file SONGUYEN.IN thành công với " + list.size() + " phần tử.");

        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }
}