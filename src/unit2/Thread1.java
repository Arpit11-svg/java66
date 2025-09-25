package unit2;

public class Thread1 extends Thread{
    public void run(){
       try{
           for (int i = 1; i <50; i++) {
              if(i%2==0){
                  System.out.println("Thread1 " + i);
                  Thread.sleep(1000);
              }
           }
       } catch (InterruptedException e) {
           System.out.println(e.getMessage());
       }
    }
}
