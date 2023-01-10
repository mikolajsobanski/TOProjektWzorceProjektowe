public class Client implements Customer, DebtMessenger{
    protected String name;
    protected int id;
    protected static int idCount = 0;
    protected Boolean isAdmin;
    protected double totalDebt = 0;
    protected String city;
    protected String phoneNumber;
    protected String email;
    //TODO: add whatever other parameters might be necessary

    //TODO: make a Factory or a Builder for Clients
    public Client(String name, String city, String phoneNumber, String email) {
        this.name = name;
        this.id = idCount++;
        this.isAdmin = false;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public Boolean getAdmin() {
        return false;
    }
    public double getTotalDebt() {
        return totalDebt;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void incurDebt(double newDebt) {
        totalDebt += newDebt;
    }
    public void reduceDebt(double newDebt) {
        totalDebt -= newDebt;
    }
    @Override
    public double countDebt() {
        return totalDebt;
    }
    @Override
    public void message() {
        System.out.println("User " + name + " has " + totalDebt + " debt remaining!");
    }
}
