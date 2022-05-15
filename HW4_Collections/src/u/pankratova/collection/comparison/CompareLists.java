package u.pankratova.collection.comparison;

import u.pankratova.collection.MyLinkedList;

import java.time.Duration;
import java.time.Instant;
import java.util.LinkedList;

public class CompareLists {
    public static void main(String[] args) {

        Instant start;
        Instant end;

        //  MyLinkedList
        start = Instant.now();
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        for (int i = 0; i <= 12345678; i++) { myLinkedList.add(i); }
        myLinkedList.set(222, 3000);
        myLinkedList.remove(9999);
        myLinkedList.indexOf(10);
        myLinkedList.clear();
        end = Instant.now();
        System.out.println("Time for MyLinkedList: " + Duration.between(start, end).toMillis());


        // LinkedList
        start = Instant.now();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i <= 12345678; i++) { linkedList.add(i); }
        linkedList.set(222, 3000);
        linkedList.remove(9999);
        linkedList.indexOf(10);
        linkedList.clear();
        end = Instant.now();
        System.out.println("Time for LinkedList: " + Duration.between(start, end).toMillis());


    }
}

/*

Output:
1.
Time to add for MyLinkedList: 2121
Time to add for LinkedList: 1878

2.
Time to add for MyLinkedList: 2077
Time to add for LinkedList: 1896

3.
Time to add for MyLinkedList: 2058
Time to add for LinkedList: 1852

4.
Time for MyLinkedList: 2226
Time for LinkedList: 2032

5.
Time for MyLinkedList: 2139
Time for LinkedList: 1984

6.
Time for MyLinkedList: 2137
Time for LinkedList: 1953

*/
