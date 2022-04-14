/* Provide an interface Measurable with a method double getMeasure() that measures
 * an object in some way. Make Employee implement Measurable. Provide
 * a method double average(Measurable[] objects) that computes the average
 * measure. Use it to compute the average salary of an array of employees. */

package u.pankratova.ch3.employee;

import java.util.List;

public class Employee implements Measurable {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name) {
        this.name = name;
        salary = 0;
    }

    public Employee(List<Employee> employees) {
        this.name = getName();
        this.salary = getSalary();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double getMeasurable() {
        return salary;
    }

    // 1)
    public double avg(Employee[] employees) {
        double sum = 0;
        for (Measurable m : employees) {
            sum = sum + m.getMeasurable();
        }
        return (sum / employees.length);
    }

    // 2)
    public double avg(List<Employee> employees) {
        double sum = 0;
        for (Measurable m : employees) {
            sum = sum + m.getMeasurable();
        }
        return sum / employees.size();
    }

    public static Measurable largest(Measurable[] objects){
        double max = 0;
        double measure = 0;
        Measurable object = null;

        for(Measurable m : objects){
            measure = m.getMeasurable();
            if (measure > max) {
                max = measure;
                object = m;
            }
        }
        return object;
    }

    @Override
    public String toString() {
        return "name = " + getName() + ", salary = " + getSalary();
    }
}

/* test
 *
 * 3053.3333333333335
 * 3053.3333333333335
 *
 * Maximum salary: name = Dima, salary = 7000.0
 *
 *  */
