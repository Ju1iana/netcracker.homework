package u.pankratova;

import u.pankratova.ch1.Factorial;
import u.pankratova.ch1.Lottery;
import u.pankratova.ch1.NormalizedAngle;
import u.pankratova.ch1.Substrings;
import u.pankratova.ch2.Car;
import u.pankratova.ch2.Point;
import u.pankratova.ch3.IntSequence;
import u.pankratova.ch3.employee.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static u.pankratova.ch3.employee.Employee.largest;

public class Main {
    public static void main(String[] args) {

        /*-------NormalizedAngle-------*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the angle: ");
        NormalizedAngle nAngle = new NormalizedAngle(scanner.nextInt());

        System.out.println("Normalized angle m(1): " + nAngle.m1());
        System.out.println("Normalized angle m(2): " + nAngle.m2());
        System.out.println();


        /*-------Factorial-------*/

        Factorial factorial = new Factorial(8);
        System.out.println("Factorial = " + factorial.f());
        System.out.println();


        /*-------Substrings-------*/
        Substrings substrings = new Substrings();
        Scanner subScanner = new Scanner(System.in);

        System.out.println("Enter the word ");
        String word = subScanner.nextLine();

        System.out.println("The word " + word + ": ");

        substrings.calculateSub(word);
        System.out.println();


        /*-------Lottery-------*/
        Lottery lottery = new Lottery();
        lottery.lotteryCombination();
        System.out.println();


        /*-------Point-------*/
        Point point = new Point(3,4).translate(1,3).scale(0.5);
        Point point1 = new Point(3, 4).translate(2, 3).scale(0.5);
        System.out.println(point.equals(point1));
        System.out.println();


        /*-------Car-------*/
        Car fordMustang = new Car(300);
        System.out.println("Let's travel - " + fordMustang.getMiles() +" miles. Car filled with " +
                fordMustang.getGallons() + "/" + fordMustang.getTankStock() + " gallons. ");
        System.out.println("0: " + fordMustang);

        fordMustang.passedMiles(130);
        System.out.println("You've driven  - " + fordMustang.getPassedMiles() + " miles. ");

        System.out.println("1: " + fordMustang);

        fordMustang.passedMiles(157);

        fordMustang.plusGallons(70);
        System.out.println("You refueled. There are now " + fordMustang.getTankStock() + " gallons in your tank.");
        System.out.println("3: " + fordMustang);

        fordMustang.passedMiles(13);
        System.out.println();

        /*-------Measurable---ch3.ex1.----*/

        // 1)
        Employee e1 = new Employee("Bob", 1200);
        Employee e2 = new Employee("Olga", 960);
        Employee e3 = new Employee("Dima", 7000);

        Employee[] employees = new Employee[] {e1, e2, e3};
        System.out.println(e1.avg(employees));
        System.out.println();

        // 2)
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Bob", 1200));
        employeeList.add(new Employee("Olga", 960));
        employeeList.add(new Employee("Dime", 7000));

        Employee employee = new Employee(employeeList);
        System.out.println(employee.avg(employeeList));
        System.out.println();

        /*-------Measurable---ch3.ex2.----*/
        System.out.println("Maximum salary: " + largest(employees));
        // or:
        Employee employeeLarge = (Employee) largest(employees);
        System.out.println("name = " + employeeLarge.getName());
        System.out.println();

        /* ex4 */
        IntSequence sequ = IntSequence.of(3, 1, 4, 1, 5, 9);
        while (sequ.hasNext())
            System.out.print(sequ.next() + " ");
        System.out.println();

        /* ex5 */
        IntSequence constant = IntSequence.constant(111);
        for (int i = 0; i < 12 && constant.hasNext(); i++) {
            System.out.print(constant.next());
        }
    }
}
