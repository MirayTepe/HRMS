package kodlamaio.hrsm.entities.concretes.cv;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.exception.DataException;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "schools")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "school_id")
    private int schoolId;
    @Column(name = "schoolName")
    @NotBlank
    private String schoolName;

    @Column(name = "startSchool")
    @NotBlank
    private String startSchool;


    @Column(name = "finishSchool")
    private String finishSchool;

    @OneToMany(mappedBy = "schools")
    private List<CV> cvs;



}
