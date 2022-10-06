package kodlamaio.hrsm.api.controllers;
import java.util.List;

import kodlamaio.hrsm.business.abstracts.jobs.JobPositionService;
import kodlamaio.hrsm.core.utilities.results.DataResult;
import kodlamaio.hrsm.core.utilities.results.Result;
import kodlamaio.hrsm.entities.concretes.jobs.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/jobPositions")
public class JobPositionsController {

    private JobPositionService jobPositionService;
    @Autowired
    public JobPositionsController(JobPositionService jobPositionService) {
        super();
        this.jobPositionService = jobPositionService;
    }

    @GetMapping ("/getall")
    public DataResult<List<JobPosition>> getAll(){
    return this.jobPositionService.getAll();
    }
    @PostMapping("/add")
    public Result add (@RequestBody JobPosition jobPosition){
        return this.jobPositionService.add(jobPosition);
    }

   }
