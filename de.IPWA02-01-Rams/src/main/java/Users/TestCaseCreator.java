package Users;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("TCE")
public class TestCaseCreator extends User {
	
	// Constructors
    public TestCaseCreator() {}

    public TestCaseCreator(String firstName, String lastName, String username, String password) {
        super(firstName, lastName, password);
    }
}

