public class ClientBuilder {
    private String name;
    private String city;
    private String phoneNumber;
    private String email;

    public ClientBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ClientBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public ClientBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public ClientBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Client createClient() {
        return new Client(name, city, phoneNumber, email);
    }
}