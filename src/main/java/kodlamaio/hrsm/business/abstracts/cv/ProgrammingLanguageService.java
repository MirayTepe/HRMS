package kodlamaio.hrsm.business.abstracts.cv;

import kodlamaio.hrsm.core.utilities.results.Result;
import kodlamaio.hrsm.entities.concretes.cv.ProgrammingLanguage;

public interface ProgrammingLanguageService {
    Result add(ProgrammingLanguage programmingLanguage);
}
