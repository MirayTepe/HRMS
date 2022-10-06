package kodlamaio.hrsm.business.concretes.users;

import kodlamaio.hrsm.business.abstracts.users.UserService;
import kodlamaio.hrsm.core.utilities.results.DataResult;
import kodlamaio.hrsm.core.utilities.results.Result;
import kodlamaio.hrsm.core.utilities.results.SuccessDataResult;
import kodlamaio.hrsm.core.utilities.results.SuccessResult;
import kodlamaio.hrsm.dataAccess.abstracts.users.UserDao;
import kodlamaio.hrsm.entities.concretes.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserManager implements UserService {
    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        super();
        this.userDao = userDao;
    }
    @Override
    public DataResult<List<User>> getAll() {
        return new SuccessDataResult<List<User>>(this.userDao.findAll(),"Data Listelendi.");
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("Kullanıcı eklendi.");
    }
}
