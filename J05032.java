import java.util.*;

class Person implements Comparable<Person>{
    private String a;
    private String date;
    public Person(String a,String b){
        this.a = a;
        this.date = b;
    }
    public int compareTo(Person other){
        String w1[] = this.date.split("/");
        String w2[] = other.date.split("/");
        String line1 = String.format("%s%s%s", w1[2],w1[1],w1[0]);
        String line2 = String.format("%s%s%s", w2[2],w2[1],w2[0]);
        return line1.compareTo(line2);
    }
    public String toString(){
        return a;
    }
}

public class J05032 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        ArrayList<Person> ds = new ArrayList<>();
        int t = Integer.parseInt(r.nextLine());
        while(t > 0){
            t--;
            ds.add(new Person(r.next(), r.next()));
        }
        Collections.sort(ds);
        System.out.println(ds.get(ds.size() -1));
        System.out.println(ds.get(0));
    }
}
