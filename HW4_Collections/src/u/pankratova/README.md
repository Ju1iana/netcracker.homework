Tasks on the topic - parameterization, Java collections
---
         1. Implement the linked list shown in the UML diagram below.

![](https://github.com/Ju1iana/netcracker.homework/blob/main/HW4_Collections/src/u/pankratova/resources/collections.png)
---
The MyLinkedList class implements the ILinkedList interface, which contains a description of the basic operations for working with a linked list. These operations are completely similar to the operations in the Java implementation. The description can be found in the Java documentation (https://docs.oracle.com/javase/8/docs/api/java/util/List.html )
Detailed information about the linked lists can be found on the Internet.
We think over the implementation of the MyLinkedList class on our own. You can enter any auxiliary variables and methods at your discretion. As an implementation of the iterator behavior, we use the Java interface - https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
We create iterator objects by any means known to you. For example, you can create a separate class implementing the Iterator interface, you can create a factory, you can provide an anonymous iterator implementation, etc.
We test all operations in the MainClass class. We add the main method to the specified class and test all operations in it. The nodes contain objects of any type. You can use classes from previous tasks. For example, Circle, MyTriangle, etc.
It will also be interesting to compare the performance of the collection you wrote with the Java implementation. :) To do this, you need to create objects MyLinkedList and java.util.LinkedList. Estimate the approximate execution time of the main operations – adding, searching, deleting an element. To change the execution time, you can use the Duration class (read more https://www.baeldung.com/java-measure-elapsed-time ). We select the number of items in the collection ourselves.

         2. Comparative analysis of the performance of the main Java collections.
         Write a test class that measures the execution time of basic operations – adding, inserting, deleting elements
         a. Compare the performance of ArrayList and LinkedList for basic operations
         b. Compare the performance of HashSet, LinkedHashSet, TreeSet for basic operations
         c. Compare the performance of HashMap, LinkedHashMap, TreeMap
---

We choose the size, type, and number of test data ourselves.
Based on the results you have received, you will send me the conclusions along with the code :)
In the output, it is necessary to specify in which cases it is convenient to use a particular collection (for each of the items a,b,c)
