package kg.charginov.model;

import kg.charginov.markers.AccessToMoney;
import lombok.*;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Accounting extends Worker implements AccessToMoney {
    public Accounting(String fullName, int age, int salary) {
        super(fullName, age, salary);
    }

    @Override
    public String toString() {
        return this.getFullName();
    }
}
