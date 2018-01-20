package oaa.gql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import oaa.gql.Author;
import oaa.gql.Book;
import org.springframework.web.client.RestTemplate;

@AllArgsConstructor
public class Query implements GraphQLQueryResolver {

    private final RestTemplate restTemplate;

    public Book getBookById(long id) {
        return restTemplate.getForObject("http://localhost:8081/book/{id}", Book.class, id);
    }

    public Author getAuthorById(long id) {
        return restTemplate.getForObject("http://localhost:8082/author/{id}", Author.class, id);
    }
}
