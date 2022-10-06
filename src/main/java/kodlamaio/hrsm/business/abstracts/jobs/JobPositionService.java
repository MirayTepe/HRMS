package kodlamaio.hrsm.business.abstracts.jobs;


import kodlamaio.hrsm.core.utilities.results.DataResult;
import kodlamaio.hrsm.core.utilities.results.Result;
import kodlamaio.hrsm.entities.concretes.jobs.JobPosition;


import java.util.List;

public interface JobPositionService {
   DataResult<List<JobPosition>>  getAll();
   Result add(JobPosition jobPosition);

}
