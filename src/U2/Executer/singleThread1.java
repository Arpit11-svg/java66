package U2.Executer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class singleThread1 {
    public static void main(String[] args) {
        // single thread Executer
//        ExecutorService service= Executors.newSingleThreadExecutor();

        // multiple thread Executer
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {
            printTask p1 = new printTask('#');
            printTask p2 = new printTask('$');
            printTask p3 = new printTask('@');
            printTask p4 = new printTask('%');


            service.submit(p1);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            service.submit(p2);
            service.submit(p3);
            service.submit(p4);

//            service.shutdown();

//            awaitTermination for custom time Termination
            if (service.awaitTermination(1, TimeUnit.SECONDS)) {
                System.out.println("Finished by system");
            }


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}
