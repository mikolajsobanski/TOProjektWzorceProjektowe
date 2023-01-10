import java.util.Scanner;

public class RequestReturnBook implements Command{
    private Library library;


    public RequestReturnBook(Library library){
        this.library = library;

    }
    @Override
    public void execute() {
        String wyborSpliter[] = null;
        System.out.println("Podaj id ksiazki");
        Scanner scanner = new Scanner(System.in);
        String wybor = scanner.nextLine();
        int i=Integer.parseInt(wybor);
        System.out.println("Podaj nazwe ksiazki");
        Scanner scanner1 = new Scanner(System.in);
        String wybor1 = scanner1.nextLine();
        System.out.println("Podaj autora ksiazki");
        Scanner scanner2 = new Scanner(System.in);
        String wybor2 = scanner2.nextLine();
        Book request = new Book(i, wybor1,wybor2);
        library.returnBook(request);
    }
}
