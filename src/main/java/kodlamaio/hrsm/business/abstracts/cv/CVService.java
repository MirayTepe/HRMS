package kodlamaio.hrsm.business.abstracts.cv;

import kodlamaio.hrsm.core.utilities.results.DataResult;
import kodlamaio.hrsm.core.utilities.results.Result;
import kodlamaio.hrsm.entities.concretes.cv.*;
import kodlamaio.hrsm.entities.dtos.CVWithJobExperienceDto;
import kodlamaio.hrsm.entities.dtos.CVWithLanguageDto;
import kodlamaio.hrsm.entities.dtos.CVWithProgrammingLanguageDto;
import kodlamaio.hrsm.entities.dtos.CVWithSchoolDto;

import java.util.List;

public interface CVService extends CloudinaryService {
   DataResult<List<CVWithJobExperienceDto>> getCvWithJobExperienceDetails();

   DataResult<List<CVWithLanguageDto>>getCvWithLanguageDetails();

   DataResult<List<CVWithProgrammingLanguageDto>> getCvProgrammingLanguageDetails();

   DataResult<List<CVWithSchoolDto>> getCvWithSchoolDetails();
    Result add(CV cv);












}
