package u.pankratova.ch3;

import java.util.ArrayList;
import java.util.List;

public class Person {


    private String name;
    private int friendsItem;

    public Person(String name) {
        this.name = name;
        this.friendsItem = 0;
    }

    List<Person> friendNames = new ArrayList<>();
    List<Person> toRemove = new ArrayList();

    public void befriend(Person p) {
        friendNames.add(p);
        friendsItem++;
    }

    public void unfriend(Person p) {

        for (Person i: friendNames) {
            if (friendNames.contains(p)) {
                toRemove.add(p);
                friendsItem--;
                break;
            } else {
                System.out.println("Friend is missing\n");
                break;
            }
        }
        friendNames.removeAll(toRemove);
    }

    public String getFriendNames() {
        return friendNames + "\n";
    }


    public String getName() {
        return name;
    }


    public int getFriendsItem() {
        return friendsItem;
    }

    @Override
    public String toString() {
        return this.name + " ";
    }
}

/* test
*
* Gleb
* friends - 4: [Boris , Alisa , Dmitry , Ulyana]
*
* Delete Boris
* friends - 3: [Alisa , Dmitry , Ulyana]
*
* Delete Ulyana
* friends - 2: [Alisa , Dmitry]
*
* Delete Anton
* Friend is missing
* friends - 2: [Alisa , Dmitry]
*
* Add Boris
* friends - 3: [Alisa , Dmitry , Boris]
*
* */
