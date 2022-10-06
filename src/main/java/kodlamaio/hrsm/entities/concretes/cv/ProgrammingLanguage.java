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
@Table(name = "programmingLanguage")
public class ProgrammingLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "programming_language_id")
    private int programmingLanguageId;
    @NotNull
    @NotBlank
    @Column(name="programmingLanguage")
    private String programmingLanguage;

    @OneToMany(mappedBy = "programmingLanguages")
    private List<CV> cvs;

}
