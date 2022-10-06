package kodlamaio.hrsm.dataAccess.abstracts.cv;

import kodlamaio.hrsm.entities.concretes.cv.JobExperience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface JobExperienceDao extends JpaRepository<JobExperience,Integer> {
   List<JobExperience> getByJobExperienceIdAndWorkplaceName(int jobExperienceId,String workplaceName);
   List<JobExperience> getByJobExperienceIdAndPosition(int jobExperienceId,String position);
   List<JobExperience> getByJobExperienceIdAndStartingYear(int jobExperienceId, Date startingYear);
   List<JobExperience> getByJobExperienceIdAndEndYear(int jobExperienceId, String endYear);

}
