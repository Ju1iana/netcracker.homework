ArrayList vs LinkedList:
---


| operation        |      ArrayList       |            LinkedList |
|------------------|:--------------------:|:----------------------:|
| add              |        loser         |             ` winner` |
| set              |      ` winner`       |                 loser |
| remove (start)   |        loser         |              `winner` |
| remove (middle)  |      `winner `       |                 loser |
| remove (end)     |      ` winner`       |                 loser |
| remove all       |        loser         |             ` winner` |

![]()

![](https://github.com/Ju1iana/netcracker.homework/blob/main/HW4_Collections/src/u/pankratova/resources/a.png)

Conclusion:
----
    this time we have no winners and losers. Friendship won, which means that you need to choose
    between ArrayList and LinkedList depending on the specific situation.
<hr>

HashSet vs LinkedHashSet vs TreeSet:
---

| operation        |  HashSet  | LinkedHashSet | TreeSet |
|------------------|:---------:|:--------------:|:--------|
| add              |  normal   |     ` winner` | loser   |
| remove (start)   |  normal   |      `winner` | loser   |
| remove (middle)  |  normal   |      `winner` | loser   |
| remove (end)     | ` winner` |        normal | loser   |
| remove all       |  normal   |     ` winner` | loser   |

![]()

![](https://github.com/Ju1iana/netcracker.homework/blob/main/HW4_Collections/src/u/pankratova/resources/b1.png)
![](https://github.com/Ju1iana/netcracker.homework/blob/main/HW4_Collections/src/u/pankratova/resources/b2.png)

Conclusion:
----
    An absolute victory for LinkedHashSet, but HashSet behaved with dignity. The basic thing when using it
    is to remember about the features, for example: HashSet is an unordered/unsorted collection of the data
    set, whereas the LinkedHashSet is an ordered and sorted collection of HashSet. Which of the collections
    to use depends on the need to arrange the elements.
<hr>

HashMap vs LinkedHashMap vs TreeMap:
---

| operation        |  HashMap   | LinkedHashMap | TreeMap |
|------------------|:----------:|:--------------:|:--------:|
| add              |  `winner`  |        normal | loser   |
| remove (start)   |   normal   |      `winner` | loser   |
| remove (middle)  |   normal   |      `winner` | loser   |
| remove (end)     | ` winner`  |        normal | loser   |

![]()

![](https://github.com/Ju1iana/netcracker.homework/blob/main/HW4_Collections/src/u/pankratova/resources/c1.png)
![](https://github.com/Ju1iana/netcracker.homework/blob/main/HW4_Collections/src/u/pankratova/resources/c2.png)

Conclusion:
----
    We see that hashMap and linkedHashMap are better, than treeMap, but we must remember about Iteration Order:
    LinkedHashMap - insertion-order; HashMap - no guaranteed order, will remain constant over time; TreeMap - 
    sorted according to the natural ordering.Which of the collections to use depends on the need to  arrange the 
    elements. 

<hr>

*Some calculations were performed using nanoTime() for a more accurate calculation*
