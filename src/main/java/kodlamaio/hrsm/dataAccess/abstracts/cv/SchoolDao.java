package kodlamaio.hrsm.dataAccess.abstracts.cv;

import kodlamaio.hrsm.entities.concretes.cv.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolDao extends JpaRepository<School,Integer> {

}
