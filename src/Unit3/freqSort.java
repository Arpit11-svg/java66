package Unit3;
import java.util.*;

public class freqSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n=sc.nextInt();
        System.out.println("Enter " + n + " values in array: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        LinkedHashMap<Integer,Integer> lMap=new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            lMap.putIfAbsent(arr[i],i);
        }
        ArrayList<int[]> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            list.add(new int[]{entry.getKey(),entry.getValue(),lMap.get(entry.getKey())});
        }
        list.sort(new Compare());
        System.out.println("Values of an array after sorting : ");
        for(int[] top:list){
            for(int i=0;i<top[1];i++){
                System.out.print(top[0] + " ");
            }
        }
    }
    public static class Compare implements Comparator<int[]>{
        public int compare(int[] a ,int[] b){
            if(a[1]!=b[1]){
                return Integer.compare(b[1],a[1]);
            }
            else{
                return Integer.compare(a[2],b[2]);
            }
        }
    }

}
