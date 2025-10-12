package unit2;

public class myMainThread1 {
    public static void main(String[] args) {
        Thread1 th1=new Thread1();
        Thread2 th2=new Thread2();
        th1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(th1.getPriority());
        System.out.println(th2.getPriority());
        th1.start();
        th2.start();
    }
}
