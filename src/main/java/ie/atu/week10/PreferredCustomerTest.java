package ie.atu.week10;

public class PreferredCustomerTest {
    public static void main(String[] args) {
        PreferredCustomer pc = new PreferredCustomer();

        pc.setName("Stephen");
        pc.setAddress("Dublin");
        pc.setPhoneNumber("0871112222");
        pc.setCustomerNumber(95);
        pc.setMailingList(true);

        System.out.println(pc);

        pc.addLoyaltyPoints(700);
        System.out.println(pc);

        pc.addLoyaltyPoints(800);
        System.out.println(pc);
    }
}
