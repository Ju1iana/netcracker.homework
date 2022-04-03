
/* скажите потом, как лучше: с комментариями (о выводе результата) или без них */

package u.pankratova;

import u.pankratova.ball.Ball;
import u.pankratova.ball.Container;
import u.pankratova.myComplex.MyComplex;
import u.pankratova.myPolynomial.MyPolynomial;

public class Main {
    public static void main(String[] args) {

        /*-------MyPolynomial-------*/
        MyPolynomial p1 = new MyPolynomial(1, 4,3);

        double [] coeffs = {8, 2};
        MyPolynomial p2 = new MyPolynomial(coeffs);

        System.out.println(p1.equals(p2));  // false

        MyPolynomial p3 = new MyPolynomial(coeffs);

        System.out.println(p2.equals(p3)); // true
        System.out.println(p2.hashCode() == p3.hashCode()); // true

        System.out.println("\n1) " + p1);  // | return is: 1) 3.0x^2 + 4.0x + 1
        System.out.println("2) " + p2);    // | return is: 2) 2.0x + 8.0

        double evX = 3;
        System.out.println("\nWhen x = " + evX + " in polynomial " + p2 + " = " + evX + " =>> " + p2.evaluate(evX)); // | return is: 14.0
        System.out.println("\nMultiply p1 * p2 =>> " + p1.multiply(p2));  // | return is: 6.0x^3 + 32.0x^2 + 34.0x + 8.0
        System.out.println("Add p1 + p2 =>> " + p1.add(p2));              // | return is: 3.0x^2 + 6.0x + 9.0
        System.out.println("\n================================");



        /*-------MyComplex-------*/
        MyComplex c1 = new MyComplex(2, 3.4);
        MyComplex c2 = new MyComplex(0, 11.9);
        MyComplex c3 = new MyComplex();

        System.out.println(c1.equals(c2)); // false

        c3.setValue(0, 11.9);

        System.out.println("c1: " + c1);   // | return is:  real + imag: (2.0 + 3.4i)
        System.out.println("c2: " + c2);   // | return is:  real + imag: (0.0 + 11.9i)
        System.out.println("c3: " + c3);   // | return is:  real + imag: (0.0 + 11.9i)

        System.out.println("\ncheck a real value (c1): " + c1.isReal());  // | return is: true
        System.out.println("check a imaginary value (c1): " + c1.isImaginary()); // | return is: true

        System.out.println("check a real value (c2): " + c2.isReal());  // | return is: false
        System.out.println("check a imaginary value (c2): " + c2.isImaginary());  // | return is: true

        System.out.println("check a real value (c3): " + c3.isReal());  // | return is: false
        System.out.println("check a imaginary value (c3): " + c3.isImaginary());  // | return is: true

        System.out.println("\n" + c1 + " equal to " + c3 + "? ==> " + c1.equals(c3));  // | return is: false
        System.out.println(c2 + " equal to " + c3 + "? ==> " + c3.equals(c2));  // | return is: true

        System.out.println("\nThe absolute value of a number c1: " + c1.magnitude()); // | return is: 3.944616584663204

        System.out.println("\nc1 add c2: " + c1.addNew(c2));  // | return is: real + imag: (2.0 + 15.3i)
        System.out.println("c1 subtract c2: " + c1.subtractNew(c2));  // | return is: real + imag: (2.0 + -8.5i)

        System.out.println("c1 divide c2: " + c1.divide(c2));  // | return is: real + imag: (0.2857142857142857 + -0.1680672268907563i)
        System.out.println("\n================================");

        /*-------Ball-------*/
        Ball b = null;
        Ball b2 = null;


        // System.out.println(b.equals(b2)); // NullPointerException


        try {
            b = new Ball(35, 55, 6, 10, 30); // direction should be from [-180; 180]
            b2 = new Ball(11,9,2,4,45);
        } catch (IllegalArgumentException e){
            System.out.println("Unable to create Ball instance: " + e.getMessage());
        }

        System.out.println(b.equals(b2)); // false
        Container containerBox = new Container(0, 0, 100, 100);

        // Test
        System.out.println(b);
        System.out.println("container: " + containerBox);

        System.out.println("\nMoving b1: ");
        for (int step = 0; step < 5; step++){
            b.move();
            System.out.println(b);
            System.out.println(containerBox.collides(b));
        }

        System.out.println("\nMoving b2: ");
        for (int step = 0; step < 5; step++){
            b2.move();
            System.out.println(b2);
            System.out.println(containerBox.collides(b2));
        }

        // getters
        System.out.println("\nb1: \ngetX: " + b.getX() + ", getY: " + b.getY() + "\ngetRadius: " + b.getRadius() +
                "\ngetxDelta: " + b.getxDelta() + ", getyDelta: " + b.getyDelta());


        // setters
        b2.setX(4);
        b2.setY(20);
        b2.setRadius(15);
        b2.setxDelta(26.8f);
        b2.setyDelta(1.1f);
        System.out.println("\nb2: \ngetX: " + b2.getX() + ", getY: " + b2.getY() + "\ngetRadius: " + b2.getRadius() +
                "\ngetxDelta: " + b2.getxDelta() + ", getyDelta: " + b2.getyDelta());

    }
}
