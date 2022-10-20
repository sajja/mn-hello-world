package hello.world.server;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import hello.world.server.service.BookService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

import java.io.UnsupportedEncodingException;

@Controller("/books")
public class GreetController {
    @Inject
    private BookService bookService;

    @Get("/")
    public String greet() throws UnsupportedEncodingException, JsonProcessingException {
        System.out.println("Request received...");
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        return gson.toJson(bookService.getBooks());
    }
}
