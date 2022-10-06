package kodlamaio.hrsm.business.abstracts.jobs;

import kodlamaio.hrsm.core.utilities.results.DataResult;
import kodlamaio.hrsm.entities.concretes.jobs.City;

import java.util.List;

public interface CityService {
    DataResult<List<City>> getAll();
    DataResult<List<City>> getAll(int pageNo,int pageSize);
    DataResult<City> getByCityName(String cityName);;

    DataResult<City>getByCityNameAndJob_JobId(String cityName, int jobId);

    DataResult<List<City>> getByCityNameOrJob_JobId(String cityName, int jobId);

    DataResult<List<City>> getByJobIn(List<Integer> jobs);

    DataResult<List<City>> getByCityNameContains(String cityName);

    DataResult<List<City>> getByCityNameStartsWith(String cityName);
}
