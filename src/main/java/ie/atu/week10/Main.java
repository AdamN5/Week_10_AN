package ie.atu.week10;

public class Main
{
    public static void main(String[] args)
    {
        Person person = new Person("John", "Kinvarra","087222333");
        Customer Costumer = new Customer("Adam", "Crowe Street, Gort", "087123456", 42, true);
        System.out.println(person.toString());
        System.out.println(Costumer.toString());

        CustomerTest test = new CustomerTest();
        System.out.println(test);

    }
}