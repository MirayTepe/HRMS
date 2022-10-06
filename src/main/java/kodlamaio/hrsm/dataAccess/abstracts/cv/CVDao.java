package kodlamaio.hrsm.dataAccess.abstracts.cv;

import kodlamaio.hrsm.entities.concretes.cv.*;
import kodlamaio.hrsm.entities.dtos.CVWithJobExperienceDto;
import kodlamaio.hrsm.entities.dtos.CVWithLanguageDto;
import kodlamaio.hrsm.entities.dtos.CVWithProgrammingLanguageDto;
import kodlamaio.hrsm.entities.dtos.CVWithSchoolDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CVDao extends JpaRepository<CV,Integer> {


    @Query("Select new kodlamaio.hrsm.entities.dtos.CVWithJobExperienceDto(c.id,c.employeeName,j.workplaceName, j.position, j.startingYear, j.endYear) From JobExperience j Inner Join j.cvs c")
    List<CVWithJobExperienceDto> getCvWithJobExperienceDetails();

    @Query("Select new kodlamaio.hrsm.entities.dtos.CVWithLanguageDto(c.id,c.employeeName,l.knownLanguages,l.languageLevel) From Language l Inner Join l.cvs c")
    List<CVWithLanguageDto> getCvWithLanguageDetails();

    @Query("Select new kodlamaio.hrsm.entities.dtos.CVWithProgrammingLanguageDto(c.id,c.employeeName,p.programmingLanguage) From ProgrammingLanguage p Inner Join p.cvs c")
    List<CVWithProgrammingLanguageDto> getCvProgrammingLanguageDetails();


    @Query("Select new kodlamaio.hrsm.entities.dtos.CVWithSchoolDto(c.id,c.employeeName,s.schoolName,s.startSchool,s.finishSchool) From School s Inner Join s.cvs c")
    List<CVWithSchoolDto> getCvWithSchoolDetails();




}
