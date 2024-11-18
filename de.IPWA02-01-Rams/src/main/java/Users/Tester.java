package Users;

import jakarta.persistence.*;


@Entity
@DiscriminatorValue("TST")
public class Tester extends User {

	// Constructors
    public Tester() {}

    public Tester(String firstName, String lastName, String password) {
        super(firstName, lastName, password);
    }
}
