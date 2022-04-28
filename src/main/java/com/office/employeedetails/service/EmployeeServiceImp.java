package com.office.employeedetails.service;

import com.office.employeedetails.employeeDao.EmployeeDAO;
import com.office.employeedetails.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImp implements Service{
    @Autowired
    private EmployeeDAO employeeDAO;
    @Override
    public void save(Employee employee) {
        employeeDAO.save(employee);

    }

    @Override
    public List findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(int id) {
        return employeeDAO.findById(id);
    }

    @Override
    public void deleteById(int id) {
        employeeDAO.deleteById(id);

    }
}
