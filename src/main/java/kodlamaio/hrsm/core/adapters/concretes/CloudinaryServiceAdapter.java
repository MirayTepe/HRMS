package kodlamaio.hrsm.core.adapters.concretes;
import com.cloudinary.*;
import com.cloudinary.utils.ObjectUtils;

import kodlamaio.hrsm.business.abstracts.cv.CloudinaryService;
import kodlamaio.hrsm.core.utilities.results.SuccessDataResult;
import kodlamaio.hrsm.core.utilities.results.DataResult;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;


public class CloudinaryServiceAdapter implements CloudinaryService {
    public DataResult<String> uploadPicture(MultipartFile multipartFile) throws IOException {
        Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dxpt5vwlv",
                "api_key", "788663612729891",
                "api_secret", "jBw4iFZV_qnfWqqj3xSd1AzABbs",
                "secure", true));
        File file = new File("C:\\Users\\tepem\\Downloads\\fotoğraf\\my_image.jpg.jpg");
        Map uploadResult = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());

        System.out.println(uploadResult.get("url"));
        return new SuccessDataResult<>("Başarıyla yüklendi");
    }
    private File convert(MultipartFile multipartFile) throws IOException{
        File file=new File(multipartFile.getOriginalFilename());
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        fileOutputStream.write(multipartFile.getBytes());
        fileOutputStream.close();
        return file;
    }

}
