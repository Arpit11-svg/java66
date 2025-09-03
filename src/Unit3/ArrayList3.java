package Unit3;
import java.util.*;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> product=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of element: ");
        int n=input.nextInt();
        for(int i=0;i<n;i++){
            product.add(input.next());
        }
        System.out.println("Printing of "+  n + " elements: ");
        Iterator itr=product.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Collections.sort(product);
        System.out.println(product);
        System.out.println(product.getFirst());
        System.out.println(product.getLast());
        System.out.println(product.get(2));
        product.addFirst("xyz");
        product.addLast("abc");
        product.add(3,"KIET");
        System.out.println(product);
    }

}
