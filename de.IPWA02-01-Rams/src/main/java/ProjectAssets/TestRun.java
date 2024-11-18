package ProjectAssets;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "test_runs")
public class TestRun {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String creator;

    @Column(nullable = true)
    private String condition;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "test_run_id")
    private List<TestCase> testCases;
    
    // Constructors
    public TestRun() {
        this.testCases = new ArrayList<>();
    }

    public TestRun(String name, String creator, String condition) {
        this.name = name;
        this.creator = creator;
        this.condition = condition;
        this.testCases = new ArrayList<>();
    }
    
    //Getter and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<TestCase> getTestCases() {
        return testCases;
    }
    
    //Methods
    public void addTestCase(TestCase testCase) {
        this.testCases.add(testCase);
    }
}
