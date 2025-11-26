package ie.atu.week10;

public class PreferredCustomer extends Customer {
    private int loyaltyPoints;
    private double discountLevel; // 0.05 for 5%, etc.

    public PreferredCustomer() {
        super();
        this.loyaltyPoints = 0;
        updateDiscountLevel();
    }

    public PreferredCustomer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList, int loyaltyPoints) {
        super(name, address, phoneNumber, customerNumber, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        updateDiscountLevel();
    }

    private void updateDiscountLevel() {
        int points = this.loyaltyPoints;
        if (points <= 500) {
            this.discountLevel = 0.00;
        } else if (points <= 999) {
            this.discountLevel = 0.05;
        } else if (points <= 1499) {
            this.discountLevel = 0.06;
        } else if (points <= 1999) {
            this.discountLevel = 0.07;
        } else { // >= 2000
            this.discountLevel = 0.10;
        }
    }

    public void addLoyaltyPoints(int points) {
        this.loyaltyPoints += points;
        updateDiscountLevel();
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
        updateDiscountLevel();
    }

    public double getDiscountLevel() {
        return discountLevel;
    }

    public void setDiscountLevel(double discountLevel) {
        this.discountLevel = discountLevel;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", loyaltyPoints=" + loyaltyPoints +
                ", discountLevel=" + discountLevel;
    }
}