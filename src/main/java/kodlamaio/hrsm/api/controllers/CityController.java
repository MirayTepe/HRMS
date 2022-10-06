package kodlamaio.hrsm.api.controllers;

import kodlamaio.hrsm.business.abstracts.jobs.CityService;
import kodlamaio.hrsm.core.utilities.results.DataResult;
import kodlamaio.hrsm.entities.concretes.jobs.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cities")
public class CityController {
    private CityService cityService;
    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }
    @GetMapping("/getall")
    public DataResult<List<City>> getAll(){
        return this.cityService.getAll();
    }

    @GetMapping("/getAllByPage")
    public DataResult<List<City>> getAll(int pageNo, int pageSize){
        return this.cityService.getAll(pageNo-1,pageSize);
    }
}
