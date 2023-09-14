package com.jwt.dao;
 
import java.util.List;
import com.jwt.model.Details;
 
public interface DetailsDAO {
 
    public void addDetails(Details details);
 
    public List<Details> getAllDetails();
 
    public void deleteDetails(Integer detailsId);
 
    public Details updateDetails(Details details);
 
    public Details getDetails(int detailsid);
}