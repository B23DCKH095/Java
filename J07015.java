import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07015{
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        int prime[] = new int[10001];
        for(int i = 0;i < 10001 ; i++) prime[i] = 1;
        for(int i = 2 ;i < 1000 ; i++){
            if(prime[i] == 1){
                for(int j = 2*i ;j < 10001 ; j += i) prime[j] = 0;
            }
        }
        prime[0] = prime[1] = 0;
        int cnt[] = new int[10000];
        ArrayList<Integer> ds = new ArrayList<>();
        ds = (ArrayList<Integer>)ois.readObject();
        for(int i : ds){
            if(prime[i] == 1){
                cnt[i]++;
            }
        }
        for(int i = 0 ;i < 1000 ; i++){
            if(cnt[i] != 0 && prime[i] == 1){
                System.out.printf("%d %d\n",i,cnt[i]);
            }
        }
    }
}