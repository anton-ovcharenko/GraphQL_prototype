package oaa;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class Author {
    long id;
    String name;
}
