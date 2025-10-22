import java.time.format.DateTimeFormatter;
import java.util.*;

class SV {
    private String TenSV;
    private Long ThoiGianOnline;

    public SV(String Ten, String Time) {
        this.TenSV = Ten;
        String pattern = "dd/MM/yy dd:mm:ss";
        DateTimeFormatter formatter = new DateTimeFormatter.ofPattern(pattern);
    }
}

public class J07084 {
    public static void main(String[] args) {

    }
}
