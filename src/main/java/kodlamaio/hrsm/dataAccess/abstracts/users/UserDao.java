package kodlamaio.hrsm.dataAccess.abstracts.users;

import kodlamaio.hrsm.entities.concretes.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
