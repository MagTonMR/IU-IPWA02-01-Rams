package Users;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("RE")
public class RequirementsEngineer extends User {
	// Constructors
    public RequirementsEngineer() {}

    public RequirementsEngineer(String firstName, String lastName, String password) {
        super(firstName, lastName, password);
    }
}
