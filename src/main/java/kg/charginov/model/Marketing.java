package kg.charginov.model;

import kg.charginov.markers.AccessToSocialMedia;
import lombok.*;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Marketing extends Worker implements AccessToSocialMedia {
    public Marketing(String fullName, int age, int salary) {
        super(fullName, age, salary);
    }
    @Override
    public String toString() {
        return this.getFullName();
    }
}
