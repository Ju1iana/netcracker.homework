package u.pankratova;

import u.pankratova.book.*;
import u.pankratova.employee.Employee;
import u.pankratova.figure.*;
import u.pankratova.myPoint.MyPoint;
import u.pankratova.figure.triangle.MyTriangle;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*-------Circle-------*/
        Circle circle = new Circle(5, "black");
        System.out.println("Circle area = " + circle.calculateArea());
        System.out.println("================================");


        /*-------Rectangle-------*/
        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println("Rectangle area = " + rectangle.calculateArea() + ";  " +
                "rectangle perimeter = " + rectangle.calculatePerimeter());
        System.out.println("================================");

        /*-------Employee-------*/
        Employee employee = new Employee(1, "Victor", " Mixei", 5000);
        employee.setPercent(15);
        System.out.println(employee.getName() + ", annual salary = " + employee.getAnnualSalary() + ", raise salary" +
                " for " + employee.getPercent() + "%" + " = " + employee.raiseSalary(employee.getPercent()) +
                ", new salary = " + 12 * employee.raiseSalary(employee.getPercent()));
        System.out.println(employee);
        System.out.println("================================");


        /*-------Book-------*/
        Author[] authors = new Author[3];
        authors[0] = new Author("AuthorOne", "authorOne@somewhere.com", 'm');
        authors[1] = new Author("AuthorTwo", "authorTwo@mail.ru", 'f');
        authors[2] = new Author("AuthorThree", "authorThree@internet.ru", 'm');

        Book bookOne = new Book("SomeBook", authors, 12.4, 2);

        // test book
        System.out.println("authors[0] - gender: " + authors[0].getGender());
        System.out.println("authors[1] - gender: " + authors[1].getGender());

        System.out.println("authors[0] - email: " + authors[0].getEmail());
        System.out.println("authors[1] - email: " + authors[1].getEmail());


        bookOne.setQty(44);
        System.out.println("qty: " + bookOne.getQty());

        bookOne.setPrice(24.532);
        System.out.println("price: " + bookOne.getPrice());

        System.out.println("name: " + bookOne.getName());

        System.out.println(bookOne);

        for (int i = 0; i < authors.length; i++){
            System.out.print(authors[i].nameToString());
        }
        System.out.println("\n================================");


        /*-------MyPoint -------*/
        MyPoint myPoint = new MyPoint(10,2);
        MyPoint myPoint2 = new MyPoint();

        System.out.println(myPoint);
        System.out.println(myPoint2);

        // setters and getters
        System.out.println("XY: " + Arrays.toString(myPoint.getXY()));
        myPoint.setX(8);
        myPoint.setY(9);
        System.out.println("\nNew coordinates Point " + myPoint);
        System.out.println("x: " + myPoint.getX() + ", y: " + myPoint.getY());

        myPoint2.setXY(14,6);
        System.out.println("\nNew coordinates Point2: " + Arrays.toString(myPoint2.getXY()));

        // overloaded versions of distance()
        System.out.println("\ndistance_1: " + myPoint.distance());
        System.out.println("distance_1: " + myPoint.distance(myPoint2));
        System.out.println("distance_1: " + myPoint.distance(3,4));
        System.out.println("distance_2: " + myPoint2.distance(myPoint));
        System.out.println("================================");

        /*-------MyTriangle-------*/
        MyTriangle triangleOne = new MyTriangle(0,0, 4, 4, 8,0);
        MyTriangle triangleTwo = new MyTriangle(new MyPoint(1,1), new MyPoint(3,5), new MyPoint(6,2));

        System.out.println("\nPerimeter triangleOne = " + triangleOne.getPerimeter());
        System.out.println("Perimeter triangleTwo = " + triangleTwo.getPerimeter());
        System.out.println(triangleOne);

        System.out.println("\ngetType triangleOne: " + triangleOne.getType());
        System.out.println("getType triangleTwo: " + triangleTwo.getType());
        System.out.println("================================");

    }


}
