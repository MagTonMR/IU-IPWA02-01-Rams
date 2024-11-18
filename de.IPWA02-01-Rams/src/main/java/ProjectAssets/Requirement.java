package ProjectAssets;


import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "requirements")
public class Requirement {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String creator;

    @Column(nullable = true)
    private String condition;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "requirement_id")
    private List<TestRun> testRuns;

    //Constructors
    public Requirement() {
        this.testRuns = new ArrayList<>();
    }

    public Requirement(String title, String description, String creator, String condition) {
        this.title = title;
        this.description = description;
        this.creator = creator;
        this.condition = condition;
        this.testRuns = new ArrayList<>();
    }

    //Getter and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public List<TestRun> getTestRuns() {
        return testRuns;
    }

    public void addTestRun(TestRun testRun) {
        this.testRuns.add(testRun);
    }
}
