package kodlamaio.hrsm.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class CVWithLanguageDto {
    private int id;
    private String employeeName;
    private String knownLanguages;
    private int languageLevel;
}
