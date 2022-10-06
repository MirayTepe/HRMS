package kodlamaio.hrsm.entities.concretes.users;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name = "verifications")
@AllArgsConstructor
@NoArgsConstructor
public class Verification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;
    @Email
    @NotBlank
    @NotNull
    @Column(name = "verify_email")
    private String verifyEmail;

    @Column(name = "save",nullable = false,columnDefinition = "false")
    private boolean save;


}
