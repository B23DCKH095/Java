import java.util.Scanner;

public class J02007 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        for(int test = 1; test <= t ;test ++){
            System.out.printf("Test %d:\n",test);
            int n = r.nextInt();
            int cnt[] = new int[100001];
            int a[] = new int[n];
            boolean x[] = new boolean[100001];
            for(int i =0 ;i < n ; i++) {
                a[i] = r.nextInt();
                cnt[a[i]] += 1;
            }
            for(int i = 0 ; i< n ; i++){
                if(!x[a[i]]){
                    System.out.printf("%d xuat hien %d lan\n",a[i],cnt[a[i]]);
                    x[a[i]] = true;
                }
            }

        }
    }
}
