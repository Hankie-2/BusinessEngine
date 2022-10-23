package kg.charginov.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class User {

    String fullName;

    int age;

    @Override
    public String toString() {
        return this.getFullName();
    }
}
