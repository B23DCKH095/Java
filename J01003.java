import java.util.Scanner;

public class J01003 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        float a = reader.nextFloat();
        float b = reader.nextFloat();
        if(a==0){
            if(b!= 0) System.out.println("VN");
            else System.out.println("VSN");
        }
        else {
            System.out.printf("%.2f",-b/a);
        }
        reader.close();
    }
}
