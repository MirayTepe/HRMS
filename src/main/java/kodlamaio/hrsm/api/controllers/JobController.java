package kodlamaio.hrsm.api.controllers;

import kodlamaio.hrsm.business.abstracts.jobs.JobService;
import kodlamaio.hrsm.core.utilities.results.DataResult;
import kodlamaio.hrsm.entities.concretes.jobs.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {
    private JobService jobService;
    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }
    @GetMapping("/getByMaxSalaryAndMinSalary")
    public DataResult<List<Job>> getByMaxSalaryAndMinSalary(@RequestParam("maxSalary") double maxSalary, @RequestParam("minSalary") double minSalary){
        return this.jobService.getByMaxSalaryAndMinSalary(maxSalary,minSalary);
    }
    @GetMapping("/getByJobIdAndApplicationDeadline")
    public DataResult<List<Job>> getByJobIdAndApplicationDeadline(@RequestParam("jobId") int jobId,@RequestParam("applicationDeadline") Date applicationDeadline) {
        return this.jobService.getByJobIdAndApplicationDeadline(jobId,applicationDeadline);
    }

    @GetMapping("/getByJobIdAndJobDescriptions")
    public DataResult<List<Job>> getByJobIdAndJobDescriptions(@RequestParam("jobId") String jobId, @RequestParam("jobDescription") String jobDescriptions) {
        return this.jobService.getByJobIdAndJobDescriptions(jobId,jobDescriptions);
    }
    @GetMapping("/getByJobIdAndStatus")
    public DataResult<List<Job>> getByJobIdAndStatus(String jobId, boolean status) {
        return this.jobService.getByJobIdAndStatus(jobId,status);
    }
    @GetMapping("/getByJobIdAndOpenPositionLimit")
    public DataResult<List<Job>> getByJobIdAndOpenPositionLimit(String jobId, int openPositionLimit) {
        return  this.jobService.getByJobIdAndOpenPositionLimit(jobId,openPositionLimit);
    }

    @GetMapping("/getAllDesc")
    public DataResult<List<Job>> getAllSorted() {
        return this.jobService.getAllSorted();
    }
}
