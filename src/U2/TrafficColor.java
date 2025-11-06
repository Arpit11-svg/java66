package U2;

public enum TrafficColor {
    RED(9000),
    YELLOW(1000),
    GREEN(3000);
    private final int onTimeMillis;
    public int getOnTimeMillis(){
        return onTimeMillis;
    }

    TrafficColor(int onTimeMillis) {
        this.onTimeMillis=onTimeMillis;
    }
}
