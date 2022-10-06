package kodlamaio.hrsm.entities.concretes.cv;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "jobExperiences")
public class JobExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_experience_id")
    private int jobExperienceId;

    @NotNull
    @NotBlank
    @Column(name="workplace_name")
    private String workplaceName;

    @NotNull
    @NotBlank
    @Column(name="position")
    private String position;



    @NotNull
    @NotBlank
    @Column(name="starting_year")
    private String startingYear;




    @Column(name="end_year")
    private String endYear;

   @OneToMany(mappedBy = "jobExperiences")
    private List<CV> cvs;




}
