import java.io.*;
public class J07005 {
    public static void main(String[] args) throws Exception{
        DataInputStream oss = new DataInputStream(new FileInputStream("DATA.IN")); 
        int cnt[] = new int[10001];
        try{
            while (true) {
                int num = (Integer)oss.readInt();
                cnt[num]++;
            }
        } catch (EOFException e){
            for(int i = 0 ; i < 1001 ; i++){
                if(cnt[i] != 0) System.out.printf("%d %d\n", i,cnt[i]);
            }
        }
    }
}
