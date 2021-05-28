package day47_constractors;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country = "USA";

    //constructor - automaticlly called
    public Address() {
        System.out.println("Address constructor");
        street = "123 unknown street";
        city = "Unknown";
        state = "Unknown";
        zipCode = "00000";
    }
    public Address(String street,String city, String zipCode, String state) {
        this.zipCode = zipCode;
        this.state = state;
        this.street = street;
        this.city = city;
        setStreet(street);//reuse setter methode
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (street.isEmpty()||street.length()>50) {
            System.out.println("Error");
        } else {
            this.street = street;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + ", " + zipCode;
    }
}
