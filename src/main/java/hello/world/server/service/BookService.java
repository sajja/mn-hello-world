package hello.world.server.service;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Random;

public interface BookService {

    public Book[] getBooks() throws UnsupportedEncodingException;
}
