package com.office.employeedetails.service;

import com.office.employeedetails.entity.Employee;

import java.util.List;

public interface Service {
    void save(Employee employee);
    List findAll();
    Employee findById(int id);
    void deleteById(int id);

}
