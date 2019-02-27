package java.Responses.Book;

import java.Model.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * Purchases one or more books returned from the last book store search. Purchased books are added to the library's
 * collection. If the books already exist in the collection, the available quantity of each book is updated to reflect
 * the newly purchased books. For the purpose of this simulation it should be assumed that infinite quantities of each
 * book are available for purchase.
 *
 * @author Henry Larson
 */
public class BookPurchaseResponse {
    private boolean success;
    private List<Book> books;

    public BookPurchaseResponse(boolean success, List<Book> books) {
        this.success = success;
        this.books = success ? books : new ArrayList<>();
    }

    public boolean isSuccess() {
        return success;
    }

    @SuppressWarnings("Duplicates")
    public String getBooks() {
        StringBuilder bookList = new StringBuilder();
        for (Book book : books) {
            // ISBN, Title, Authors, Publish-Date, Quantity
            bookList.append(book.getIsbn()).append(",")
                    .append(book.getTitle()).append(",")
                    .append(book.getAuthorsAsString()).append(",")
                    .append(book.getDatePublished()).append(",")
                    .append(books.size()).append("\n");
        }

        return bookList.toString();
    }

    // TODO - create response format
    public String toString() {
        return "";
    }
}
