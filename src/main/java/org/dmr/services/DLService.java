package org.dmr.services;

import java.util.Collection;

/**
 * Created by davidmartinezros on 31/08/2017.
 * 
 * email: davidnezan@gmail.com
 * 
 * web: http://davidmartinezros.com
 */
public interface DLService {
	
	public Collection<String> execute(String word, String theme) throws Exception;
	
	public Collection<String> train(String word, String theme) throws Exception;
    
}
