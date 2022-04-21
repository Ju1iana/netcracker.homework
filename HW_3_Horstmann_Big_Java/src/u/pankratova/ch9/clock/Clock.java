package u.pankratova.ch9.clock;

public class Clock {

    private int hours;
    private int minutes;
    private int alarmHours = 0;
    private int alarmMinutes = 0;

    public Clock(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Clock(){
    }

    public void setAlarmHours(int h, int m){
        this.alarmHours = h;
        this.alarmMinutes = m;
    }

    public int getHours(){
        return (Integer.parseInt(java.time.LocalTime.now().toString().substring(0, 2)));
    }

    public int getMinutes(){
        return (Integer.parseInt(java.time.LocalTime.now().toString().substring(3, 5)));
    }

    public String getTime(){
        if ((getHours() >= alarmHours) && (getMinutes() >= alarmMinutes)){
            System.out.print ("\nAlarm! \u23F0 ");
            setAlarmHours(25, 25);
        }
        return String.valueOf((new Clock(getHours(), getMinutes())));
    }

    @Override
    public String toString() {
        return "Clock {" +
                "hours = " + hours +
                ", minutes = " + minutes +
                '}';
    }
}

/* test
 *
 * ------------ CLOCK ------------
 * hours: 4
 * minutes: 29
 *
 * Alarm! ⏰ Clock {hours = 4, minutes = 29}
 *
 * Clock {hours = 4, minutes = 29}
 *
 * Alarm! ⏰ Clock {hours = 4, minutes = 29}
 *
 * ------------ WORLD CLOCK ------------
 *
 * World clock {hours = 7, minutes = 29}
 *
 * Alarm! ⏰ Clock {hours = 7, minutes = 29}
 *
 *
 * */
