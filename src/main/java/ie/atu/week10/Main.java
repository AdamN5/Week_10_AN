package ie.atu.week10;

public class Main
{
    public static void main(String[] args)
    {

        Person firstPerson = new Person();
        firstPerson.setName("Adam");
        firstPerson.setAddress("Crowe Street, Gort");
        firstPerson.setPhoneNumber("087123456");

        System.out.println(firstPerson);
    }
}