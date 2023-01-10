import java.util.Scanner;

import static java.lang.System.out;

public class LibraryApplication {

    public static void main(String[] args) {
        Library library = new Library();
        AdminClient firstClient = new AdminClient("Test", 3);
        
        firstClient.indebt(secondClient, 3.13);
        someonesBrother.incurDebt(7.30);
        secondClient.incurDebt(2);

        DebtMessenger messenger = new PriorityMessengerDecorator(secondClient);
        messenger.message();

        for (Customer twoClient : twoClients) {
            out.println("And another one!");
        }

        out.println(twoClients.countDebt());


        for(;;) {
            out.print(
                    "-------MENU------\n" +
                            "L - Lend book\n" +
                            "R - Return book\n" +
                            "S  - Show books\n" +
                            "E - Exit\n" +
                            "----------\n");

            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();

            switch (choice){
                case "L":
                case "l":

                    RequestBooleanBookOperation requestBooleanBookOperation = new RequestBooleanBookOperation(library);
                    requestBooleanBookOperation.execute();
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
