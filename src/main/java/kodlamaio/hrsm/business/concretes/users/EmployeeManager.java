package kodlamaio.hrsm.business.concretes.users;

import kodlamaio.hrsm.business.abstracts.users.EmployeeService;
import kodlamaio.hrsm.core.utilities.results.DataResult;
import kodlamaio.hrsm.core.utilities.results.Result;
import kodlamaio.hrsm.core.utilities.results.SuccessDataResult;
import kodlamaio.hrsm.core.utilities.results.SuccessResult;
import kodlamaio.hrsm.dataAccess.abstracts.users.EmployeeDao;
import kodlamaio.hrsm.entities.concretes.users.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeManager implements EmployeeService {
    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeManager(EmployeeDao employeeDao) {
        super();
        this.employeeDao = employeeDao;
    }

    @Override
    public DataResult<List<Employee>> getAll() {

        return new SuccessDataResult<List<Employee>>( this.employeeDao.findAll(),"Data Listelendi.");
    }

    @Override
    public Result add(Employee employee) {
        this.employeeDao.save(employee);
        return new SuccessResult("Kullanıcı(Çalışan) eklendi.");
    }

    @Override
    public DataResult<Employee> getByFirstName(String firstName) {
        return new SuccessDataResult<Employee>( this.employeeDao.getByFirstName(firstName),"Data Listelendi.");
    }

    @Override
    public DataResult<Employee> getByFirstNameAndJobPosition_PositionId(String firstName, int positionId) {
        return new SuccessDataResult<Employee>( this.employeeDao.getByFirstNameAndJobPosition_PositionId(firstName,positionId),"Data Listelendi.");
    }

    @Override
    public DataResult<List<Employee>> getByFirstNameOrJobPosition_PositionId(String firstName, int positionId) {
        return new SuccessDataResult<List<Employee>>( this.employeeDao.getByFirstNameOrJobPosition_PositionId(firstName,positionId),"Data Listelendi.");
    }

    @Override
    public DataResult<List<Employee>> getByJobPositionIn(List<Integer> job_positions) {
        return new SuccessDataResult<List<Employee>>( this.employeeDao.getByJobPositionIn(job_positions),"Data Listelendi.");
    }

    @Override
    public DataResult<List<Employee>> getByFirstNameContains(String firstName) {
        return new SuccessDataResult<List<Employee>>( this.employeeDao.getByFirstNameContains(firstName),"Data Listelendi.");
    }

    @Override
    public DataResult<List<Employee>> getByFirstNameStartsWith(String firstName) {
        return new SuccessDataResult<List<Employee>>( this.employeeDao.getByFirstNameStartsWith(firstName),"Data Listelendi.");
    }
}
