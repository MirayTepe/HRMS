package kodlamaio.hrsm.business.concretes.cv;

import kodlamaio.hrsm.business.abstracts.cv.LanguageService;
import kodlamaio.hrsm.core.utilities.results.Result;
import kodlamaio.hrsm.core.utilities.results.SuccessResult;
import kodlamaio.hrsm.dataAccess.abstracts.cv.LanguagesDao;
import kodlamaio.hrsm.entities.concretes.cv.Language;
import org.springframework.stereotype.Service;

@Service
public class LanguageManager implements LanguageService {

    private LanguagesDao languagesDao;

    public LanguageManager(LanguagesDao languagesDao) {
        this.languagesDao = languagesDao;
    }

    @Override
    public Result add (Language language){
        this.languagesDao.save(language);
        return new SuccessResult("Bilinen diller eklendi.");
    }
}
