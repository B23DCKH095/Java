import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class phong{
    private String a;
    private String b;
    private String c;
    private String d;
    public phong(String a,String b,String c,String d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public String get(){
        StringBuilder s = new StringBuilder();
        s.append(this.a);
        s.append(" ");
        s.append(this.b);
        s.append(" ");
        s.append(this.c);
        s.append(" ");
        s.append(this.d);
        return s.toString();
    }
    public String getb(){
        return this.b;
    }
}
public class J07045 {
    public static void main(String[] args){
        File x = new File("PHONG.in");
        try{
            Scanner r = new Scanner(x);
            int n  = r.nextInt();
            ArrayList<phong> arr = new ArrayList<>();
            for(int i = 0 ; i < n ;i++){
                phong k =  new phong(r.next(), r.next(), r.next(), r.next());
                arr.add(k);
            }
            arr.sort(new Comparator<phong>() {
                public int compare(phong x,phong y){
                    return x.getb().compareTo(y.getb());
                }
            });
            for(int i = 0 ;i <n ; i ++){
                phong k = arr.get(i);
                System.out.println(k.get());
            }
        } catch(FileNotFoundException e){

        }
    }
}
