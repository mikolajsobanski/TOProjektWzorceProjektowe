public class AdminClient extends Client {

    public AdminClient(String name, int bookId) {
        super(name, bookId);
        isAdmin = true;
    }

    //TODO: Maybe give the admins additional methods or fields?

}
