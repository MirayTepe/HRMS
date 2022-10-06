package kodlamaio.hrsm.dataAccess.abstracts.users;

import kodlamaio.hrsm.entities.concretes.users.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {
    Employee getByFirstName(String firstName);

    Employee getByFirstNameAndJobPosition_PositionId(String firstName, int positionId);

    List<Employee> getByFirstNameOrJobPosition_PositionId(String firstName , int positionId);

    List<Employee> getByJobPositionIn(List<Integer> job_positions);

    List<Employee> getByFirstNameContains(String firstName);

    List<Employee> getByFirstNameStartsWith(String  firstName);

    @Query("From Employee where firstName=:firstName and jobPosition.positionId=:positionId")
    List<Employee> getByNameAndJobPosition(String  firstName, int positionId);
}
