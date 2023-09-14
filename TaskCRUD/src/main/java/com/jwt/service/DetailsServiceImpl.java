package com.jwt.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.jwt.dao.DetailsDAO;
import com.jwt.model.Details;
 
@Service
@Transactional
public class DetailsServiceImpl implements DetailsService {
 
    @Autowired
    private DetailsDAO detailsDAO;
 
    @Override
    @Transactional
    public void addDetails(Details details) {
        detailsDAO.addDetails(details);
    }
 
    @Override
    @Transactional
    public List<Details> getAllDetails() {
        return detailsDAO.getAllDetails();
    }
 
    @Override
    @Transactional
    public void deleteDetails(Integer detailsId) {
        detailsDAO.deleteDetails(detailsId);
    }
    
    @Override
    @Transactional
    public Details getDetails(int dempid) {
        return detailsDAO.getDetails(dempid);
    }
 
    public Details updateDetails(Details details) {
        return detailsDAO.updateDetails(details);
    }
 
    public void setDetailsDAO(DetailsDAO detailsDAO) {
        this.detailsDAO = detailsDAO;
    }
 
}