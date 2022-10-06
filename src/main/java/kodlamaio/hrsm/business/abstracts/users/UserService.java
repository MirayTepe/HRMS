package kodlamaio.hrsm.business.abstracts.users;

import kodlamaio.hrsm.core.utilities.results.DataResult;
import kodlamaio.hrsm.core.utilities.results.Result;
import kodlamaio.hrsm.entities.concretes.users.User;

import java.util.List;

public interface UserService {
    DataResult<List<User>>getAll();
    Result add(User user);
}
