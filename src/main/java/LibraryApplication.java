import java.util.Scanner;

import static java.lang.System.out;

public class LibraryApplication {

    public static void main(String[] args) {
        Library library = new Library();
        AdminClient firstClient = new AdminClient("Test");
        Client secondClient = new Client("Name");
        Client someonesBrother = new Client("Brother");
        ClientComposite twoClients = new ClientComposite(secondClient, someonesBrother);
        firstClient.indebt(secondClient, 3.13);
        someonesBrother.incurDebt(7.30);
        secondClient.incurDebt(2);

        out.println("Pass your name");
        Scanner scanners = new Scanner(System.in);
        String choices = scanners.nextLine();
        Client newClient = new Client(choices);
        ClientComposite clients = new ClientComposite(twoClients,newClient);


        for(;;) {
            out.print(
                    "-------MENU------\n" +
                            "L - Lend book\n" +
                            "R - Return book\n" +
                            "S  - Show books\n" +
                            "D  - Show debt\n" +
                            "T  - Show total debt\n" +
                            "E - Exit\n" +
                            "----------\n");

            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();

            switch (choice){
                case "L":
                case "l":
                    RequestBooleanBookOperation requestBooleanBookOperation = new RequestBooleanBookOperation(library);
                    requestBooleanBookOperation.execute();
                    firstClient.indebt(newClient, 5.00);
                    break;
                case "S":
                case "s":
                    RequestShowAllBooks showAllBooks = new RequestShowAllBooks(library);
                    showAllBooks.execute();
                    break;
                case "R":
                case "r":

                    RequestReturnBook requestReturnBook = new RequestReturnBook(library);
                    requestReturnBook.execute();
                    newClient.reduceDebt(5.00);
                    break;
                case "D":
                case "d":
                    DebtMessenger messenger = new PriorityMessengerDecorator(newClient);
                    messenger.message();
                    break;
                case "T":
                case "t":
                    out.println("Total debt by all users is: " +clients.countDebt());
                    break;
                case "E":
                case "e":
                    System.exit(0);
                    break;
            }

            //
        }


       
        

       

    }
}
