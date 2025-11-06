package U2;

public class trafficMain {
    public static void main(String[] args) throws InterruptedException {
        TrafficLightColor red=new TrafficLightColor(TrafficColor.RED);
        TrafficLightColor yellow=new TrafficLightColor(TrafficColor.YELLOW);
        TrafficLightColor green=new TrafficLightColor(TrafficColor.GREEN);

        green.start();
        green.join();
        yellow.start();
        yellow.join();
        red.start();
        red.join();



    }
}
