package com.office.employeedetails.employeeDao;

import com.office.employeedetails.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
     void save(Employee employee);
     List findAll();
     Employee findById(int id);
     void deleteById(int id);
   //  Employee updateemployee(Employee employee,Integer id);
}
