package unit2;

public class Thread2 extends Thread{
    public void run(){
        try
        {
            for(int i=1;i<50;i++){
                if(i%2==0){
                    System.out.println("Thread2 " + i);
                    Thread.sleep(2000);
                }
            }
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
