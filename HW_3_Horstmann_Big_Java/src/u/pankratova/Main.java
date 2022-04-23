package u.pankratova;

import u.pankratova.ch3.*;
import u.pankratova.ch8.ComboLock;
import u.pankratova.ch9.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*-ch3------CashRegister-------*/
        CashRegister reg1 = new CashRegister(21);

        reg1.recordPurchase(30);
        reg1.recordPurchase(40);
        reg1.recordPurchase(120);

        reg1.recordTaxablePurchase(200);
        reg1.recordTaxablePurchase(80);

        reg1.receivePayment(600);

        System.out.println(reg1.giveChange());
        System.out.println();


        /*-ch3------Sheet-------*/
        Sheet sheet = new Sheet();
        System.out.println(sheet);  // A0

        sheet.cutInHalf();
        System.out.println(sheet);  // A1

        sheet.cutInHalf();
        System.out.println(sheet);  // A2

        sheet.cutInHalf();
        System.out.println(sheet);  // A3

        sheet.cutInHalf();
        System.out.println(sheet);  // A4

        System.out.println();


        /*-ch3------Person-------*/
        Person person = new Person("Gleb");
        System.out.println(person);
        Person f1 = new Person("Boris");
        Person f2 = new Person("Alisa");
        Person f3 = new Person("Dmitry");
        Person f4 = new Person("Ulyana");
        Person f5 = new Person("Anton");

        person.befriend(f1);
        person.befriend(f2);
        person.befriend(f3);
        person.befriend(f4);

        System.out.print("friends - " + person.getFriendsItem() + ": " + person.getFriendNames());

        System.out.println("\nDelete " + f1.getName());
        person.unfriend(f1);
        System.out.print("friends - " + person.getFriendsItem() + ": " + person.getFriendNames());

        System.out.println("\nDelete " + f4.getName());
        person.unfriend(f4);
        System.out.print("friends - " + person.getFriendsItem() + ": " + person.getFriendNames());

        System.out.println("\nDelete " + f5.getName());
        person.unfriend(f5);
        System.out.print("friends - " + person.getFriendsItem() + ": " + person.getFriendNames());

        System.out.println("\nAdd " + f1.getName());
        person.befriend(f1);
        System.out.print("friends - " + person.getFriendsItem() + ": " + person.getFriendNames());
        System.out.println();


        /*-ch3------Student-------*/
        Student s1 = new Student("Alexander");

        s1.addQuiz(71);
        s1.addQuiz(29);
        s1.addQuiz(53);
        s1.addQuiz(98);

        System.out.println("name: " + s1.getName());
        System.out.println("total: " + s1.getTotalScore());
        System.out.println("average: " + s1.getAverageScore());


        /*-ch3------Battery-------*/
        Battery battery = new Battery(2000);
        battery.drain(540);
        System.out.println("\nremaining capacity of the battery: " + battery.getRemainingCapacity());


        battery.charge();
        System.out.println("after charging: " + battery.getCapacity());
        System.out.println("remainder after charging: " + battery.getRemainingCapacity());

        battery.drain(1910);
        System.out.println("remaining capacity of the battery: " + battery.getRemainingCapacity());

        battery.drain(50);
        System.out.println("remaining capacity of the battery: " + battery.getRemainingCapacity());

        battery.drain(300);
        System.out.println("remaining capacity of the battery: " + battery.getRemainingCapacity());

        battery.charge();
        System.out.println("after charging: " + battery.getCapacity());
        System.out.println();


        /*-ch9------Employee-------*/
        Employee[] staff = new Employee[3];
        staff[0] = new HourlyEmployee("Morgan, Harry,", 30);
        staff[1] = new SalariedEmployee("Lin, Sally", 52000);
        staff[2] = new Manager("Smith, Mary", 104000, 50);

        for (Employee e : staff){

            System.out.print("Hours worked by " + e.getName() + ": ");
            int hours = 34;
            System.out.println("Salary: " + e.weeklyPay(hours));
        }
        System.out.println();


        /*-ch8------ComboLock-------*/
        ComboLock comboLock = new ComboLock(12, 7, 22);

        comboLock.turnRight(12);
        comboLock.turnLeft(5);
        comboLock.turnRight(15);

        System.out.println(comboLock + " " + comboLock.open());

        comboLock.reset();
        System.out.println("reset() " + comboLock);

        comboLock.turnRight(2);
        comboLock.turnLeft(30);
        comboLock.turnRight(11);

        System.out.println(comboLock + " " + comboLock.open());


        /*-ch9------Clock and WorldClock-------*/
        System.out.println("\n------------ CLOCK ------------");
        Clock clock = new Clock();
        System.out.println("hours: " + clock.getHours());
        System.out.println("minutes: " + clock.getMinutes());


        clock.setAlarmHours(4, 13); // set
        System.out.println(clock.getTime());

        System.out.println("\n" + clock.getTime()); // clear the alarm

        clock.setAlarmHours(4, 18); // set
        System.out.println(clock.getTime());

        System.out.println("\n------------ WORLD CLOCK ------------");

        WorldClock worldClock = new WorldClock(3);
        System.out.println("\n" + worldClock);
        worldClock.setAlarmHours(7, 25);
        System.out.println(worldClock.getTime());
        System.out.println();
        
        
        /*-ch9------ChessPiece-------*/

        // Pawn
        System.out.println("*----------------- Pawn -----------------*");
        Pawn pawn = new Pawn("d2");
        System.out.println("The pawn moves to: " + pawn.canMoveTo());

        Pawn pawn2 = new Pawn("a5");
        System.out.println("The pawn moves to: " + pawn2.canMoveTo());

        Pawn pawn3 = new Pawn("f7");
        System.out.println("The pawn moves to: " + pawn3.canMoveTo());

        Pawn pawn4 = new Pawn("e8");
        System.out.println("The pawn moves to: " + pawn4.canMoveTo());
        System.out.println();

        // Rook
        System.out.println("*----------------- Rook -----------------*");
        Rook rook = new Rook("a5");
        System.out.println("Rook: " + rook.canMoveTo());

        Rook rook2 = new Rook("g8");
        System.out.println("Rook: " + rook2.canMoveTo());

        Rook rook3 = new Rook("d3");
        System.out.println("Rook: " + rook3.canMoveTo());

        Rook rook4 = new Rook("f1");
        System.out.println("Rook: " + rook4.canMoveTo());
        System.out.println();

        // King
        System.out.println("*----------------- King -----------------*");

        King king = new King("d4");
        System.out.println("King: " + king.canMoveTo());

        King king1 = new King("b6");
        System.out.println("King1: " + king1.canMoveTo());
        System.out.println();


        // Bishop
        System.out.println("*----------------- Bishop -----------------*");
        Bishop bishop = new Bishop("f5");
        System.out.println("Bishop: " + bishop.canMoveTo().stream().distinct().collect(Collectors.toList()));

        Bishop bishop1 = new Bishop("b7");
        System.out.println("Bishop1: " + bishop1.canMoveTo().stream().distinct().collect(Collectors.toList()));

        Bishop bishop2 = new Bishop("h8");
        System.out.println("Bishop2: " + bishop2.canMoveTo().stream().distinct().collect(Collectors.toList()));


        // Queen
        System.out.println("*----------------- Queen -----------------*");
        Queen queen = new Queen("e3");
        System.out.println("Queen: " + queen.canMoveTo());

        Queen queen1 = new Queen("g8");
        System.out.println("Queen1: " + queen1.canMoveTo());


        // Knight
        System.out.println("*----------------- Knight -----------------*");
        Knight knight = new Knight("d4");
        System.out.println("Knight: " + knight.canMoveTo());

        Knight knight1 = new Knight("c6");
        System.out.println("Knight1: " + knight1.canMoveTo());
        
    }
}
