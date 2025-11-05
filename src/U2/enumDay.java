package U2;

enum DAY {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    public final boolean isWeekday;
    DAY(boolean isWeekday)
    {
        this.isWeekday = isWeekday;
    }
    public String getType(){
        return isWeekday?"Weekday":"Weekend";
    }
}
public class enumDay{
    public static void main(String[] args) {
//        DAY day=DAY.MONDAY;
        for(DAY day:DAY.values()){
            System.out.printf("%s : %s\n",day,day.getType());
        }
    }
}


