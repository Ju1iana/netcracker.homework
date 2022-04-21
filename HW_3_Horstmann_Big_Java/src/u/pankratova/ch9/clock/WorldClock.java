package u.pankratova.ch9.clock;

public class WorldClock extends Clock {

    private int timeOffsetHours;
    static final int HOURS_PER_DAY = 24;


    public WorldClock(int timeOffsetHours) {
        this.timeOffsetHours = timeOffsetHours;
    }


    @Override
    public int getHours() {
        if ((super.getHours() + timeOffsetHours) >= HOURS_PER_DAY) {
            return ((super.getHours() + timeOffsetHours) - HOURS_PER_DAY);
        } else
            return (super.getHours() + timeOffsetHours);
    }


    @Override
    public int getMinutes() {
        return (super.getMinutes());
    }


    @Override
    public String toString() {
        return "World clock {" +
                "hours = " + getHours() +
                ", minutes = " + getMinutes() +
                '}';
    }
}

