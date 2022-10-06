package kodlamaio.hrsm.dataAccess.abstracts.users;

import kodlamaio.hrsm.entities.concretes.users.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface EmployerDao extends JpaRepository<Employer,Integer> {

    Employer getByCompanyName(String companyName);

    Employer getByCompanyNameAndJobPosition_PositionId(String companyName, int positionId);

    List<Employer> getByCompanyNameOrJobPosition_PositionId(String companyName , int positionId);

    List<Employer> getByJobPositionIn(List<Integer> job_positions);


    List<Employer> getByCompanyNameContains(String companyName);

    List<Employer> getByCompanyNameStartsWith(String  companyName);

   List<Employer>getByCompanyNameAndJob_ApplicationDeadline(String companyName, Date applicationDeadline);



    @Query("From Employer where companyName=:companyName and jobPosition.positionId=:positionId ")
    List<Employer> getByNameAndJobPosition(String  companyName, int positionId);







}
