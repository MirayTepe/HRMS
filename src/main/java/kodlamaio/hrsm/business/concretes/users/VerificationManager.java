package kodlamaio.hrsm.business.concretes.users;

import kodlamaio.hrsm.business.abstracts.users.VerificationService;
import kodlamaio.hrsm.core.utilities.results.DataResult;
import kodlamaio.hrsm.core.utilities.results.SuccessDataResult;
import kodlamaio.hrsm.dataAccess.abstracts.users.VerificationDao;
import kodlamaio.hrsm.entities.concretes.users.Verification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VerificationManager implements VerificationService {
    private VerificationDao verificationDao;

    @Autowired
    public VerificationManager(VerificationDao verificationDao) {
        super();
        this.verificationDao = verificationDao;
    }


    @Override
    public DataResult<List<Verification> > getAll() {

        return new SuccessDataResult<List<Verification>>( this.verificationDao.findAll(),"Data Listelendi.");
    }
}
