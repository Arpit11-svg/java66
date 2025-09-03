package Unit1;

import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner input=new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Element of an array: ");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}
