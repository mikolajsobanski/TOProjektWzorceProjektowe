public class AdminClient extends Client {

    public AdminClient(String name, String city, String phoneNumber, String email) {
        super(name, city, phoneNumber, email);
        isAdmin = true;
    }
    @Override
    public double countDebt() {
        if(totalDebt <= 10.0) {
            return 0.0;
        }
        return (totalDebt - 10.0);
    }
    void indebt(Client client, double penalty) {
        client.incurDebt(penalty);
    }
    //TODO: Maybe give the admins additional methods or fields?

}
