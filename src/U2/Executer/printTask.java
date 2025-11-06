package U2.Executer;

public class printTask implements Runnable{
    public char c;
    public printTask(char c){
        this.c=c;
    }
    public void run(){
        System.out.println( "Thread is running on this thread: "+Thread.currentThread().getName());
        for(int i=0;i<10;i++){
            System.out.print(i+""+c+" ");
        }
        System.out.println();
    }

}
