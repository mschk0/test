package PersonPackage;

public class Address {
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private String country;
    private String city;
    private int zipCode;
    private String street;
    private String houseNumber;


    public Address(String country, String city, int zipCode, String street, String houseNumber) {
        this.country = country;
        this.city = city;
        this.zipCode = zipCode;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public void printAddressData() {
        System.out.println("Country: " + country);
        System.out.println("City: " + city);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("Street: " + street);
        System.out.println("HouseNumber: " + houseNumber);
    }
}
