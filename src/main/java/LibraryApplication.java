import static java.lang.System.out;

public class LibraryApplication {

    public static void main(String[] args) {
        Library library = new Library();
        Client firstClient = new Client("Test", 3);
        Client secondClient = new Client("Nane", 2);

        //Client third = clientBuilder.build(arg);
        //clientComposite.add(third);

        //clientComposite.count();

        RequestBooleanBookOperation requestBooleanBookOperation = new RequestBooleanBookOperation(library,2);
        requestBooleanBookOperation.execute();

        out.println(library.totoString());

        //menu with three options:
        //request
        //return
        //exit

    }
}
