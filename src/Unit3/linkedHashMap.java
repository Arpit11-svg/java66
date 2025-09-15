package Unit3;
import java.util.*;

public class linkedHashMap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter any string: ");
        String s=sc.nextLine();
        LinkedHashMap<Character,Integer> lMap=new LinkedHashMap<>();
        for(char c: s.toCharArray()){
            lMap.put(c,lMap.getOrDefault(c,0)+1);
        }
        for(char c:lMap.keySet()){
            System.out.println("frequency of " + c + " is : " + lMap.get(c));
        }
    }
}
