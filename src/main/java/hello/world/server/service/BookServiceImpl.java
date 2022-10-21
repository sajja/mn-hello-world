package hello.world.server.service;

import jakarta.inject.Singleton;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

@Singleton
public class BookServiceImpl implements BookService {
    private ArrayList<Book> allBooks = new ArrayList<>() {
        {
            add(new Book("1", "Frederick", "day of the jackal"));
            add(new Book("1", "Frederick", "dogs of war"));
            add(new Book("3", "Niel", "Line War"));
            add(new Book("4", "Niel", "Spatterjay"));
            add(new Book("5", "Niel", "Dark intelligence"));
            add(new Book("6", "Peter", "Void"));
            add(new Book("7", "JJ", "Feast of crows"));
            add(new Book("8", "JJ", "Winter is coming"));
            add(new Book("9", "Patrick", "Name of the wind"));
            add(new Book("10", "Patrick", "Doors of stone"));
            add(new Book("11", "Patrick", "Wise mans fears"));
            add(new Book("12", "Jack", "Curse of the black pearl"));
            add(new Book("13", "Brandon", "Way of the kings"));
            add(new Book("14", "Alistair", "Guns of naverone"));
            add(new Book("15", "Stephen", "Gunslinger"));
            add(new Book("16", "JJ", "abcd"));
            add(new Book("17", "Gotabaya", "Gota's war"));
            add(new Book("18", "Travis", "Awaken Online"));
            add(new Book("19", "Peter", "Promethius"));
            add(new Book("20", "Peter", "God of war"));
            add(new Book("21", "Ernest", "Ready player 1"));
        }
    };

    public Book[] getBooks() throws UnsupportedEncodingException {
        return allBooks.toArray(new Book[]{});
    }
}
