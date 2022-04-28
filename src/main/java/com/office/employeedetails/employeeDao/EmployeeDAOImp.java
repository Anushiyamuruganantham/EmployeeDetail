package com.office.employeedetails.employeeDao;

import com.office.employeedetails.entity.Employee;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
@Repository
public class EmployeeDAOImp implements EmployeeDAO{
    @Autowired
    private EntityManager entityManager;
    @Override
    public void save(Employee employee) {
        Session currentSession=entityManager.unwrap(Session.class);
        currentSession.save(employee);
    }

    @Override
    public List<Employee> findAll() {
        Session currentSession=entityManager.unwrap(Session.class);
        Query query=currentSession.createQuery("from employeeinfo",Employee.class);
        List<Employee>employees=query.getResultList();
        return employees;
    }

    @Override
    public Employee findById(int id) {
        Session currentSession=entityManager.unwrap(Session.class);
        Employee employee=currentSession.get(Employee.class,id);
        return employee;
    }

    @Override
    public void deleteById(int id) {
        Session currentSession=entityManager.unwrap(Session.class);
        Query query=currentSession.createQuery("delete from employeeinfo where id=:id ");
        query.executeUpdate();

    }

  /*  @Override
    public Employee updateemployee(Employee employee, Integer id) {
        Session currentSession=entityManager.unwrap(Session.class);
        Query query=currentSession.createQuery("update employeeinfo set ")
        return null;
    }*/
}
