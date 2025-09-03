package Unit1;

public class myInt implements showable {
    public void show(){
        System.out.println("This is show method.");
    }

    public static void main(String[] args) {
       showable obj= new showable() {
           @Override
           public void show() {
               System.out.println("This is show method.");

           }
       };
       obj.show();

       }
    }
