package kg.charginov.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Client extends User {

    int money;

    public Client(String fullName, int age, int money) {
        super(fullName, age);
        this.money = money;
    }
}
