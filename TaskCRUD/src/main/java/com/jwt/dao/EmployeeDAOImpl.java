package com.jwt.dao;
 
import java.util.List;
 
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Details;
import com.jwt.model.Employee;
 
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
 
    @Autowired
    private SessionFactory sessionFactory1, sessionFactory2;
 
    public void addEmployee(Employee employee) {
    	
//    	Details sid = new Details();
//        sid.setEmployeeId(employee.getId());
//        sid.setAddress("-");
//        sid.setDateofbirth("-");
//        sid.setDateofhire("-");
//        sid.setGender("-");
//        sid.setPhonenumber("-");
//        sid.setSalary(0.0);
//        sessionFactory1.getCurrentSession().save(sid);
        
    
        sessionFactory2.getCurrentSession().saveOrUpdate(employee);

 
    }
 
    @SuppressWarnings("unchecked")
    public List<Employee> getAllEmployees() {
 
        return sessionFactory1.getCurrentSession().createQuery("from Employee")
                .list();
    }
 
    @Override
    public void deleteEmployee(Integer employId) {
        Employee employee = (Employee) sessionFactory1.getCurrentSession().load(
                Employee.class, employId);
        if (null != employee) {
            this.sessionFactory1.getCurrentSession().delete(employee);
        }
 
    }
 
    public Employee getEmployee(int empid) {
        return (Employee) sessionFactory1.getCurrentSession().get(
                Employee.class, empid);
    }
 
    @Override
    public Employee updateEmployee(Employee employee) {
        sessionFactory1.getCurrentSession().update(employee);
        return employee;
    }
 
}