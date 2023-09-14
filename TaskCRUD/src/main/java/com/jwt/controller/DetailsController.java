package com.jwt.controller;
 
import java.io.IOException;
import java.util.List;
 
import javax.servlet.http.HttpServletRequest;
 
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.jwt.model.Details;
import com.jwt.service.DetailsService;
 
@Controller
public class DetailsController {
 
    private static final Logger logger = Logger
            .getLogger(DetailsController.class);
 
    public DetailsController() {
        System.out.println("DetailsController()");
    }
 
    @Autowired
    private DetailsService detailsService;
 
    @RequestMapping(value = "/alldetails")
    public ModelAndView listDetails(ModelAndView model) throws IOException {
        List<Details> listDetails = detailsService.getAllDetails();
        model.addObject("listDetails", listDetails);
        model.setViewName("DetailsForm");
        return model;
    }
 
    @RequestMapping(value = "/addInfo", method = RequestMethod.GET)
    public ModelAndView newContact(HttpServletRequest request) {
    	int detailsId = Integer.parseInt(request.getParameter("employeeId"));
        System.out.println("AddInfo ID: " + detailsId);
    	Details details = new Details();
    	details.setEmployeeId(detailsId);
    	ModelAndView model = new ModelAndView("EditDetailsForm");
        model.addObject("details", details);
        return model;
    }
 
    @RequestMapping(value = "/saveDetails", method = RequestMethod.POST)
    public ModelAndView saveDetails(@ModelAttribute Details details) {
        	int idn =details.getEmployeeId();
        	
        	System.out.println("EmployeeID:" + idn);
        	if (idn == 0) { // if employee id is 0 then creating the
                 // employee other updating the employee
                detailsService.addDetails(details);
            } 
        	else {
        		
        		detailsService.updateDetails(details);
            }
        return new ModelAndView("redirect:/");
    }
 
    @RequestMapping(value = "/deleteInfo", method = RequestMethod.GET)
    public ModelAndView deleteDetails(HttpServletRequest request) {
        int detailsId = Integer.parseInt(request.getParameter("employeeId"));
       detailsService.deleteDetails(detailsId);
        return new ModelAndView("redirect:/");
    }
 
    @RequestMapping(value = "/detailsEmployee", method = RequestMethod.GET)
    public ModelAndView editContact(HttpServletRequest request) {
        int detailsId = Integer.parseInt(request.getParameter("employeeId"));
        System.out.println("Passed from Home:" + detailsId);
        
        Details details = detailsService.getDetails(detailsId);
        //details.setEmployeeId(detailsId);
        ModelAndView model2 = new ModelAndView("DetailsForm");
        model2.addObject("details", details);
        return model2;
    }
    
    @RequestMapping(value = "/editInfo", method = RequestMethod.GET)
    public ModelAndView editInfo(HttpServletRequest request) {
        int detailsId = Integer.parseInt(request.getParameter("employeeId"));
        System.out.println(detailsId);
        Details details = detailsService.getDetails(detailsId);
        ModelAndView model = new ModelAndView("EditDetailsForm");
        model.addObject("details", details);
        return model;
    }
 
}