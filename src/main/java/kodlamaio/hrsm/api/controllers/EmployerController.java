package kodlamaio.hrsm.api.controllers;

import kodlamaio.hrsm.business.abstracts.users.EmployerService;
import kodlamaio.hrsm.core.utilities.results.DataResult;
import kodlamaio.hrsm.core.utilities.results.Result;
import kodlamaio.hrsm.entities.concretes.users.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employers")
public class EmployerController {
    private EmployerService employerService;
    @Autowired
    public EmployerController(EmployerService employerService) {
        this.employerService = employerService;

    }
    @GetMapping ("/getall")
    public DataResult<List<Employer>> getAll(){
        return this.employerService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Employer employer){
        return this.employerService.add(employer);
    }
    @GetMapping("/getByCompanyName")
    DataResult<Employer> getByCompanyName(String companyName){
        return this.employerService.getByCompanyName(companyName);
    }
    @GetMapping("/getByCompanyNameAndJobPosition_PositionId")
    DataResult<Employer> getByCompanyNameAndJobPosition_PositionId(@RequestParam("companyName") String companyName,@RequestParam("positionId") int positionId){
        System.out.println(companyName);
        System.out.println(positionId);
        return this.employerService.getByCompanyNameAndJobPosition_PositionId(companyName,positionId);
    }
    @GetMapping("/getByCompanyNameContains")
    DataResult<List<Employer>> getByCompanyNameContains(String companyName){
        return this.employerService.getByCompanyNameContains(companyName);

    }
    @GetMapping("/ getByJobPositionIn")
    DataResult<List<Employer>> getByJobPositionIn(List<Integer> job_positions){
        return this.employerService.getByJobPositionIn(job_positions);
    }


}
