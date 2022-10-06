package kodlamaio.hrsm.entities.concretes.cv;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cvs")
public class CV {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotBlank
    @Column(name="employee_name")
    private String employeeName;


    @NotBlank
    @Column(name="githubAddress")
    private String githubAddress;



    @NotBlank
    @Column(name="linkedinAddress")
    private String linkedinAddress;


    @NotBlank
    @Column(name="explanation")
    private String explanation;
    @ManyToOne ()
    @JoinColumn(name="job_experience_id")
    private JobExperience jobExperiences;
    @ManyToOne()
    @JoinColumn(name="language_id")
    private Language languages;

    @ManyToOne
    @JoinColumn(name="programming_language_id")
    private ProgrammingLanguage programmingLanguages;
    @ManyToOne
    @JoinColumn(name="school_id")
    private School schools;






}
