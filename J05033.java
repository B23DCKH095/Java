import java.util.*;

public class J05033 {
    public static void main(String[] args){
        Scanner r =new Scanner(System.in);
        int n =Integer.parseInt(r.nextLine());
        ArrayList<String> a = new ArrayList<>();
        for(int i = 0 ; i <n ; i++){
            String s = r.nextLine();
            a.add(s);
        }
        a.sort(new Comparator<String>(){
            public int compare(String a,String b){
                String x[] = a.split("\\s+");
                String y[] = b.split("\\s+");
                int xgio = Integer.parseInt(x[0]);
                int ygio = Integer.parseInt(y[0]);
                int xphut = Integer.parseInt(x[1]);
                int yphut = Integer.parseInt(y[1]);
                int xgiay = Integer.parseInt(x[2]);
                int ygiay = Integer.parseInt(y[2]);
                if(xgio == ygio){
                    if(xphut == yphut){
                        return xgiay - ygiay;
                    }
                    return xphut - yphut;
                }
                return xgio - ygio;
            }
        });
        for(int i = 0 ;i < n ; i++) System.out.println(a.get(i));
    }
}
