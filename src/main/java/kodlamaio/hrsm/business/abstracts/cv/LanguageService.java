package kodlamaio.hrsm.business.abstracts.cv;

import kodlamaio.hrsm.core.utilities.results.Result;
import kodlamaio.hrsm.entities.concretes.cv.Language;

public interface LanguageService {
    Result add(Language language);
}
