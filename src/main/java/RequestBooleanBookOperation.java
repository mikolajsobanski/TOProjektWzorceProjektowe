import java.util.Scanner;

public class RequestBooleanBookOperation implements Command {
    private Library library;




    public RequestBooleanBookOperation(Library library) {
        this.library = library;

    }
    @Override
    public void execute() {
        System.out.println("Podaj id ksiazki");
        Scanner scanner = new Scanner(System.in);
        String wybor = scanner.nextLine();
        int i=Integer.parseInt(wybor);

        library.requestBook(i);
    }
}