package ProjectAssets;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "projects")
public class Project {
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
    @JoinColumn(name = "project_id")
    private List<Requirement> requirements;

    //Constructors
    public Project() {
        this.requirements = new ArrayList<>();
    }

    public Project(String name, String creator, String condition) {
        this.name = name;
        this.creator = creator;
        this.condition = condition;
        this.requirements = new ArrayList<>();
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

    public List<Requirement> getRequirements() {
        return requirements;
    }

    public void addRequirement(Requirement requirement) {
        this.requirements.add(requirement);
    }
}