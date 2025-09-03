package Unit1;

import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any two number/");
        System.out.println("Enter value of x: ");
        int x=input.nextInt();
        System.out.println("Enter value of y: ");
        int y=input.nextInt();
        int z=0;

        try{
            z=x/y;
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println(z);
        }
    }
}
