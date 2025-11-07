import java.util.Scanner;


class num{
    int x;
    int y;
    public num(int x,int y){
        this.x = x;
        this.y = y;
    }
    public num cong(num other){
        num ans = new num(this.x + other.x,this.y + other.y);
        return ans;
    }
    public num plus(num other){
        num ans = new num(this.x*other.x - this.y*other.y,this.x*other.y + this.y*other.x);
        return ans;
    }
    public String toString(){
        return String.format("%s + %si",this.x,this.y);
    }


}
public class J04018 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        while(t-- > 0){
            num a = new num(r.nextInt(),r.nextInt());
            num b = new num(r.nextInt(),r.nextInt());
            num e = a.cong(b);
            num c = e.plus(a);
            num d = e.plus(e);
            System.out.printf("%s, %s\n",c,d);

        }
    }
}
