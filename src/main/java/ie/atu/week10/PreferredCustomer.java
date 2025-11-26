package ie.atu.week10;

public class PreferredCustomer extends Customer {
    private int loyaltyPoints;
    private double discountLevel; // 0.05 for 5%, etc.

    public PreferredCustomer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList, int loyaltyPoints) {
        super(name, address, phoneNumber, customerNumber, mailingList);
        this.loyaltyPoints = loyaltyPoints;
    }

    // constructors, methods, getters, setters, toString()
}