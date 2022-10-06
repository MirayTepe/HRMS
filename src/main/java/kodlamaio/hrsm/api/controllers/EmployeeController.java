package kodlamaio.hrsm.api.controllers;

import kodlamaio.hrsm.business.abstracts.users.EmployeeService;
import kodlamaio.hrsm.core.utilities.results.DataResult;
import kodlamaio.hrsm.core.utilities.results.Result;
import kodlamaio.hrsm.entities.concretes.users.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/getall")
    public DataResult<List<Employee>> getAll(){
        return this.employeeService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Employee employee){
       return this.employeeService.add(employee);
    }
    @GetMapping("/getByFirstName")
    DataResult<Employee> getByFirstName(@RequestBody String firstName){
        return this.employeeService.getByFirstName(firstName);
    }

}
