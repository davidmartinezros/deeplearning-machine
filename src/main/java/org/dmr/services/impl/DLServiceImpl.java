package org.dmr.services.impl;

import java.util.Collection;

import org.dmr.learningmachine.Word2VecUptrainingExample;
import org.dmr.services.DLService;
import org.springframework.stereotype.Service;

/**
 * Created by davidmartinezros on 31/08/2017.
 * 
 * email: davidnezan@gmail.com
 * 
 * web: http://davidmartinezros.com
 */
@Service
public class DLServiceImpl implements DLService {

    public DLServiceImpl() {
        
    }
    
    @Override
    public Collection<String> execute(String word, String theme) throws Exception {
    	
    	// Executem la LM amb la paraula word
    	Collection<String> lst = Word2VecUptrainingExample.execute(word, theme);
//    	// Creem la paraula word amb la relacio mes propera
//    	UnityKnowledgeObject unity = new UnityKnowledgeObject();
//    	unity.setConcept(word);
//    	UnityKnowledgeObject unityRel = new UnityKnowledgeObject();
//    	unityRel.setConcept(lst.toArray()[0]);
//    	unity.addUnity(unityRel);
//    	howDYLService.createUnity(unity);
//    	// Retornem la unitat de coneixement creada
//    	return unity;
    	return lst;
    	
    }
    
    @Override
    public Collection<String> train(String word, String theme) throws Exception {
    	// Entrenem la LM amb la paraula word
    	Collection<String> lst = Word2VecUptrainingExample.train(word, theme);
    	
    	return lst;
    
    }	
    	
}
