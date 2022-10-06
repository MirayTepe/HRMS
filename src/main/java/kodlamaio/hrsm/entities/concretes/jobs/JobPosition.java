package kodlamaio.hrsm.entities.concretes.jobs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kodlamaio.hrsm.entities.concretes.users.Employee;
import kodlamaio.hrsm.entities.concretes.users.Employer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "job_positions")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobs"})
public class JobPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "position_id")
    private int positionId;
    @Column(name = "position_name",unique = true,nullable = false)
    private String position;

    @ManyToOne()
    @JoinColumn(name="cities")
    private City city;


    @OneToMany(mappedBy = "jobPosition")
     List<Job> job;

    @OneToMany(mappedBy = "jobPosition")
    List<Employee> employee;
    @OneToMany(mappedBy = "jobPosition")
    List<Employer> employer;



}
