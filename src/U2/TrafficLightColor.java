package U2;

public class TrafficLightColor extends Thread {
    private final TrafficColor color;
    public TrafficLightColor(TrafficColor color){
        this.color=color;
    }
    public void run(){
        System.out.printf("%s active\n",color);
        try {
            Thread.sleep(color.getOnTimeMillis());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s Inactive\n",color);
    }
}
