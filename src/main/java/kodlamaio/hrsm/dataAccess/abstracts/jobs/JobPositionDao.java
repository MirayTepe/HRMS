package kodlamaio.hrsm.dataAccess.abstracts.jobs;
import kodlamaio.hrsm.entities.concretes.jobs.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer> {


}
