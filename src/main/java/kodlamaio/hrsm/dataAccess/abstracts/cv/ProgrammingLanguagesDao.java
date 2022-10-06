package kodlamaio.hrsm.dataAccess.abstracts.cv;

import kodlamaio.hrsm.entities.concretes.cv.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgrammingLanguagesDao extends JpaRepository<ProgrammingLanguage,Integer> {
}
