import java.util.Scanner;

import static java.lang.System.out;

public class LibraryApplication {

    public static void main(String[] args) {
        Library library = new Library();
        Client firstClient = new Client("Test", 3);
        Client secondClient = new Client("Nane", 2);

        //Client third = clientBuilder.build(arg);
        //clientComposite.add(third);

        //clientComposite.count();

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
