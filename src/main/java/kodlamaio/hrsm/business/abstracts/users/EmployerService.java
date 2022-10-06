package kodlamaio.hrsm.business.abstracts.users;

import kodlamaio.hrsm.core.utilities.results.DataResult;
import kodlamaio.hrsm.core.utilities.results.Result;
import kodlamaio.hrsm.entities.concretes.users.Employer;

import java.util.List;

public interface EmployerService {
    DataResult<List<Employer>> getAll();

    Result add(Employer employer);
    DataResult<Employer> getByCompanyName(String companyName);

    DataResult<Employer> getByCompanyNameAndJobPosition_PositionId(String companyName, int positionId);

    DataResult<List<Employer>> getByCompanyNameOrJobPosition_PositionId(String companyName , int positionId);

    DataResult<List<Employer>> getByJobPositionIn(List<Integer> job_positions);

    DataResult<List<Employer>> getByCompanyNameContains(String companyName);

    DataResult<List<Employer>>getByCompanyNameStartsWith(String  companyName);



}
