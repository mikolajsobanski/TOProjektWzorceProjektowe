public class Client {
    protected String name;
    protected int id;
    protected static int idCount = 0;
    protected Boolean isAdmin;
    protected int bookRequestId;
    //TODO: add whatever other parameters might be necessary

    //TODO: make a Factory or a Builder for Clients
    public Client(String name, int bookId) {
        this.name = name;
        this.id = idCount++;
        this.bookRequestId = bookId;
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
}
