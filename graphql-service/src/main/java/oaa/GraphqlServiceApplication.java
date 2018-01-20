package oaa;

import oaa.gql.resolvers.BookResolver;
import oaa.gql.resolvers.Query;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GraphqlServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlServiceApplication.class, args);
    }

    @Bean
    public BookResolver bookResolver() {
        return new BookResolver(new RestTemplate());
    }

    @Bean
    public Query query() {
        return new Query(new RestTemplate());
    }
}
