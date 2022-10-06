package kodlamaio.hrsm.business.concretes.jobs;

import kodlamaio.hrsm.business.abstracts.jobs.CityService;
import kodlamaio.hrsm.core.utilities.results.DataResult;
import kodlamaio.hrsm.core.utilities.results.SuccessDataResult;
import kodlamaio.hrsm.dataAccess.abstracts.jobs.CityDao;
import kodlamaio.hrsm.entities.concretes.jobs.City;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityManager implements CityService {

    private CityDao cityDao;
    public CityManager(CityDao cityDao) {
        this.cityDao=cityDao;
    }

    @Override
    public DataResult<List<City>> getAll() {
        return new SuccessDataResult<List<City>>( this.cityDao.findAll(),"Data Listelendi.");
    }

    @Override
    public DataResult<List<City>> getAll(int pageNo, int pageSize) {

        Pageable pageable= PageRequest.of(pageNo,pageSize);

        return new SuccessDataResult<List<City>>(this.cityDao.findAll(pageable).getContent());
    }

    @Override
    public DataResult<City> getByCityName(String cityName) {
        return new SuccessDataResult<City>(this.cityDao.getByCityName(cityName));
    }

    @Override
    public DataResult<City> getByCityNameAndJob_JobId(String cityName, int jobId) {
        return new SuccessDataResult<City> (this.cityDao.getByCityNameAndJob_JobId(cityName,jobId));
    }

    @Override
    public DataResult<List<City>> getByCityNameOrJob_JobId(String cityName, int jobId) {
        return new SuccessDataResult<List<City>>(this.cityDao.getByCityNameOrJob_JobId(cityName,jobId));
    }

    @Override
    public DataResult<List<City>> getByJobIn(List<Integer> jobs) {
        return new SuccessDataResult<List<City>>(this.cityDao.getByJobIn(jobs));
    }

    @Override
    public DataResult<List<City>> getByCityNameContains(String cityName) {
        return new SuccessDataResult<List<City>>(this.cityDao.getByCityNameContains(cityName));
    }

    @Override
    public DataResult<List<City>> getByCityNameStartsWith(String cityName) {
        return new SuccessDataResult<List<City>>(this.cityDao.getByCityNameStartsWith(cityName));
    }
}
