package U2;

public class threadMain{
    public static void main(String[] args) {
        thread c1=new thread('#');
        thread c2=new thread('$');
        c1.start();
        c2.start();
    }
}
