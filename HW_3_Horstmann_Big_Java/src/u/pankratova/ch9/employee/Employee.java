package u.pankratova.ch9.employee;

public abstract class Employee {
    protected String name;

    public abstract double weeklyPay(int hoursWorked);

    public String getName() {
        return name;
    }

    public void setName(String employeeName) {
        this.name = name;
    }
}
