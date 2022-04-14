
/* Write a program that reads an integer angle (which may be positive or
negative) and normalizes it to a value between 0 and 359 degrees. Try
it first with the % operator, then with floorMod. */

package u.pankratova.ch1;

public class NormalizedAngle {

    private int angle;

    public NormalizedAngle(int angle) {
        this.angle = angle;
    }

    // with the % operator
    public int m1() {
        int remains = 0;

        if (angle >= 359 || angle < 0) {
            angle %= 360;
            remains = angle;

            if (remains < 0) return 360 - (-remains);
        } else {
            return this.angle;
        }
        return remains;
    }


    // with floorMod
    public int m2() {
        if (angle >= 0 && angle <= 359) return angle;
        else {
            if (Math.floorMod(1, this.angle) < 0) {
                return 360 - (-Math.floorMod(1, this.angle - 1));

            } else {
                return (Math.floorMod(1, this.angle));
            }
        }
    }
}

/*    test
 *  Enter the angle: 2;    Normalized angle: 2
 *  Enter the angle: 360;  Normalized angle: 0
 *  Enter the angle: 719;  Normalized angle: 359
 *  Enter the angle: 540;  Normalized angle: 180
 *  Enter the angle: -20;  Normalized angle: 340
 *  Enter the angle: -891; Normalized angle: 189
 */
