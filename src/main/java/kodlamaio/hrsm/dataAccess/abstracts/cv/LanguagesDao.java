package kodlamaio.hrsm.dataAccess.abstracts.cv;

import kodlamaio.hrsm.entities.concretes.cv.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguagesDao extends JpaRepository<Language,Integer> {
}
