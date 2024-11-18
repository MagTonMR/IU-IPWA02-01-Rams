package ProjectAssets;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "test_cases")
public class TestCase {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String creator;

    @Column(nullable = true)
    private String condition;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "test_case_id")
    private List<TestStep> steps;

    //Constructors
    public TestCase() {
        this.steps = new ArrayList<>();
    }

    public TestCase(String description, String creator, String condition) {
        this.description = description;
        this.creator = creator;
        this.condition = condition;
        this.steps = new ArrayList<>();
    }
    
    //Getter and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public List<TestStep> getSteps() {
        return steps;
    }
    
    //Methods
    public void addStep(TestStep step) {
        this.steps.add(step);
    }
}
