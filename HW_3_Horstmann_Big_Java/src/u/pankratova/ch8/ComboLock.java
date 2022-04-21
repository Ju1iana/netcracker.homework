package u.pankratova.ch8;

public class ComboLock {

    private int n0, n1, n2;
    private int control;
    private int currentPosition;

    public ComboLock(int n0, int n1, int n2) {
            this.n0 = n0;
            this.n1 = n1;
            this.n2 = n2;
            this.control = 0;
            this.currentPosition = 0;
        }


    public void turnLeft(int ticks) {
        currentPosition -= ticks;
        if (currentPosition < 0) {
            currentPosition += 40;
        }
        if (currentPosition == n1 && control == 1) {
            control++;
        } else control = 0;
    }


    public void turnRight(int ticks) {
        currentPosition += ticks;
        if (currentPosition > 39) {
            currentPosition -= 40;
        }
        if (currentPosition == n0 && control == 0) {
            control++;
        } else if (currentPosition == n2 && control == 2) {
            control++;
        } else
            control = 0;
    }


    public boolean open() {
        if (control == 3) {
            return true;
        } else {
            return false;
        }
    }


    public void reset() {
        this.n0 = 0;
        this.n1 = 0;
        this.n2 = 0;
        control = 0;
        currentPosition = 0;
    }


    @Override
    public String toString() {
        return "ComboLock {" +
                "n0 = " + n0 +
                ", n1 = " + n1 +
                ", n2 =" + n2 +
                '}';
    }
}

/* test
*
* ComboLock {n1 = 12, n2 = 7, n3 =22} true
* reset() ComboLock {n1 = 0, n2 = 0, n3 =0}
* ComboLock {n1 = 0, n2 = 0, n3 =0} false
*
* */
