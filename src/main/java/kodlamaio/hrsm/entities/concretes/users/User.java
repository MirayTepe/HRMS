package kodlamaio.hrsm.entities.concretes.users;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Data
@Entity
@Table(name="users")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private int id;
    @NotBlank
    @NotNull
    @Email
    @Column(name = "e_mail",unique = true)
    private String eMail;
    @NotBlank
    @NotNull
    @Column(name = "password",unique = true)
    private String password;
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
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    @NotBlank
    @NotNull
    @Pattern(regexp = "^[1-9]{1}[0-9]{9}[02468]{1}$")
    @Column(name ="tc_no",unique = true)
    private String tcNo;


}
