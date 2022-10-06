package kodlamaio.hrsm.business.abstracts.cv;


import kodlamaio.hrsm.core.utilities.results.DataResult;
import kodlamaio.hrsm.core.utilities.results.Result;
import kodlamaio.hrsm.entities.concretes.cv.JobExperience;

import java.util.Date;
import java.util.List;

public interface JobExperienceService {
    DataResult<List<JobExperience>>  getAll();

    DataResult<List<JobExperience>>  getAllSorted();

    DataResult<List<JobExperience>>  getAll(int pageNo ,int pageSize);
    Result add(JobExperience jobExperience);
    DataResult<List<JobExperience>> getByJobExperienceIdAndWorkplaceName(int jobExperienceId,String workplaceName);
    DataResult<List<JobExperience>> getByJobExperienceIdAndPosition(int jobExperienceId,String position);
    DataResult<List<JobExperience>> getByJobExperienceIdAndStartingYear(int jobExperienceId, Date startingYear);
    DataResult<List<JobExperience>> getByJobExperienceIdAndEndYear(int jobExperienceId, String endYear);



}
