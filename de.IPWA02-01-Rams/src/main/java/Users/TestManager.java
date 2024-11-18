package Users;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue ("TM")
public class TestManager extends User {

	 // Constructors
    public TestManager() {}

    public TestManager(String firstName, String lastName, String password) {
        super(firstName, lastName, password);
    }
	
}
