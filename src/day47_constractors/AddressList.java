package day47_constractors;

public class AddressList {
    public static void main(String[] args) {

        Address myAddress = new Address(); // calling constructor automaticly
        myAddress.setStreet("1400 Winrock Blvd");
        myAddress.setCity("Houston");
        myAddress.setState("TX");
        myAddress.setZipCode("77057");

        System.out.println("CybertekSchool address: " + myAddress.toString());
        myAddress.setStreet("2400 McCue St");

        System.out.println("address after update = " + myAddress);
        System.out.println("street info = " + myAddress.getStreet());

        Address newAddress = new Address();
        System.out.println(newAddress.toString());

        Address papaJohn = new Address("8500 Tyco Rd", "Houston", "TX", "77057");
        System.out.println("papa John address = " + papaJohn.toString());



    }
}
