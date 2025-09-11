package Unit3;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class treeSet1 {
    public static void main(String[] args) {
        SortedSet<Integer> sSet=new TreeSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter value of n: ");
        int n=sc.nextInt();
        System.out.println("Please enter " +  n + "  numbers: ");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            sSet.add(x);
        }
        System.out.println("Printing values of set: ");
        for(int a:sSet){
            System.out.println(a);
        }
    }
}
