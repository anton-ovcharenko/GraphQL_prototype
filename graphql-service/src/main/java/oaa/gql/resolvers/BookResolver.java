package oaa.gql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import lombok.AllArgsConstructor;
import oaa.gql.Author;
import oaa.gql.Book;
import org.springframework.web.client.RestTemplate;

@AllArgsConstructor
public class BookResolver implements GraphQLResolver<Book> {

    private final RestTemplate restTemplate;

    public Author getAuthor(Book book) {
        return restTemplate.getForObject("http://localhost:8082/author/{id}", Author.class, book.getAuthorId());
    }
}
