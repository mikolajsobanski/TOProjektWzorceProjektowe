public class RequestBooleanBookOperation implements BooleanBookOperation {
    private Library library;
    private Integer requestedId;

    @Override
    public Boolean execute() {
        return library.requestBook(requestedId);
    }

    RequestBooleanBookOperation(Library library, Integer book) {
        this.library = library;
        this.requestedId = book;
    }
}