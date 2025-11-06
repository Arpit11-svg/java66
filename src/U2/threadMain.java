package U2;

public class threadMain{
    public static void main(String[] args) throws InterruptedException {
        thread c1=new thread('#');
        thread c2=new thread('$');
        thread c3=new thread('%');

        System.out.println(Thread.currentThread().getName());
        c1.start();
        c1.join();
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(10);
        System.out.println(Thread.currentThread().getState());
        c2.start();
        System.out.println(Thread.currentThread().getName());
        c2.join();
        c3.start();
        System.out.println(Thread.currentThread().getName());
    }
}
