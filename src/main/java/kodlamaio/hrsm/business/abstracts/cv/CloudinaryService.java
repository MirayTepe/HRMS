package kodlamaio.hrsm.business.abstracts.cv;

import kodlamaio.hrsm.core.utilities.results.DataResult;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface CloudinaryService {
    public DataResult<String> uploadPicture(MultipartFile multipartFile) throws IOException;
}
