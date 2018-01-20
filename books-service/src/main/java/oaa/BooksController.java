package oaa;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class BooksController {
    private Map<Long, Book> booksMap = new HashMap() {{
        put(1L, new Book(1, "The Metamorphosis", 1));
        put(2L, new Book(2, "The Castle", 1));
        put(3L, new Book(3, "War and Peace ", 2));
    }};

    @GetMapping(path = "/book/{id}")
    public Book getBookById(@PathVariable(name = "id") long id) {
        log.info("Get book by id: {}", id);
        return booksMap.get(id);
    }
}
