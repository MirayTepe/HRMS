package kodlamaio.hrsm.dataAccess.abstracts.jobs;

import kodlamaio.hrsm.entities.concretes.jobs.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CityDao extends JpaRepository<City,Integer > {

    City getByCityName(String cityName);

    City getByCityNameAndJob_JobId(String cityName, int jobId);

    List<City> getByCityNameOrJob_JobId(String cityName, int jobId);

    List<City> getByJobIn(List<Integer> jobs);

    List<City> getByCityNameContains(String cityName);

    List<City> getByCityNameStartsWith(String cityName);

    @Query("From City  where cityName=:cityName and job.jobId=:jobId")
    List<City> getByNameAndJob( String cityName, int jobId);
}
