package kodlamaio.hrsm.business.concretes.cv;

import kodlamaio.hrsm.business.abstracts.cv.SchoolService;
import kodlamaio.hrsm.core.utilities.results.DataResult;
import kodlamaio.hrsm.core.utilities.results.Result;
import kodlamaio.hrsm.core.utilities.results.SuccessDataResult;
import kodlamaio.hrsm.core.utilities.results.SuccessResult;
import kodlamaio.hrsm.dataAccess.abstracts.cv.SchoolDao;
import kodlamaio.hrsm.entities.concretes.cv.School;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class SchoolManager implements SchoolService {

    private SchoolDao schoolDao;

    public SchoolManager(SchoolDao schoolDao) {
        this.schoolDao = schoolDao;
    }

    @Override
    public DataResult<List<School>> getAll() {

        return new SuccessDataResult<List<School>>(this.schoolDao.findAll(),"Data listelendi.");
    }

    @Override
    public DataResult<List<School>> getAllSorted() {
        Sort sort=Sort.by(Sort.Direction.ASC,"finishSchool");
        return new SuccessDataResult<List<School>>
                (this.schoolDao.findAll(sort),"Başarılı");
    }

    @Override
    public DataResult<List<School>> getAll(int pageNo, int pageSize) {
        Pageable pageable= PageRequest.of(pageNo,pageSize);
        return new SuccessDataResult<List<School>>
                (this.schoolDao.findAll(pageable).getContent());
    }

    @Override
    public Result add(School school) {
        if(school.getFinishSchool().isBlank()){
            school.setFinishSchool("Devam Ediyor.");

        }

        this.schoolDao.save(school);
        return new SuccessResult("okul eklendi.");
    }
}