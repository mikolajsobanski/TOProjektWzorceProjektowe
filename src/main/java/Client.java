public class Client implements Customer, DebtMessenger{
    protected String name;
    protected int id;
    protected static int idCount = 0;
    protected Boolean isAdmin;
    protected double totalDebt = 0;
    //TODO: add whatever other parameters might be necessary

    //TODO: make a Factory or a Builder for Clients
    public Client(String name) {
        this.name = name;
        this.id = idCount++;
        this.isAdmin = false;
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
