package Unit3;

import java.util.Scanner;
import java.util.TreeMap;

public class treeHashMap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        TreeMap<Character,Integer> tMap=new TreeMap<>();
        for(char c: s.toCharArray()){
            tMap.put(c,tMap.getOrDefault(c,0)+1);
        }
        for(char c: tMap.keySet()){
            System.out.println("Frequency of " + c + " is " +tMap.get(c)) ;
        }
    }
}
