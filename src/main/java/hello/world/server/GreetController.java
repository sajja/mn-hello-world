package hello.world.server;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import hello.world.server.service.Book;
import hello.world.server.service.BookService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import jakarta.inject.Inject;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller("/books")
public class GreetController {
    @Inject
    private BookService bookService;

    @Get("/{author}")
    public String greet(@PathVariable String author) throws UnsupportedEncodingException, JsonProcessingException {
        System.out.println("Request received..." + author);
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        List<Book> filteredBooks = Arrays.stream(bookService.getBooks()).filter(book -> book.getAuthor().equals(author)).collect(Collectors.toList());
        return gson.toJson(filteredBooks);
    }
}
