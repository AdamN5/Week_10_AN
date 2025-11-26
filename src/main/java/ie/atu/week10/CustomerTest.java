package ie.atu.week10;

public class CustomerTest
{
    private Customer part1Customer;
    private Customer part2Customer;

    public CustomerTest()
    {
        part1Customer = new Customer(
                "Alice Smith",
                "1 High Street",
                "0851234567",
                1001,
                true

        );

        part2Customer = new Customer();
        part2Customer.setName("Bob");
        part2Customer.setAddress("2 Low Street");
        part2Customer.setPhoneNumber("0867654321");
        part2Customer.setCustomerNumber(1002);
        part2Customer.setMailingList(false);

    }

    @Override
    public String toString() {
        return
                "-----------------------------------------------------------------------------------" +
                "\n" +
                "CustomerTest: " +
                "\n" +
                "Part1Customer=" + part1Customer +
                "\n" +
                "Part2Customer=" + part2Customer +
                "\n" +
                "-----------------------------------------------------------------------------------";
    }
}
