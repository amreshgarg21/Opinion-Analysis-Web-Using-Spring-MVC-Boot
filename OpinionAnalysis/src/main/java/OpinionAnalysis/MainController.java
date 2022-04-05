package OpinionAnalysis;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

	@RequestMapping("/")
	public String showForm() {
		return "home";
	}
	
	@RequestMapping(path="/processform", method = RequestMethod.POST)
	public  String handling(@RequestParam("user_Message") String userMessage, Model model) throws Exception {
		MessageHolder holder = new MessageHolder();
		holder.populateMessages(userMessage);
		
		//ClassPathResource cpr = new ClassPathResource("static/Utkarsh.txt");
		//final String UPLOAD_DIR = new ClassPathResource("static//Utkarsh.txt").getFile().getAbsolutePath();
//		final String UPLOAD_DIR = new ClassPathResource("src/main/resources/static/Utkarsh.txt").getFile().getAbsolutePath();
		
		 
		
		
//		final String filePath = UPLOAD_DIR+"Utkarsh.txt";
		Dictionary dictionary = new Dictionary();
//	    Map<String,Integer> map = dictionary.getDictionary(filePath);
		Map<String,Integer> map = dictionary.getDictionary();
	    Analysis analysis = new Analysis();	    	    
	    holder = analysis.analyseMessages(holder,map,model);  
	    
	    return "success";
	}
	
}
