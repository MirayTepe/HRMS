package kodlamaio.hrsm.entities.concretes.users;

import com.sun.istack.NotNull;
import kodlamaio.hrsm.entities.concretes.jobs.JobPosition;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@Entity
@Table(name = "employee")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn (name ="user_id" , referencedColumnName = "id")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="user_id")
    private int userId;

    @Column(name ="first_name")
    @NotBlank
    @NotNull
    private String firstName;
    @Column(name = "last_name")
    @NotBlank
    @NotNull
    private String lastName;
    @NotBlank
    @NotNull
    @Pattern(regexp = "^[1-9]{1}[0-9]{9}[02468]{1}$")
    @Column(name ="tc_no",unique = true)
    private String tcNo;
    @NotBlank
    @NotNull
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    @ManyToOne()
    @JoinColumn(name="position_id")
    private JobPosition jobPosition;



}
