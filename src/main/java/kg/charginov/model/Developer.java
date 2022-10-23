package kg.charginov.model;

import kg.charginov.markers.AccessToDatabase;
import lombok.*;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Developer extends Worker implements AccessToDatabase {
    public Developer(String fullName, int age, int salary) {
        super(fullName, age, salary);
    }
    @Override
    public String toString() {
        return this.getFullName();
    }
}
