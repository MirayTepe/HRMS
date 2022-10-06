package kodlamaio.hrsm.business.concretes.cv;

import kodlamaio.hrsm.business.abstracts.cv.CVService;
import kodlamaio.hrsm.core.adapters.concretes.CloudinaryServiceAdapter;
import kodlamaio.hrsm.core.utilities.results.DataResult;
import kodlamaio.hrsm.core.utilities.results.Result;
import kodlamaio.hrsm.core.utilities.results.SuccessDataResult;
import kodlamaio.hrsm.core.utilities.results.SuccessResult;
import kodlamaio.hrsm.dataAccess.abstracts.cv.*;
import kodlamaio.hrsm.entities.concretes.cv.*;
import kodlamaio.hrsm.entities.dtos.CVWithJobExperienceDto;
import kodlamaio.hrsm.entities.dtos.CVWithLanguageDto;
import kodlamaio.hrsm.entities.dtos.CVWithProgrammingLanguageDto;
import kodlamaio.hrsm.entities.dtos.CVWithSchoolDto;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class CVManager implements CVService {
    private CVDao cvDao;



    public CVManager(CVDao cvDao) {
        this.cvDao = cvDao;


    }


    @Override
    public DataResult<List<CVWithJobExperienceDto>> getCvWithJobExperienceDetails() {
        return new SuccessDataResult<List<CVWithJobExperienceDto>>
                (this.cvDao.getCvWithJobExperienceDetails());
    }

    @Override
    public DataResult<List<CVWithLanguageDto>> getCvWithLanguageDetails() {
        return new SuccessDataResult<List<CVWithLanguageDto>>
                (this.cvDao.getCvWithLanguageDetails());
    }

    @Override
    public DataResult<List<CVWithProgrammingLanguageDto>> getCvProgrammingLanguageDetails() {
        return new SuccessDataResult<List<CVWithProgrammingLanguageDto>>
                (this.cvDao.getCvProgrammingLanguageDetails());
    }

    @Override
    public DataResult<List<CVWithSchoolDto>> getCvWithSchoolDetails() {
        return new SuccessDataResult<List<CVWithSchoolDto>>
                (this.cvDao.getCvWithSchoolDetails());
    }

    @Override
    public Result add(CV cv) {
        this.cvDao.save(cv);
        return new SuccessResult("Cv eklendi");
    }



    @Override
    public DataResult<String> uploadPicture (MultipartFile multipartFile) throws IOException {
            CloudinaryServiceAdapter cloudinaryServiceAdapter = new CloudinaryServiceAdapter();
            return cloudinaryServiceAdapter.uploadPicture(multipartFile);
    }


}

