package com.codekul.java28SeptSpring.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("saveEmployee")
    public String saveEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return "Employee Saved";
    }

    @GetMapping("getEmployee")
    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }

    @PutMapping("updateEmployee")
    public String getEmployee(@RequestBody Employee employee) {
        Employee employee1 = employeeRepository.getById(employee.getId());
        employee1.setName(employee.getName());
        employee1.setAddress(employee1.getAddress());
        employeeRepository.save(employee);

        return "records get";
    }

    //    @DeleteMapping("deletemp/{id}")
//    public String deletemp(@PathVariable(value="id")Integer id){
//        employeeRepository.deleteById(id);
//        return "records deleated";
//    }
//    @DeleteMapping("deletemp/{id}")
//    public String deletemp(@PathVariable(value = "id") Integer id) {
//        Employee employee = employeeRepository.getById(id);
//        employeeRepository.delete(employee);
//        return "records deleated";
//    }



    @GetMapping("getEmployeeOpt/{id}")
    public Optional<Employee> getEmployeeByIdOpt(@PathVariable(value = "id")Integer id){
        return employeeRepository.findById(id);
    }

    @GetMapping("getEmployeeByIdAndName")
    public Employee getEmployeeByIdAndName(@RequestParam("id")Integer id,
                                           @RequestParam("name")String name){
        return  employeeRepository.findByIdAndName(id,name);
    }

    @GetMapping("getEmployeeByIdOrName")
    public List<Employee> getEmployeeByIdorName(@RequestParam("id")Integer id,
                                           @RequestParam("name")String name){
        return  employeeRepository.findByIdOrName(id,name);
    }

    @GetMapping("findByNameStartingWith")
    public List<Employee> findByNameStartingWith(@RequestParam("name")String name){
        return  employeeRepository.findByNameStartingWith(name);
    }
    @GetMapping("findByNameEndingWith")
    public List<Employee> findByNameEndingWith(@RequestParam("name")String name){
        return  employeeRepository.findByNameEndingWith(name);
    }

}
