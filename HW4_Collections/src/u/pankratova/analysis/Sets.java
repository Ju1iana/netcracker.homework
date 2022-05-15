package u.pankratova.analysis;

import java.util.*;

public class Sets {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();


        // add
        System.out.println("Time of adding elements for HashSet " + completeCollection(hashSet, 100000));
        System.out.println("Time of adding elements for LinkedHashSet: " + completeCollection(linkedHashSet, 100000));
        System.out.println("Time of adding elements for TreeSet: " + completeCollection(treeSet, 100000) + "\n");

        // remove at the start
        System.out.println("Time of removing elements for HashSet: (start) " + removeElement(hashSet, 0));
        System.out.println("Time of removing elements for LinkedHashSet: (start) " + removeElement(linkedHashSet, 0));
        System.out.println("Time of removing elements for TreeSet: (start) " + removeElement(treeSet, 0) + "\n");

        // remove at the middle
        System.out.println("Time of removing elements for HashSet: (middle) " + removeElement(hashSet, 50000));
        System.out.println("Time of removing elements for LinkedHashSet: (middle) " + removeElement(linkedHashSet, 50000));
        System.out.println("Time of removing elements for TreeSet: (middle) " + removeElement(treeSet, 50000) + "\n");

        // remove at the end
        System.out.println("Time of removing elements for HashSet: (end) " + removeElement(hashSet, 99000));
        System.out.println("Time of removing elements for LinkedHashSet: (end) " + removeElement(linkedHashSet, 99000));
        System.out.println("Time of removing elements for TreeSet: (end) " + removeElement(treeSet, 99000) + "\n");

        // remove all
        System.out.println("Remove all elements for HashSet " + removeAll(hashSet));
        System.out.println("Remove all elements for LinkedHashSet: " + removeAll(linkedHashSet));
        System.out.println("Remove all elements for TreeSet: " + removeAll(treeSet));

    }

    public static long completeCollection(Set<Integer> collection, int n) {

        long start = System.currentTimeMillis();
        for (int i = 1; i <= n; i++) {
            collection.add(i);
        }
        return System.currentTimeMillis() - start;
    }

    /* nanoTime (!!) */
    public static long removeElement(Set<Integer> collection, int n) {
        long start = System.nanoTime();
        collection.remove(n);
        return System.nanoTime() - start;
    }

    public static long removeAll(Set<Integer> collection){
        long start = System.currentTimeMillis();
        collection.removeAll(collection);
        return System.currentTimeMillis() - start;
    }
}

/*
Output:

1.
Time of adding elements for HashSet 11
Time of adding elements for LinkedHashSet: 10
Time of adding elements for TreeSet: 30

Time of removing elements for HashSet: (start) 7400
Time of removing elements for LinkedHashSet: (start) 1800
Time of removing elements for TreeSet: (start) 45400

Time of removing elements for HashSet: (middle) 5600
Time of removing elements for LinkedHashSet: (middle) 2800
Time of removing elements for TreeSet: (middle) 18600

Time of removing elements for HashSet: (end) 2300
Time of removing elements for LinkedHashSet: (end) 2500
Time of removing elements for TreeSet: (end) 9600

Remove all elements for HashSet 11
Remove all elements for LinkedHashSet: 9
Remove all elements for TreeSet: 31


2.
Time of adding elements for HashSet 13
Time of adding elements for LinkedHashSet: 10
Time of adding elements for TreeSet: 28

Time of removing elements for HashSet: (start) 11300
Time of removing elements for LinkedHashSet: (start) 1300
Time of removing elements for TreeSet: (start) 43300

Time of removing elements for HashSet: (middle) 5500
Time of removing elements for LinkedHashSet: (middle) 2600
Time of removing elements for TreeSet: (middle) 18500

Time of removing elements for HashSet: (end) 2000
Time of removing elements for LinkedHashSet: (end) 2700
Time of removing elements for TreeSet: (end) 11500

Remove all elements for HashSet 15
Remove all elements for LinkedHashSet: 13
Remove all elements for TreeSet: 29


3.
Time of adding elements for HashSet 15
Time of adding elements for LinkedHashSet: 7
Time of adding elements for TreeSet: 36

Time of removing elements for HashSet: (start) 8500
Time of removing elements for LinkedHashSet: (start) 1500
Time of removing elements for TreeSet: (start) 49200

Time of removing elements for HashSet: (middle) 5800
Time of removing elements for LinkedHashSet: (middle) 7900
Time of removing elements for TreeSet: (middle) 25000

Time of removing elements for HashSet: (end) 3500
Time of removing elements for LinkedHashSet: (end) 7800
Time of removing elements for TreeSet: (end) 13000

Remove all elements for HashSet 19
Remove all elements for LinkedHashSet: 11
Remove all elements for TreeSet: 59
*/


