/* Write a program that reads a string and prints all of its nonempty
   substrings. */

package u.pankratova.ch1;

public class Substrings {
    String sub;

    public String calculateSub(String s) {

        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j <= s.length() - i; j++) {
                sub = s.substring(i, j + i);
                System.out.println(sub);
            }
        }
        return "0";
    }
}

 /* test
        * Input: Bug
        * Output: The word Bug:

         B
         Bu
         Bug
         u
         ug
         g
             */
