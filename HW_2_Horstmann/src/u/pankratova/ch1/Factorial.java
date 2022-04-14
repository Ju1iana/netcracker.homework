
/* Write a program that computes the factorial n! = 1 × 2 × . . . × n, using
   BigInteger. Compute the factorial of 1000. */

package u.pankratova.ch1;

import java.math.BigInteger;

public class Factorial {

    private int number;

    public Factorial(int number) {
        this.number = number;
    }

    public BigInteger f(){

        BigInteger result = new BigInteger(String.valueOf(1));

        if (number <= -1) return BigInteger.valueOf(0);
        else {
            for (int i = 1; i <= number; i++){
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
        }
    }
}

/*    test
 *  Number: 0  Answer: 1
 *  Number: 1  Answer: 1
 *  Number: 8  Answer: 40320
 *  Number: 1000  Answer: 402387260077093773543702433923003985719374864210714632543799910429938...
 *  Number: -15  Answer: 0
 */
