package kodlamaio.hrsm.business.concretes.cv;

import kodlamaio.hrsm.business.abstracts.cv.JobExperienceService;
import kodlamaio.hrsm.core.utilities.results.DataResult;
import kodlamaio.hrsm.core.utilities.results.Result;
import kodlamaio.hrsm.core.utilities.results.SuccessDataResult;
import kodlamaio.hrsm.core.utilities.results.SuccessResult;
import kodlamaio.hrsm.dataAccess.abstracts.cv.JobExperienceDao;
import kodlamaio.hrsm.entities.concretes.cv.JobExperience;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class JobExperienceManager implements JobExperienceService {

    private JobExperienceDao jobExperienceDao;

    public JobExperienceManager(JobExperienceDao jobExperienceDao) {
        this.jobExperienceDao = jobExperienceDao;
    }


    @Override
    public DataResult<List<JobExperience>> getAll() {
        return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.findAll(),"Data listelendi.");
    }

    @Override
    public DataResult<List<JobExperience>> getAllSorted() {
        Sort sort=Sort.by(Sort.Direction.ASC,"startingYear");
        return new SuccessDataResult<List<JobExperience>>
                (this.jobExperienceDao.findAll(sort),"Başarılı");
    }

    @Override
    public DataResult<List<JobExperience>> getAll(int pageNo, int pageSize) {
        Pageable pageable= PageRequest.of(pageNo,pageSize);
        return new SuccessDataResult<List<JobExperience>>
                (this.jobExperienceDao.findAll(pageable).getContent());
    }

    @Override
    public Result add(JobExperience jobExperience) {
        if(jobExperience.getEndYear()==null){
           jobExperience.setEndYear("Devam Ediyor.");
        }

        this.jobExperienceDao.save(jobExperience);
        return new SuccessResult("İş tecrübesi eklendi.");
    }

    @Override
    public DataResult<List<JobExperience>> getByJobExperienceIdAndWorkplaceName(int jobExperienceId, String workplaceName) {
        return new  SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.getByJobExperienceIdAndWorkplaceName(jobExperienceId,workplaceName));
    }

    @Override
    public DataResult<List<JobExperience>> getByJobExperienceIdAndPosition(int jobExperienceId, String position) {
        return new  SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.getByJobExperienceIdAndPosition(jobExperienceId,position));
    }

    @Override
    public DataResult<List<JobExperience>> getByJobExperienceIdAndStartingYear(int jobExperienceId, Date startingYear) {
        return new  SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.getByJobExperienceIdAndStartingYear(jobExperienceId,startingYear));
    }

    @Override
    public DataResult<List<JobExperience>> getByJobExperienceIdAndEndYear(int jobExperienceId, String endYear) {
        return new  SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.getByJobExperienceIdAndEndYear(jobExperienceId,endYear));
    }
}
