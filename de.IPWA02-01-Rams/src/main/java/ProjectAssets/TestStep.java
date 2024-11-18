package ProjectAssets;

import jakarta.persistence.*;


@Entity
@Table(name = "test_steps")
public class TestStep {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String action;

    @Column(nullable = false)
    private String result;

    @Column(nullable = false)
    private String creator;

    //Constructors
    public TestStep() {
    }

    public TestStep(String action, String result, String creator) {
        this.action = action;
        this.result = result;
        this.creator = creator;
    }
    
    //Getter and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
