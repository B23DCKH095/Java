import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

class KH {
    // Biến static để đếm số lượng khách hàng và tạo mã tự động
    private static int nextId = 1;

    private String MaKH;
    private String TenKH;
    private String SoPhong;
    private long SoNgayO; // Dùng long (hoặc int) thay vì Long cho số ngày
    public long ThanhTien;

    public KH(String ten, String phong, String ngayvao, String ngayra, String dvu) {
        // 1. Tạo Mã KH tự động và tăng biến đếm
        this.MaKH = String.format("KH%02d", nextId++);

        // 2. Chuẩn hóa tên (đã thêm logic chuẩn hóa)
        this.TenKH = formatName(ten);

        this.SoPhong = phong;

        // 3. Tính số ngày ở
        this.SoNgayO = formatDate(ngayvao, ngayra);

        // 4. Tính Thành Tiền: SoNgayO * Giá/Tầng + Dịch Vụ
        // Chuyển dvu sang long
        long dichVu = Long.parseLong(dvu);
        this.ThanhTien = this.SoNgayO * GiaTheoTang(phong) + dichVu;
    }

    // ⭐ CHUẨN HÓA TÊN (Đã hoàn thiện)
    public String formatName(String ten) {
        if (ten == null || ten.isEmpty())
            return "";

        String cleanName = ten.trim().toLowerCase();
        cleanName = cleanName.replaceAll("\\s+", " ");

        String[] words = cleanName.split(" ");
        StringBuilder normalized = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                // Viết hoa chữ cái đầu, viết thường phần còn lại
                String firstLetter = word.substring(0, 1).toUpperCase();
                String remainingLetters = word.substring(1);

                normalized.append(firstLetter).append(remainingLetters).append(" ");
            }
        }
        return normalized.toString().trim();
    }

    // Tính số ngày ở (đã có sẵn và đúng)
    public long formatDate(String DateIn, String DateOut) {
        String pattern = "dd/MM/yyyy";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

        // Xử lý ngoại lệ trong thực tế là tốt hơn, nhưng ở đây ta tin tưởng đầu vào
        LocalDate In = LocalDate.parse(DateIn, formatter);
        LocalDate Out = LocalDate.parse(DateOut, formatter);

        // Tính số ngày chênh lệch (Out - In). Số ngày ở thường là Days.between + 1,
        // nhưng nếu bài toán là số ngày thuê phòng thì chỉ là days.between
        return ChronoUnit.DAYS.between(In, Out);
    }

    // Lấy giá theo tầng phòng
    public long GiaTheoTang(String phong) {
        // Giá được tính bằng Đơn vị tiền tệ / ngày
        Map<Character, Long> Tang = new HashMap<>();
        Tang.put('1', 25L); // Tầng 1: 25 đơn vị
        Tang.put('2', 34L); // Tầng 2: 34 đơn vị
        Tang.put('3', 50L); // Tầng 3: 50 đơn vị
        Tang.put('4', 80L); // Tầng 4: 80 đơn vị

        char TangHienTai = phong.charAt(0);
        return Tang.getOrDefault(TangHienTai, 0L); // Trả về 0 nếu không tìm thấy tầng
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %d", MaKH, TenKH, SoPhong, SoNgayO, ThanhTien);
    }
}

public class J07051 {
    public static void main(String[] args) {
        // Sử dụng try-with-resources để tự động đóng Scanner
        try (Scanner r = new Scanner(System.in)) {
            ArrayList<KH> ds = new ArrayList<>();
            // Đảm bảo đầu vào N là số nguyên
            int n = Integer.parseInt(r.nextLine());

            for (int i = 0; i < n; i++) {
                // Đọc 5 dòng dữ liệu liên tiếp cho mỗi khách hàng
                String ten = r.nextLine();
                String phong = r.nextLine();
                String ngayvao = r.nextLine();
                String ngayra = r.nextLine();
                String dvu = r.nextLine();

                ds.add(new KH(ten, phong, ngayvao, ngayra, dvu));
            }

            // Yêu cầu bổ sung: Sắp xếp danh sách (thường cần trong các bài tập code)
            // Ví dụ: Sắp xếp theo Thành Tiền giảm dần
            ds.sort((o1, o2) -> Long.compare(o2.ThanhTien, o1.ThanhTien));

            for (KH tmp : ds) {
                System.out.println(tmp);
            }
        } catch (Exception e) {
            // Xử lý nếu có lỗi trong quá trình đọc/chuyển đổi dữ liệu
            // System.err.println("Lỗi xử lý dữ liệu: " + e.getMessage());
        }
    }
}