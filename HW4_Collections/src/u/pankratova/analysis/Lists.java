package u.pankratova.analysis;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();


        // add
        System.out.println("Time of adding elements for ArrayList: " + completeCollection(arrayList, 100_000));
        System.out.println("Time of adding elements for LinkedList: " + completeCollection(linkedList, 100_000) + "\n");

        // set
        System.out.println("Time of insert for ArrayList: " + setOneElement(arrayList, 40000));
        System.out.println("Time of insert for LinkedList: " + setOneElement(linkedList, 40000) + "\n");

        // remove at the start
        System.out.println("Time of removing elements for ArrayList: (start) " + removeElement(arrayList, 0));
        System.out.println("Time of removing elements for LinkedList: (start) " + removeElement(linkedList, 0) + "\n");

        // remove at the middle
        System.out.println("Time of removing elements for ArrayList: (middle) " + removeElement(arrayList, 50000));
        System.out.println("Time of removing elements for LinkedList: (middle) " + removeElement(linkedList, 50000) + "\n");

        // remove at the end
        System.out.println("Time of removing elements for ArrayList: (end) " + removeElement(arrayList, 99000));
        System.out.println("Time of removing elements for LinkedList: (end) " + removeElement(linkedList, 99000) + "\n");

        // remove all
        System.out.println("Remove all elements for ArrayList: " + removeAll(arrayList));
        System.out.println("Remove all elements for LinkedList: " + removeAll(linkedList));

    }

    public static long completeCollection(List<Integer> collection, int n) {

        long start = System.currentTimeMillis();
        for (int i = 1; i <= n; i++) {
            collection.add(i);
        }
        return System.currentTimeMillis() - start;
    }

    /* nanoTime (!!) */
    public static long setOneElement(List <Integer> collection, int n){
        long start = System.nanoTime();
        collection.set(n, 5577);
        return System.nanoTime() - start;
    }

    /* nanoTime (!!) */
    public static long removeElement(List<Integer> collection, int n) {
        long start = System.nanoTime();
        collection.remove(n);
        return System.nanoTime() - start;
    }

    public static long removeAll(List<Integer> collection){
        long start = System.currentTimeMillis();
        collection.removeAll(collection);
        return System.currentTimeMillis() - start;
    }
}

/*
Output:

1.
Time of adding elements for ArrayList: 8
Time of adding elements for LinkedList: 6

Time of insert for ArrayList: 9400
Time of insert for LinkedList: 548100

Time of removing elements for ArrayList: (start) 76300
Time of removing elements for LinkedList: (start) 9200

Time of removing elements for ArrayList: (middle) 33200
Time of removing elements for LinkedList: (middle) 683900

Time of removing elements for ArrayList: (end) 2500
Time of removing elements for LinkedList: (end) 10900

Remove all elements for ArrayList: 3333
Remove all elements for LinkedList: 9

2.
Time of adding elements for ArrayList: 5
Time of adding elements for LinkedList: 3

Time of insert for ArrayList: 8700
Time of insert for LinkedList: 353300

Time of removing elements for ArrayList: (start) 59800
Time of removing elements for LinkedList: (start) 6500

Time of removing elements for ArrayList: (middle) 21100
Time of removing elements for LinkedList: (middle) 641400

Time of removing elements for ArrayList: (end) 3200
Time of removing elements for LinkedList: (end) 19100

Remove all elements for ArrayList: 3271
Remove all elements for LinkedList: 7

3.
Time of adding elements for ArrayList: 7
Time of adding elements for LinkedList: 5

Time of insert for ArrayList: 7900
Time of insert for LinkedList: 546800

Time of removing elements for ArrayList: (start) 71700
Time of removing elements for LinkedList: (start) 7600

Time of removing elements for ArrayList: (middle) 36400
Time of removing elements for LinkedList: (middle) 1084100

Time of removing elements for ArrayList: (end) 3400
Time of removing elements for LinkedList: (end) 15800

Remove all elements for ArrayList: 3362
Remove all elements for LinkedList: 9
*/
