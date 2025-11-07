import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class J07006 {
    public static void main(String[] args) throws Exception, ClassNotFoundException {
        ObjectInputStream oss = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> ds = new ArrayList<>();
        ds = (ArrayList<Integer>) oss.readObject();
        int cnt[] = new int[10001];
        for (int i : ds) {
            cnt[i]++;
        }
        for (int i = 0; i < 1001; i++) {
            if (cnt[i] != 0)
                System.out.printf("%d %d\n", i, cnt[i]);
        }
    }
}
