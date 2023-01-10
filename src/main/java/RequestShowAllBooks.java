public class RequestShowAllBooks implements Command{

    private Library library;

    public RequestShowAllBooks(Library library){
        this.library = library;
    }

    @Override
    public void execute() {
        library.showBooks();
    }
}
