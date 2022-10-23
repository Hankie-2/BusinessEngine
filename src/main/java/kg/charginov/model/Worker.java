package kg.charginov.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class Worker extends User  {

    int salary;


    public Worker(String fullName, int age, int salary) {
        super(fullName, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.getFullName();
    }
}
