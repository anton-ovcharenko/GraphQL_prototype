package oaa;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class Book {
    long id;
    String title;
    long authorId;
}
