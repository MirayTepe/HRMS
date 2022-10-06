package kodlamaio.hrsm.dataAccess.abstracts.jobs;

import java.util.Date;
import java.util.List;

import kodlamaio.hrsm.entities.concretes.jobs.Job;
import kodlamaio.hrsm.entities.dtos.EmployerWithJobDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface JobDao extends JpaRepository<Job,Integer> {
    List<Job> getByMaxSalaryAndMinSalary(double maxSalary,double minSalary);
    List<Job> getByJobIdAndApplicationDeadline(int jobId, Date ApplicationDeadline);
    List<Job> getByJobIdAndJobDescriptions(String jobId, String jobDescriptions);
    List<Job> getByJobIdAndStatus(String jobId, boolean status);
    List<Job> getByJobIdAndOpenPositionLimit(String jobId, int openPositionLimit);
    @Query("From Job where position=:position and employer.userId=:userId")
    List<Job> getByPositionAndUser_Id(String position, int userId);

   @Query("Select new kodlamaio.hrsm.entities.dtos.EmployerWithJobDto" +
            "(j.jobId,e.companyName,j.position, j.openPositionLimit,j.createDate,j.applicationDeadline) " +
            "From Employer e Inner Join e.jobs j")
    List<EmployerWithJobDto> getEmployerWithJobDetails();
}
