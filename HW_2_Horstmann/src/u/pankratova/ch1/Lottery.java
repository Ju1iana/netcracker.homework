
/* Write a program that prints a lottery combination, picking six distinct
numbers between 1 and 49. To pick six distinct numbers, start with an
array list filled with 1...49. Pick a random index and remove the element.
Repeat six times. Print the result in sorted order. */

package u.pankratova.ch1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lottery {

    public void lotteryCombination() {

        List<Integer> l = IntStream.range(1, 50).boxed().collect(Collectors.toList());

        List<Integer> numbers = new ArrayList<>();

        for (int j = 0; j < l.size(); j++) {
            int x = (int) (1 + Math.random() * 49);
            if (x < l.size() && numbers.size() < 6) {
                numbers.add(l.remove(x));
            }

        }

        Collections.sort(numbers);
        System.out.println("Result: " + numbers);
    }
}

/* test
 * Result: [4, 20, 24, 41, 46, 49]
 * Result: [3, 9, 14, 16, 39, 41]
 * Result: [6, 15, 27, 39, 41, 48]
 *  */
