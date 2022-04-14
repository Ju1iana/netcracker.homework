package u.pankratova.ch2;

/*
 *Implement a class Car that models a car traveling along the x-axis, consuming
 * gas as it moves. Provide methods to drive by a given number of\
 * miles, to add a given number of gallons to the gas tank, and to get the
 * current distance from the origin and fuel level. Specify the fuel efficiency
 * (in miles/gallons) in the constructor.
 *
 *
 * не забываем, что наша машина - чёрно-жёлтый ford mustang 4.0 на механике,
 * и двигаемся мы по трассе --> MPG ~ 26
 *
 */

public class Car {

    private final double MPG = 26;
    private double miles; // total miles
    private double passedMiles; // miles traveled
    private double tankStock = 15; // tank stock
    private double gallons = 11; // gallons refueled
    private final static double EPSILON = 0.00001;


    public Car(double miles) {
        this.miles = miles;
    }

    public void passedMiles(double m) {

        if (miles > 0) {
            miles = miles - m; // remained miles
            passedMiles = m; // passed miles
            updateGallons(passedMiles);

            System.out.println();
        }
        if ((miles - 0.0 < EPSILON) || miles < 0) {
            System.out.println("You've driven  " + m + " miles.");
            System.out.println("You have arrived at your destination. ");
        }
    }

    public double getMiles() {
        return miles;
    }

    public double getGallons() {
        return gallons;
    }

    public double getTankStock() {
        return tankStock;
    }

    public void updateGallons(double passedMiles) {
        gallons = getGallons() - (passedMiles / MPG);
        if ((gallons - 0.0) < EPSILON) {
            System.out.println();
            System.out.println("You've driven  " + passedMiles + " miles.");
            System.out.println("Your tank is empty. It is impossible to continue driving. (look down -->)");
            System.out.println(this);
        } else if (gallons == tankStock) {
            System.out.println("The tank is full. ");
        } else if (gallons >= tankStock) {
            this.gallons = getTankStock();
            System.out.println("The tank is full. ");
        }
    }

    public void plusGallons(double g) {
        this.gallons = gallons + g;
        if (gallons > tankStock) {
            gallons = tankStock;
        }
    }

    public double getPassedMiles() {
        return passedMiles;
    }

    @Override
    public String toString() {
        return "CarStats {" +
                miles + " miles left " +
                ", gallons = " + gallons + "/" + getTankStock() +
                '}';
    }

    /* test
     * Let's travel - 300.0 miles. Car filled with 11.0/15.0 gallons.
     * 0: CarStats {300.0 miles left , gallons = 11.0/15.0}
     *
     * You've driven  - 130.0 miles.
     * 1: CarStats {170.0 miles left , gallons = 6.0/15.0}
     *
     * You've driven  157.0 miles.
     * Your tank is empty. It is impossible to continue driving. (look down -->)
     * CarStats {13.0 miles left , gallons = -0.038461538461538325/15.0}
     *
     * You refueled. There are now 15.0 gallons in your tank.
     * 3: CarStats {13.0 miles left , gallons = 15.0/15.0}
     * 
     * You've driven  13.0 miles.
     * You have arrived at your destination.
     * */
}
