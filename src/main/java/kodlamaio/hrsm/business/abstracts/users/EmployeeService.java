package kodlamaio.hrsm.business.abstracts.users;

import kodlamaio.hrsm.core.utilities.results.DataResult;
import kodlamaio.hrsm.core.utilities.results.Result;
import kodlamaio.hrsm.entities.concretes.users.Employee;

import java.util.List;

public interface EmployeeService {
    DataResult<List<Employee>> getAll();
    Result add(Employee employee);
    DataResult<Employee> getByFirstName(String firstName);

    DataResult<Employee> getByFirstNameAndJobPosition_PositionId(String firstName, int positionId);

    DataResult<List<Employee>> getByFirstNameOrJobPosition_PositionId(String firstName , int positionId);

    DataResult<List<Employee>> getByJobPositionIn(List<Integer> job_positions);

    DataResult<List<Employee>> getByFirstNameContains(String firstName);

    DataResult<List<Employee>>getByFirstNameStartsWith(String  firstName);
}
