import java.util.*;

class IntSet{
    private Set<Integer> a;
    public IntSet(int a[]){
        Set<Integer> s1 = new TreeSet<>();
        for(int i : a) s1.add(i);
        this.a = s1;
    }
    public IntSet union(IntSet other){
        Set<Integer> s3 = this.a;
        for(int x : other.a) s3.add(x);
        int a[] = new int[s3.size()];
        int i = 0;
        for(int x: s3) a[i++] = x;
        return new IntSet(a);
    }
    public String toString(){
        StringBuilder ret = new StringBuilder();
        for(int i : this.a) {
            ret.append(Integer.toString(i));
            ret.append(" ");
        }
        return ret.toString();
    }

}
public class J04021{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}