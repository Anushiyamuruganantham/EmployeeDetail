package com.office.employeedetails.employeeController;

import com.office.employeedetails.employeeDto.EmployeeDTO;
import com.office.employeedetails.entity.Employee;
import com.office.employeedetails.service.EmployeeServiceImp;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeServiceImp employeeServiceImp;
    @Autowired
    private ModelMapper modelMapper;
    @PostMapping("/employee")
    public void save(@RequestBody EmployeeDTO employeeDTO){
        Employee employee=modelMapper.map(employeeDTO,Employee.class);
        employeeServiceImp.save(employee);
    }
   private EmployeeDTO convertEntitytoDto(Employee employee){
        EmployeeDTO employeeDTO=modelMapper.map(employee,EmployeeDTO.class);
        return employeeDTO;
   }
@GetMapping("/employee/{id}")
    public EmployeeDTO getempbyid(@PathVariable("id")int id){
        Employee employee=employeeServiceImp.findById(id);
        return modelMapper.map(employee,EmployeeDTO.class);
}
@GetMapping("/employee")
    public List<EmployeeDTO>getemp(){
        List<Employee>employees=employeeServiceImp.findAll();
        return employees.stream().map(this::convertEntitytoDto).collect(Collectors.toList());
}
 @DeleteMapping("/employee/{id}")
     public void delete(@PathVariable("id") int id){
         employeeServiceImp.deleteById(id);
     }


 }

