package hello.world.server.service;

import jakarta.inject.Singleton;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Random;

@Singleton
public class BookServiceImpl implements BookService {
        public Book[] getBooks() throws UnsupportedEncodingException {
        ArrayList<Book> books = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Book book = new Book();
            book.setAuthor("Author " + i);
            byte b[] = new byte[10];
            new Random().nextBytes(b);
            book.setTitle(new String(b, "utf-8"));
            books.add(book);
        }

        return books.toArray(new Book[]{});
    }
}
