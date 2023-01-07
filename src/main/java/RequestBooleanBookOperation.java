public class RequestBooleanBookOperation implements BooleanBookOperation {
    private Librarian librarian;
    private Integer requestedId;

    @Override
    public Boolean execute() {
        return librarian.requestBook(requestedId);
    }

    RequestBooleanBookOperation(Librarian librarian, Integer book) {
        this.librarian = librarian;
        this.requestedId = book;
    }
}
