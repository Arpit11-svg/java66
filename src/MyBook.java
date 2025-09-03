import java.util.Scanner;

public class MyBook extends Book {

    public void setTitle(String s){
        this.title=s;
    }
    public static void main(String[] args) {
        MyBook book=new MyBook();
        System.out.println("Please enter title of book: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        book.setTitle(str);
        System.out.println("The title of book is :" + book.getTitle());

    }

}
