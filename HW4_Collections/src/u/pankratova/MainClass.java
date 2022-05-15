package u.pankratova;

import u.pankratova.collection.MyLinkedList;

public class MainClass {
    public static void main(String[] args) {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        System.out.println("-------------------------- Test MyLinkedList --------------------------");

        // add
        System.out.println("Elements added by us: ");
        for (int i = 0; i < 122; i++) { myLinkedList.add(i); }
        System.out.println(myLinkedList + "\n");

        // set and get
        System.out.println("Set the element = 333333 to the middle of the list and show it: ");
        myLinkedList.set((myLinkedList.size()/2), 333333);
        System.out.println("New item in position " + (myLinkedList.size()/2) + " = " +
                myLinkedList.get(myLinkedList.size()/2));
        System.out.println(myLinkedList + "\n");

        // indexOf
        System.out.println("IndexOf:");
        System.out.println(myLinkedList.indexOf(66) + "\n"); // expect 66

        // size
        System.out.println("Size: " + myLinkedList.size() + "\n");

        // remove
        System.out.println("Remove the element with index = 0");
        myLinkedList.remove(0);
        System.out.println(myLinkedList + "\n");

        // to array
        System.out.println("Convert myLinkedList to array: ");
        convert(myLinkedList.size(), myLinkedList);


        // clear
        System.out.println("Before cleaning: " + myLinkedList + "\n");
        myLinkedList.clear();
        System.out.println("After cleaning: " + myLinkedList + "\n" );
    }

    static void convert(int size, MyLinkedList<Integer> myLinkedList){
        Integer arr [] = new Integer[size];
        myLinkedList.toArray(arr);

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}

/*
Output:
-------------------------- Test MyLinkedList --------------------------
Elements added by us:
[ 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42
43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82
83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100 101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116
117 118 119 120 121]

Set the element = 333333 to the middle of the list and show it:
New item in position 61 = 333333
[ 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42
43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 333333 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80
81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100 101 102 103 104 105 106 107 108 109 110 111 112 113 114
115 116 117 118 119 120 121]

IndexOf:
66

Size: 122

Remove the element with index = 0
[ 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42
43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 333333 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80
81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100 101 102 103 104 105 106 107 108 109 110 111 112 113 114
115 116 117 118 119 120 121]

Convert myLinkedList to array:
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43
44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 333333 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81
82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100 101 102 103 104 105 106 107 108 109 110 111 112 113 114 115
116 117 118 119 120 121

Before cleaning: [ 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36
37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 333333 62 63 64 65 66 67 68 69 70 71 72 73 74
75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100 101 102 103 104 105 106 107 108 109
110 111 112 113 114 115 116 117 118 119 120 121]

After cleaning: null

*/
