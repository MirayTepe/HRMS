package kodlamaio.hrsm.api.controllers;

import kodlamaio.hrsm.business.abstracts.cv.CVService;
import kodlamaio.hrsm.core.utilities.results.DataResult;
import kodlamaio.hrsm.core.utilities.results.ErrorDataResult;


import kodlamaio.hrsm.entities.concretes.cv.CV;
import kodlamaio.hrsm.entities.dtos.CVWithJobExperienceDto;
import kodlamaio.hrsm.entities.dtos.CVWithLanguageDto;
import kodlamaio.hrsm.entities.dtos.CVWithProgrammingLanguageDto;
import kodlamaio.hrsm.entities.dtos.CVWithSchoolDto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/cv")
public class CVController {

    private CVService cvService;



    public CVController(CVService cvService) {
        this.cvService = cvService;
    }


    @GetMapping("/getCvWithJobExperienceDetail")
    public DataResult<List<CVWithJobExperienceDto>> getCvWithJobExperienceDetails() {
        return this.cvService.getCvWithJobExperienceDetails();
    }

    @GetMapping("/getCvWithLanguageDetail")
    public DataResult<List<CVWithLanguageDto>> getCvWithLanguageDetails() {
        return this.cvService.getCvWithLanguageDetails();
    }

    @GetMapping("/getCvProgrammingLanguageDetail")
    public DataResult<List<CVWithProgrammingLanguageDto>> getCvProgrammingLanguageDetails() {
        return this.cvService.getCvProgrammingLanguageDetails();
    }

    @GetMapping("/getCvWithSchoolDetail")
    public DataResult<List<CVWithSchoolDto>> getCvWithSchoolDetails() {
        return this.cvService.getCvWithSchoolDetails();
    }

    @GetMapping("/getPicture")
    public DataResult<String> uploadPicture(MultipartFile multipartFile) throws IOException {
        return this.cvService.uploadPicture(multipartFile);
    }


    @PostMapping("/addPicture")
    public DataResult<String> addPicture(@RequestParam MultipartFile multipartFile) throws IOException {
        return this.cvService.uploadPicture(multipartFile);

    }

    @PostMapping (value = "/addCv2")
    public ResponseEntity<?> add(@Valid @RequestBody CV cv) {

        return ResponseEntity.ok(this.cvService.add(cv));
    }




    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions){
        Map<String,String> validationErrors=new HashMap<String,String>();
        for (FieldError fieldError:exceptions.getBindingResult().getFieldErrors()){
            validationErrors.put(fieldError.getField(),fieldError.getDefaultMessage());
        }
        ErrorDataResult<Object> errors=new ErrorDataResult<Object>(validationErrors,"Doğrulama hataları");
        return  errors;
    }



}
