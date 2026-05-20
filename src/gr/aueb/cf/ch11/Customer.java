package gr.aueb.cf.ch11;

public class Customer {
    private long id;
    private String firstname;
    private String lastname;
    private String afm;
    private String phoneNumber;
    private String region;
    private String prefecture;
    private String city;
    private String street;
    private String streetNumber;
    private String zipCode;

    public Customer() {

    }

    public Customer(long id, String firstname, String lastname, String afm, String phoneNumber, String region, String prefecture, String city, String street, String streetNumber, String zipCode) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.afm = afm;
        this.phoneNumber = phoneNumber;
        this.region = region;
        this.prefecture = prefecture;
        this.city = city;
        this.street = street;
        this.streetNumber = streetNumber;
        this.zipCode = zipCode;
    }

    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAfm() {
        return afm;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getRegion() {
        return region;
    }

    public String getPrefecture() {
        return prefecture;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAfm(String afm) {
        this.afm = afm;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}