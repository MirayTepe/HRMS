package kodlamaio.hrsm.entities.concretes.jobs;

import com.sun.istack.NotNull;
import kodlamaio.hrsm.entities.concretes.users.Employer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name="jobs")

public class Job {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="job_id")
    private int jobId;

    @NotNull
    @Column(name="position_name")
    private String position;

    @Column(name="status")
    private boolean status;

    @NotNull
    @Column(name="job_description")
    private String jobDescriptions;

    @Column(name="min_salary")
    private double minSalary;

    @Column(name="max_salary")
    private double maxSalary;

    @Column(name="open_position_limit")
    private int openPositionLimit;


    @Column(name="create_date")
    private String createDate;

    @Column(name="application_deadline")
    private String applicationDeadline;


    @ManyToOne()
    @JoinColumn(name="user_id")
    private Employer employer;

    @ManyToOne()
    @JoinColumn(name="position_id")
    private JobPosition jobPosition;


    @OneToMany(mappedBy = "job")
    private List<City> cities;

    @ManyToMany(mappedBy = "job")
    private List<Employer> employers;


}
