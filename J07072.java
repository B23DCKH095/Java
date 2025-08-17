import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class SV implements Comparable<SV> {
    private String ho;
    private String dem;
    private String ten;
    
    public SV(String ho, String dem, String ten) {
        this.ho = formatName(ho);
        this.dem = formatName(dem);
        this.ten = formatName(ten);
    }
    
    private String formatName(String name) {
        if (name == null || name.isEmpty()) return "";
        return Character.toUpperCase(name.charAt(0)) + name.substring(1).toLowerCase();
    }
    
    @Override
    public int compareTo(SV other) {
        int tenCompare = this.ten.compareTo(other.ten);
        if (tenCompare != 0) return tenCompare;
        
        int hoCompare = this.ho.compareTo(other.ho);
        if (hoCompare != 0) return hoCompare;
        
        return this.dem.compareTo(other.dem);
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s", ho, dem, ten);
    }
}

public class J07072 {
    public static void main(String[] args) {
        File x = new File("DANHSACH.in");
        try {
            ArrayList<SV> ds = new ArrayList<>();
            Scanner r = new Scanner(x);
            
            while (r.hasNextLine()) {
                String line = r.nextLine().trim();
                if (line.isEmpty()) continue;
                
                String[] words = line.split("\\s+");
                if (words.length < 3) continue; // Skip invalid lines
                
                String ho = words[0];
                String ten = words[words.length - 1];
                String dem = String.join(" ", Arrays.copyOfRange(words, 1, words.length - 1));
                
                ds.add(new SV(ho.toLowerCase(), dem.toLowerCase(), ten.toLowerCase()));
            }
            
            Collections.sort(ds);
            for (SV tmp : ds) {
                System.out.println(tmp);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}