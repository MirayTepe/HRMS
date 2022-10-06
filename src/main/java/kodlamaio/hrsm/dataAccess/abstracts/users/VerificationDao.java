package kodlamaio.hrsm.dataAccess.abstracts.users;

import kodlamaio.hrsm.entities.concretes.users.Verification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationDao extends JpaRepository<Verification,Integer> {
}
