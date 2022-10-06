package kodlamaio.hrsm.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CVWithSchoolDto {
    private int id;
    private String employeeName;
    private String schoolName;
    private String startSchool;
    private String finishSchool;
}
