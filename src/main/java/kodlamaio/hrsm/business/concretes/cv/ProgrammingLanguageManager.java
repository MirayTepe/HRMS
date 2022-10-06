package kodlamaio.hrsm.business.concretes.cv;

import kodlamaio.hrsm.business.abstracts.cv.ProgrammingLanguageService;
import kodlamaio.hrsm.core.utilities.results.Result;
import kodlamaio.hrsm.core.utilities.results.SuccessResult;
import kodlamaio.hrsm.dataAccess.abstracts.cv.ProgrammingLanguagesDao;
import kodlamaio.hrsm.entities.concretes.cv.ProgrammingLanguage;
import org.springframework.stereotype.Service;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguagesDao programmingLanguagesDao;

    public ProgrammingLanguageManager(ProgrammingLanguagesDao programmingLanguagesDao) {
        this.programmingLanguagesDao = programmingLanguagesDao;
    }

    @Override
    public Result add (ProgrammingLanguage programmingLanguage){
        this.programmingLanguagesDao.save(programmingLanguage);
        return new SuccessResult("Bilinen programlama dilleri/teknolojiler eklendi.");
    }
}
