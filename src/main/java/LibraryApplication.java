import static java.lang.System.out;

public class LibraryApplication {

    public static void main(String[] args) {
        Librarian librarian = new Librarian();
        Client firstClient = new Client("Test", 3);
        Client secondClient = new Client("Nane", 2);

        RequestBooleanBookOperation requestBooleanBookOperation = new RequestBooleanBookOperation(librarian,2);
        requestBooleanBookOperation.execute();

        out.println(librarian.totoString());

    }
}
