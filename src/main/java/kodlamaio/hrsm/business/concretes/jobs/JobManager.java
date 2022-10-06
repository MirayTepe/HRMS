package kodlamaio.hrsm.business.concretes.jobs;

import kodlamaio.hrsm.business.abstracts.jobs.JobService;
import kodlamaio.hrsm.core.utilities.results.DataResult;
import kodlamaio.hrsm.core.utilities.results.Result;
import kodlamaio.hrsm.core.utilities.results.SuccessDataResult;
import kodlamaio.hrsm.core.utilities.results.SuccessResult;
import kodlamaio.hrsm.dataAccess.abstracts.jobs.JobDao;
import kodlamaio.hrsm.entities.concretes.jobs.Job;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class JobManager implements JobService {
    private JobDao jobDao;

    public JobManager(JobDao jobDao) {
        this.jobDao = jobDao;
    }

    @Override
    public DataResult<List<Job>> getAll() {
        return new SuccessDataResult<List<Job>>( this.jobDao.findAll(),"Data Listelendi.");
    }

    @Override
    public DataResult<List<Job>> getAllSorted() {
        Sort sort=Sort.by(Sort.Direction.DESC,"createDate");
        return new SuccessDataResult<List<Job>>
                (this.jobDao.findAll(sort),"Başarılı");
    }

    @Override
    public Result add(Job job) {
        this.jobDao.save(job);
        return new SuccessResult("İş pozisyonu eklendi.");
    }

    @Override
    public DataResult<List<Job>> getByMaxSalaryAndMinSalary(double maxSalary, double minSalary) {
        return new SuccessDataResult<List<Job>>(this.jobDao.getByMaxSalaryAndMinSalary(maxSalary,minSalary)) ;
    }

    @Override
    public DataResult<List<Job>> getByJobIdAndApplicationDeadline(int jobId, Date applicationDeadline) {
        return new SuccessDataResult<List<Job>>(this.jobDao.getByJobIdAndApplicationDeadline(jobId,applicationDeadline));
    }

    @Override
    public DataResult<List<Job>> getByJobIdAndJobDescriptions(String jobId, String jobDescriptions) {
        return new SuccessDataResult<List<Job>>(this.jobDao.getByJobIdAndJobDescriptions(jobId,jobDescriptions));
    }

    @Override
    public DataResult<List<Job>> getByJobIdAndStatus(String jobId, boolean status) {
        return new SuccessDataResult<List<Job>>(this.jobDao.getByJobIdAndStatus(jobId,status));
    }

    @Override
    public DataResult<List<Job>> getByJobIdAndOpenPositionLimit(String jobId, int openPositionLimit) {
        return new SuccessDataResult<List<Job>>(this.jobDao.getByJobIdAndOpenPositionLimit(jobId,openPositionLimit));
    }
}
