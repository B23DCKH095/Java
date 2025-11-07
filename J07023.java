import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class J07023 {
    public static boolean checktn(int n){
        if(n <10) return false;
        int m = n, rev = 0;
        while(m >0){
            int tmp = m%10;
            rev = rev*10 + tmp;
            m /= 10;
        }
        return rev == n;
    }
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> ds1 = (ArrayList<Integer>)ois1.readObject();
        ois1.close();
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> ds2 = (ArrayList<Integer>) ois2.readObject();
        ois2.close();
        int prime[] = new int[100001];
        for(int i = 2; i <= 100000 ; i++) prime[i] = 1;
        for(int i = 2; i <= 1000 ; i++){
            if(prime[i] == 1){
                for(int j = 2*i ; j*j <= 100000 ; j += i) prime[j] = 0;
            }
        }
        int cnt1[] = new int[100001];
        int cnt2[] = new int[100001];
        Set<Integer> se = new TreeSet<>();
        for(int i : ds1){
            cnt1[i] ++;
            se.add(i);
        }
        for(int i : ds2){
            cnt2[i] ++;
            se.add(i);
        }
        for(int i : se){
            if(prime[i] == 1 && checktn(i)){
                System.out.printf("%d %d %d\n",i,cnt1[i],cnt2[i]);
            }
        }
    }
}
