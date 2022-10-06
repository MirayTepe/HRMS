package kodlamaio.hrsm.business.abstracts.jobs;

import kodlamaio.hrsm.core.utilities.results.DataResult;
import kodlamaio.hrsm.core.utilities.results.Result;
import kodlamaio.hrsm.entities.concretes.jobs.Job;

import java.util.Date;
import java.util.List;

public interface JobService {
    DataResult<List<Job>>  getAll();

    DataResult<List<Job>>  getAllSorted();
    Result add(Job job);

    DataResult<List<Job>> getByMaxSalaryAndMinSalary(double maxSalary, double minSalary);
    DataResult<List<Job>> getByJobIdAndApplicationDeadline(int jobId, Date applicationDeadline);
    DataResult<List<Job>> getByJobIdAndJobDescriptions(String jobId, String jobDescriptions);
    DataResult<List<Job>> getByJobIdAndStatus(String jobId, boolean status);
    DataResult<List<Job>> getByJobIdAndOpenPositionLimit(String jobId, int openPositionLimit);
}
