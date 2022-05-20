Big Java: Early Objects, 7th Edition
---
---
**ch3:**
1. Enhance the CashRegister class so that it counts the purchased items. Provide a get-
   ItemCount method that returns the count.
2. Support computing sales tax in the CashRegister class. The tax rate should be supplied
   when constructing a CashRegister object. Add recordTaxablePurchase and getTotal-
   Tax methods. (Amounts added with recordPurchase are not taxable.) The giveChange
   method should correctly reflect the sales tax that is charged on taxable items.
3. Most countries (with the exception of Canada, Colombia, the Dominican Republic,
   Mexico, and the United States) follow the ISO 216 standard for paper sizes. An A0
   sheet has dimensions 841 × 1189 millimeters. An A1 sheet is obtained by cutting an
   A0 sheet in half along the larger dimension, yielding a 594 × 841 sheet. An A2 sheet
   is obtained by cutting it in half again, yielding a 420 × 594 sheet, and so on. Implement
   a class Sheet whose constructor makes an A0 sheet. Provide a method cutInHalf
   that yields a Sheet object of half the size. Also provide methods width, height, and name,
   returning the width and height in millimeters, as well as the name (such as "A2").
4. A Person has a name (just a first name for simplicity) and friends. Store the names of
   the friends in a string, separated by spaces. Provide a constructor that constructs a
   person with a given name and no friends. Provide methods
  - public void befriend(Person p)
  - public void unfriend(Person p)
  - public String getFriendNames()
5. Add a method
   public int getFriendCount()
   to the Person class of previous Exercise
6. Implement a class Student. For the purpose of this exercise, a student has a name
   and a total quiz score. Supply an appropriate constructor and methods getName(),
   addQuiz(int score), getTotalScore(), and getAverageScore(). To compute the average,
   you also need to store the number of quizzes that the student took.
   Supply a StudentTester class that tests all methods.
7. Write a class Battery that models a rechargeable battery. A battery has a constructor
   public Battery(double capacity)where capacity is a value measured in milliampere hours. A typical AA battery has a
   capacity of 2000 to 3000 mAh. The method
   public void drain(double amount)
   drains the capacity of the battery by the given amount. The method
   public void charge()
   charges the battery to its original capacity.
   The method
   public double getRemainingCapacity()
   gets the remaining capacity of the battery.

**ch8:**
1. Declare a class ComboLock that works like the combination lock
   in a gym locker, as shown here. The lock is constructed with
   a combina tion—three numbers between 0 and 39. The reset
   method resets the dial so that it points to 0. The turnLeft and
   turnRight methods turn the dial by a given number of ticks to the
   left or right. The open method attempts to open the lock. The lockopens if the user first turned it right to the first number in the combination, then left
   to the second, and then right to the third.

**ch9:**
1. worked example 9.1 
2. Implement a class ChessPiece with method setPosition(String coordinates). The coordinate
   string identifies the row and column in chess notation, such as "d8" for the initial
   position of the black queen. Also provide a method ArrayList<String> canMoveTo()
   that enumerates the valid moves from the current position. Provide subclasses Pawn,
   Knight, Bishop, Rook, Queen, and King.
3. Implement a class Clock whose getHours and getMinutes methods return the current
   time at your location. (Call java.time.LocalTime.now().toString() and extract the time
   from that string.) Also provide a getTime method that returns a string with the hours
   and minutes by calling the getHours and getMinutes methods. Provide a subclass World-
   Clock whose constructor accepts a time offset. For example, if you live in California,a new WorldClock(3) should show the time in New York, three time zones ahead.
   Which methods did you override? (You should not override getTime.)
4. Add an alarm feature to the Clock class of previous Exercise. When setAlarm(hours,
   minutes) is called, the clock stores the alarm. When you call getTime, and the alarm
   time has been reached or exceeded, return the time followed by the string "Alarm" (or,
   if you prefer, the string "\u23F0") and clear the alarm. What do you need to do to
   make the setAlarm method work for WorldClock objects?