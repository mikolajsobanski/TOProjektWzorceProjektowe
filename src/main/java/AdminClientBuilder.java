public class AdminClientBuilder {
    private String name;
    private String city;
    private String phoneNumber;
    private String email;

    public AdminClientBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public AdminClientBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public AdminClientBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public AdminClientBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public AdminClient createAdminClient() {
        return new AdminClient(name, city, phoneNumber, email);
    }
}