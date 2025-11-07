

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class WordSet{
    private Set<String> a;
    public WordSet(String str){
        str = str.toLowerCase();
        String[] word = str.trim().split("\\s+");
        Set<String> tmp =new TreeSet<>();
        for(String x : word) tmp.add(x);
        this.a = tmp;
    }
    public WordSet union(WordSet s2){
        Set<String> s3 = new HashSet<>(this.a);
        s3.addAll(s2.a);
        StringBuilder ret = new StringBuilder();
        for(String tmp : s3){
            ret.append(tmp);
            ret.append(" ");
        }
        return new WordSet(ret.toString());
    }
    public WordSet intersection(WordSet s2){
        Set<String> s3 = new HashSet<>(this.a);
        s3.retainAll(s2.a);
        StringBuilder ret = new StringBuilder();
        for(String tmp : s3){
            ret.append(tmp);
            ret.append(" ");
        }
        return new WordSet(ret.toString());
    }
    public String toString(){
        StringBuilder ret = new StringBuilder();
        for(String tmp : this.a){
            ret.append(tmp);
            ret.append(" ");
        }
        return ret.toString();
    }
}
public class J04022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
