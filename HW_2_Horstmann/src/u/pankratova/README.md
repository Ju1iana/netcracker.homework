Core Java Se 9 for the Impatient. Horstmann Cay S.
---
---
**ch1:**
1. Write a program that reads an integer angle (which may be positive or
   negative) and normalizes it to a value between 0 and 359 degrees. Try
   it first with the % operator, then with floorMod.
2. Write a program that computes the factorial n! = 1 × 2 × . . . × n, using
   BigInteger. Compute the factorial of 1000.
3. Write a program that reads a string and prints all of its nonempty
   substrings.
4. Write a program that prints a lottery combination, picking six distinct
   numbers between 1 and 49. To pick six distinct numbers, start with an
   array list filled with 1...49. Pick a random index and remove the element.
   Repeat six times. Print the result in sorted order.

**ch2:**
1. Implement an immutable class Point that describes a point in the plane.
   Provide a constructor to set it to a specific point, a no-arg constructor to
   set it to the origin, and methods getX, getY, translate, and scale. The translate
   method moves the point by a given amount in x- and y-direction. The
   scale method scales both coordinates by a given factor. Implement these
   methods so that they return new points with the results. For example,
   Point p = new Point(3, 4).translate(1, 3).scale(0.5);
   should set p to a point with coordinates (2, 3.5).
2. Implement a class Car that models a car traveling along the x-axis, consuming
   gas as it moves. Provide methods to drive by a given number of
   miles, to add a given number of gallons to the gas tank, and to get the
   current distance from the origin and fuel level. Specify the fuel efficiency
   (in miles/gallons) in the constructor. Should this be an immutable class?
   Why or why not?
3. Download the JAR file for OpenCSV from http://opencsv.sourceforge.net. Write
   a class with a main method that reads a CSV file of your choice and prints
   some of the content. There is sample code on the OpenCSV website. You
   haven’t yet learned to deal with exceptions. Just use the following header
   for the main method:
   public static void main(String[] args) throws Exception
   The point of this exercise is not to do anything useful with CSV files, but
   to practice using a library that is delivered as a JAR file.

**ch3:**
1. Provide an interface Measurable with a method double getMeasure() that measures
   an object in some way. Make Employee implement Measurable. Provide
   a method double average(Measurable[] objects) that computes the average
   measure. Use it to compute the average salary of an array of employees.
2. Continue with the preceding exercise and provide a method Measurable
   largest(Measurable[] objects). Use it to find the name of the employee with
   the largest salary. Why do you need a cast?
3. Implement a static of method of the IntSequence class that yields a sequence
   with the arguments. For example, IntSequence.of(3, 1, 4, 1, 5, 9) yields a
   sequence with six values. Extra credit if you return an instance of an
   anonymous inner class.
4. Add a static method with the name constant of the IntSequence class that
   yields an infinite constant sequence. For example, IntSequence.constant(1)
   yields values 1 1 1..., ad infinitum. Extra credit if you do this with a
   lambda expression.
