package oaa;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class AuthorsController {
    private Map<Long, Author> authorsMap = new HashMap() {{
        put(1L, new Author(1, "Kafka"));
        put(2L, new Author(2, "Tolstoy"));
    }};

    @GetMapping(path = "/author/{id}")
    public Author getAuthorById(@PathVariable(name = "id") long id) {
        log.info("Get author by id: {}", id);
        return authorsMap.get(id);
    }
}
