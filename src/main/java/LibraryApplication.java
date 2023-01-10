import static java.lang.System.out;

public class LibraryApplication {

    public static void main(String[] args) {
        Library library = new Library();
        AdminClient firstClient = new AdminClient("Test", 3);
        Client secondClient = new Client("Name", 2);
        Client someonesBrother = new Client("Brother", 3);
        ClientComposite twoClients = new ClientComposite(secondClient, someonesBrother);

        //Client third = clientBuilder.build(arg);
        //clientComposite.add(third);

        //clientComposite.count();

        RequestBooleanBookOperation requestBooleanBookOperation = new RequestBooleanBookOperation(library,2);
        requestBooleanBookOperation.execute();

        firstClient.indebt(secondClient, 3.13);
        someonesBrother.incurDebt(7.30);
        secondClient.incurDebt(2);

        DebtMessenger messenger = new PriorityMessengerDecorator(secondClient);
        messenger.message();

        for (Customer twoClient : twoClients) {
            out.println("And another one!");
        }

        out.println(twoClients.countDebt());
        out.println(library.totoString());

        //menu with three options:
        //request
        //return
        //exit

    }
}
