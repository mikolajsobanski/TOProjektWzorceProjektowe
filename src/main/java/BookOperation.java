public interface BookOperation {
    void requestBook(Integer id);
    void returnBook(Book book);
    void showBooks();
}
