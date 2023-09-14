package com.jwt.service;
 
import java.util.List;
 
import com.jwt.model.Details;
 
public interface DetailsService {
     
    public void addDetails(Details details);
 
    public List<Details> getAllDetails();
 
    public void deleteDetails(Integer detailsId);
 
    public Details getDetails(int detailsid);
 
    public Details updateDetails(Details details);
}