package kodlamaio.hrsm.business.abstracts.cv;

import kodlamaio.hrsm.core.utilities.results.DataResult;
import kodlamaio.hrsm.core.utilities.results.Result;
import kodlamaio.hrsm.entities.concretes.cv.School;

import java.util.List;

public interface SchoolService {
    DataResult<List<School>> getAll();

    DataResult<List<School>>  getAllSorted();

    DataResult<List<School>>  getAll(int pageNo ,int pageSize);
    Result add(School school);

}
