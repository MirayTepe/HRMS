package kodlamaio.hrsm.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CVWithJobExperienceDto {
   private int id;
   private String employeeName;
   private String workplaceName;
   private String position;
   private String startingYear;
   private String endYear;

}
