package homework11;

public class Adress {
    private String street;
    private String city;
    private String country;

    public Adress(String street, String city, String country) {
        this.city = city;
        this.country = country;
        this.street=street;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
