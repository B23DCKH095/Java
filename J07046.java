import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class KH implements Comparable<KH> {
    private String line;
    private int ngay;
    
    public KH(int id, String name, String room, String den, String di) {
        StringBuilder st = new StringBuilder();
        st.append("KH");
        if (id < 10) st.append("0");
        st.append(id);
        st.append(" ");
        st.append(name);
        st.append(" ");
        st.append(room);
        st.append(" ");
        
        String[] de = den.split("/");
        String[] d = di.split("/");
        
        // More accurate date difference calculation
        Calendar arrival = Calendar.getInstance();
        arrival.set(Integer.parseInt(de[2]), Integer.parseInt(de[1]) - 1, Integer.parseInt(de[0]));
        
        Calendar departure = Calendar.getInstance();
        departure.set(Integer.parseInt(d[2]), Integer.parseInt(d[1]) - 1, Integer.parseInt(d[0]));
        
        long diffInMillis = departure.getTimeInMillis() - arrival.getTimeInMillis();
        this.ngay = (int) (diffInMillis / (1000 * 60 * 60 * 24));
        
        st.append(this.ngay);
        this.line = st.toString();
    }
    
    @Override
    public int compareTo(KH other) {
        return other.ngay - this.ngay; // For descending order
    }
    
    @Override
    public String toString() {
        return this.line;
    }
}

public class J07046 {
    public static void main(String[] args) {
        ArrayList<KH> ds = new ArrayList<>();
        File x = new File("KHACH.in");
        try{
            Scanner r = new Scanner(x);
            int t = Integer.parseInt(r.nextLine());
            for (int i = 1; i <= t; i++) {
                ds.add(new KH(i, r.nextLine(), r.nextLine(), r.nextLine(), r.nextLine()));
            }
            Collections.sort(ds);
            for (KH tmp : ds) {
                System.out.println(tmp);
            }
        } catch(FileNotFoundException e){

        }
    }
}