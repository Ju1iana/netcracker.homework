package u.pankratova.ch3;

public class CashRegister {

    private double purchase;
    private double totalTax;
    private double oTax;
    private double taxRate;
    private double payment;
    private int count;


    public CashRegister() {
    }


    public CashRegister(double taxRate) {
        this.taxRate = taxRate / 100;
    }


    public void recordPurchase(double amount) {
        purchase += amount;
        count++;
    }


    public void recordTaxablePurchase(double amount) {
        purchase = purchase + amount + (amount * taxRate);
        oTax += amount * taxRate;
        count++;
    }


    public void receivePayment(double amount) {
        payment += amount;
    }


    public double giveChange() {
        double change = payment - purchase;
        totalTax += oTax;

        System.out.println("\ntotal tax: " + getTotalTax());
        System.out.println("payment: " + payment);
        System.out.println("quantity of goods: " + getCount());
        System.out.print("remainder: ");

        purchase = 0;
        payment = 0;
        return change;
    }


    public int getCount() {
        return count;
    }


    public double getTotalTax() {
        return totalTax;
    }
}


/* test

 * total tax: 58.8
 * payment: 600.0
 * quantity of goods: 5
 * remainder: 71.20000000000005
 *
 * */
