package U2;

public class thread extends Thread{
    private final char c;
    public thread(char c){
        this.c=c;
    }
    public void run(){
        if(c=='#'){
            System.out.println("Thread 1 STARTed.");
        }
        else{
            System.out.println("Thread 2 STARTed.");
        }
        for(int i=0;i<100;i++){
            System.out.print(i+" " +c);
        }
        if(c=='#'){
            System.out.println("Thread 1 ENDED.");
        }
        else{
            System.out.println("Thread 2 ENDED.");
        }
    }
}

