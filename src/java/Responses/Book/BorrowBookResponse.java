package Responses.Book;

import Responses.LibraryResponse;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Borrows a book for a visitor; uses the ID of a specific book or books returned in the most recent library book
 * search.
 *
 * @author Henry Larson
 */
public class BorrowBookResponse extends LibraryResponse {
    private String dueDate;

    public BorrowBookResponse(String dueDate) {
        this.dueDate = dueDate;
    }

    public String toString() {
        return String.format("borrow,%s", dueDate);
    }
}
