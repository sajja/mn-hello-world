package hello.world.server;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
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
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(bookService.getBooks());
        return json;
    }
}
