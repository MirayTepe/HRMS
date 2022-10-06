package kodlamaio.hrsm.business.concretes.users;

import kodlamaio.hrsm.business.abstracts.users.EmployerService;
import kodlamaio.hrsm.core.utilities.results.DataResult;
import kodlamaio.hrsm.core.utilities.results.Result;
import kodlamaio.hrsm.core.utilities.results.SuccessDataResult;
import kodlamaio.hrsm.core.utilities.results.SuccessResult;
import kodlamaio.hrsm.dataAccess.abstracts.users.EmployerDao;
import kodlamaio.hrsm.entities.concretes.users.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployerManager implements EmployerService {
    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        super();
        this.employerDao = employerDao;
    }

    @Override
    public DataResult<List<Employer>> getAll() {

        return  new SuccessDataResult<List<Employer>>( this.employerDao.findAll(),"Data Listelendi.");
    }



    @Override
    public Result add(Employer employer) {
        this.employerDao.save(employer);
        return new SuccessResult("Kullanıcı(İşveren) eklendi.");
    }

    @Override
    public DataResult<Employer> getByCompanyName(String companyName) {
        return  new SuccessDataResult<Employer>( this.employerDao.getByCompanyName(companyName),"Data Listelendi.");

    }

    @Override
    public DataResult<Employer> getByCompanyNameAndJobPosition_PositionId(String companyName, int positionId) {
        return  new SuccessDataResult<Employer>( this.employerDao.getByCompanyNameAndJobPosition_PositionId(companyName,positionId),"Data Listelendi.");

    }

    @Override
    public DataResult<List<Employer>> getByCompanyNameOrJobPosition_PositionId(String companyName, int positionId) {
        return  new SuccessDataResult<List<Employer>>( this.employerDao.getByCompanyNameOrJobPosition_PositionId(companyName,positionId),"Data Listelendi.");
    }

    @Override
    public DataResult<List<Employer>> getByJobPositionIn(List<Integer> job_positions) {
        return  new SuccessDataResult<List<Employer>>( this.employerDao.getByJobPositionIn(job_positions),"Data Listelendi.");
    }

    @Override
    public DataResult<List<Employer>> getByCompanyNameContains(String companyName) {
        return  new SuccessDataResult<List<Employer>>( this.employerDao.getByCompanyNameContains(companyName),"Data Listelendi.");
    }

    @Override
    public DataResult<List<Employer>> getByCompanyNameStartsWith(String companyName) {
        return  new SuccessDataResult<List<Employer>>( this.employerDao.getByCompanyNameStartsWith(companyName),"Data Listelendi.");
    }


}
