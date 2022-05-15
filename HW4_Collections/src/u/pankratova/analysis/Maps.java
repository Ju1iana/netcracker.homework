package u.pankratova.analysis;

import java.util.*;

public class Maps {
    public static void main(String[] args) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();


        // add
        System.out.println("Time of adding elements for HashMap " + completeCollection(hashMap, 1_000_000));
        System.out.println("Time of adding elements for LinkedHashMap: " + completeCollection(linkedHashMap, 1_000_000));
        System.out.println("Time of adding elements for TreeMap: " + completeCollection(treeMap, 1_000_000) + "\n");

        // remove at the start
        System.out.println("Time of removing elements for HashMap: (start) " + removeElement(hashMap, 0));
        System.out.println("Time of removing elements for LinkedHashMap: (start) " + removeElement(linkedHashMap, 0));
        System.out.println("Time of removing elements for TreeMap: (start) " + removeElement(treeMap, 0) + "\n");

        // remove at the middle
        System.out.println("Time of removing elements for HashMap: (middle) " + removeElement(hashMap, 50000));
        System.out.println("Time of removing elements for LinkedHashMap: (middle) " + removeElement(linkedHashMap, 50000));
        System.out.println("Time of removing elements for TreeMap: (middle) " + removeElement(treeMap, 50000) + "\n");

        // remove at the end
        System.out.println("Time of removing elements for HashMap: (end) " + removeElement(hashMap, 99000));
        System.out.println("Time of removing elements for LinkedHashMap: (end) " + removeElement(linkedHashMap, 99000));
        System.out.println("Time of removing elements for TreeMap: (end) " + removeElement(treeMap, 99000) + "\n");

    }

    public static long completeCollection(Map<Integer, Integer> collection, int n) {

        long start = System.currentTimeMillis();
        for (int i = 1; i <= n; i++) {
            collection.put(i, i);
        }
        return System.currentTimeMillis() - start;
    }

    /* nanoTime (!!) */
    public static long removeElement(Map<Integer, Integer> collection, int n) {
        long start = System.nanoTime();
        collection.remove(n);
        return System.nanoTime() - start;
    }
}

/*
Output:

1.
Time of adding elements for HashMap 92
Time of adding elements for LinkedHashMap: 138
Time of adding elements for TreeMap: 203

Time of removing elements for HashMap: (start) 6900
Time of removing elements for LinkedHashMap: (start) 1300
Time of removing elements for TreeMap: (start) 47400

Time of removing elements for HashMap: (middle) 7200
Time of removing elements for LinkedHashMap: (middle) 3700
Time of removing elements for TreeMap: (middle) 24500

Time of removing elements for HashMap: (end) 2600
Time of removing elements for LinkedHashMap: (end) 2600
Time of removing elements for TreeMap: (end) 14500



2.
Time of adding elements for HashMap 101
Time of adding elements for LinkedHashMap: 141
Time of adding elements for TreeMap: 197

Time of removing elements for HashMap: (start) 6800
Time of removing elements for LinkedHashMap: (start) 1300
Time of removing elements for TreeMap: (start) 35400

Time of removing elements for HashMap: (middle) 5300
Time of removing elements for LinkedHashMap: (middle) 2500
Time of removing elements for TreeMap: (middle) 20000

Time of removing elements for HashMap: (end) 2200
Time of removing elements for LinkedHashMap: (end) 2800
Time of removing elements for TreeMap: (end) 9200


3.
Time of adding elements for HashMap 143
Time of adding elements for LinkedHashMap: 139
Time of adding elements for TreeMap: 270

Time of removing elements for HashMap: (start) 6600
Time of removing elements for LinkedHashMap: (start) 1400
Time of removing elements for TreeMap: (start) 38100

Time of removing elements for HashMap: (middle) 5400
Time of removing elements for LinkedHashMap: (middle) 2400
Time of removing elements for TreeMap: (middle) 34900

Time of removing elements for HashMap: (end) 3800
Time of removing elements for LinkedHashMap: (end) 4700
Time of removing elements for TreeMap: (end) 9300

*/
