package u.pankratova.ch3;

public class Battery {

    private double capacity;
    private final double fullBattery;
    private double remainingCapacity;

    public Battery(double capacity) {
        if (capacity < 2000) capacity = 2000; else this.capacity = capacity;
        if (capacity > 3000) capacity = 3000; else this.capacity = capacity;
        fullBattery = capacity;
    }

    public void drain(double amount){
        remainingCapacity = capacity - amount;
        capacity -= amount;
        if (remainingCapacity < 0) remainingCapacity = 0;
    }

    public void charge(){
        capacity = fullBattery;
        remainingCapacity = 0;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getRemainingCapacity(){
        return remainingCapacity;
    }
}

/*  test
*
* remaining capacity of the battery: 1460.0
* after charging: 2000.0
* remainder after charging: 0.0
* remaining capacity of the battery: 90.0
* remaining capacity of the battery: 40.0
* remaining capacity of the battery: 0.0
* after charging: 2000.0
*
* */
