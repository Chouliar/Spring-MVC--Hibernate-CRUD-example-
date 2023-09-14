package com.jwt.dao;
 
import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
 
import com.jwt.model.Details;
 
@Repository
public class DetailsDAOImpl implements DetailsDAO {
 
    @Autowired
    private SessionFactory sessionFactory;
    
   
    
 
    public void addDetails(Details details) {
        sessionFactory.getCurrentSession().saveOrUpdate(details);
 
    }
 
    @SuppressWarnings("unchecked")
    public List<Details> getAllDetails() {
 
        return sessionFactory.getCurrentSession().createQuery("from Details")
                .list();
    }
 
    @Override
    public void deleteDetails(Integer detailsId) {
        Details details = (Details) sessionFactory.getCurrentSession().load(
                Details.class, detailsId);
        if (null != details) {
        	Details sid = new Details();
            int idtmp =sid.getEmployeeId();
            sid.setAddress("-");
            sid.setDateofbirth("-");
            sid.setDateofhire("-");
            sid.setGender("-");
            sid.setPhonenumber("-");
            sid.setSalary(0.0);
            sid.setEmployeeId(idtmp);
            
            sessionFactory.getCurrentSession().save(sid);
        }
 
    }
    @Override
    public Details getDetails(int dempid) {
    	System.out.println(dempid);
    	return (Details) sessionFactory.getCurrentSession().get(
                Details.class, dempid);
    }
 
    @Override
    public Details updateDetails(Details details) {
        sessionFactory.getCurrentSession().update(details);
        return details;
    }
 
}