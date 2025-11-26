package ie.atu.week10;

public class Customer extends Person
{
    private int customerNumber;
    private boolean mailingList;

    public Customer() {
        super();
        this.customerNumber = 0;
        this.mailingList = false;
    }
}
