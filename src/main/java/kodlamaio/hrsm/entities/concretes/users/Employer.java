package kodlamaio.hrsm.entities.concretes.users;
import com.sun.istack.NotNull;
import kodlamaio.hrsm.entities.concretes.jobs.Job;
import kodlamaio.hrsm.entities.concretes.jobs.JobPosition;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.List;

@Data
@Entity
@Table(name = "employers")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn (name ="user_id" , referencedColumnName = "id")
public class Employer  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;
    @NotBlank
    @NotNull
    @Column(name = "company_name")
    private String companyName;
    @NotBlank
    @NotNull
    @Pattern(regexp = "^([0-1]?\\d?\\d|2[0-4]\\d|25[0-5])(\\.([0-1]?\\d?\\d|2[0-4]\\d|25[0-5])){3}$")
    @Column(name = "website")
    private String website;
    @NotBlank
    @NotNull
    @Pattern(regexp = "/^(05)([0-9]{2})\\s?([0-9]{3})\\s?([0-9]{2})\\s?([0-9] {2})$/")
    @Column(name = "phone_number",nullable = false,unique = true)
    private String phoneNumber;

    @ManyToOne()
    @JoinColumn(name="position_id")
    private JobPosition jobPosition;

    @ManyToOne()
    @JoinColumn(name="job_id")
    private Job job;
    @ManyToMany(mappedBy = "employer")
    private List<Job> jobs;

}
