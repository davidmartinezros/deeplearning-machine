package org.dmr.controllers;

import java.util.Collection;

import org.dmr.services.DLService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by davidmartinezros on 31/08/2017.
 * 
 * email: davidnezan@gmail.com
 * 
 * web: http://davidmartinezros.com
 */
@RestController
@RequestMapping("/api")
@CrossOrigin
public class DLController {
	
	@Autowired
    private DLService dlService;
	
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    
    public DLController() {
        
    }
    
    @RequestMapping(value = "/dl/trainLM", method = RequestMethod.GET)
    public Collection<String> trainLM(
    		@RequestParam("theme") String theme,
    		@RequestParam("word") String word) throws Exception {
    	
    	Collection<String> lst = dlService.train(word, theme);
    	
    	return lst;
    	
    }
    
    @RequestMapping(value = "/dl/executeLM", method = RequestMethod.GET)
    public Collection<String> execute(
    		@RequestParam("theme") String theme,
    		@RequestParam("word") String word) throws Exception {
    	
    	Collection<String> lst = dlService.execute(word, theme);
    	
    	return lst;
    	
    }
    
    @RequestMapping(value = "/dl/state", method = RequestMethod.GET)
    public String getState() throws Exception {
    	
    	return "OK";
    	
    }
    
}
