package kodlamaio.hrsm.entities.concretes.cv;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "language")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id")
    private int languageId;


    @NotNull
    @NotBlank
    @Column(name="knownLanguages")
    private String knownLanguages;


    @NotNull
    @Column(name=" languageLevel")
    @Min(1)
    @Max(5)
    private int languageLevel;

    @OneToMany(mappedBy = "languages")
    private List<CV> cvs;

}
