package kodlamaio.hrsm.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployerWithJobDto {
    private int jobId;
    private String companyName;
    private String position;
    private int openPositionLimit;
    private String createDate;
    private String applicationDeadline;

}
