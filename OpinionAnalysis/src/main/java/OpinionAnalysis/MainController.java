package OpinionAnalysis;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


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
		Dictionary dictionary = new Dictionary();
	
		Map<String,Integer> map = dictionary.getDictionary("C:\\AFFIN-111.txt");
//		Map<String,Integer> map = dictionary.getDictionary("/root/AFFIN-111.txt");
		
	    Analysis analysis = new Analysis();	    	    
	    holder = analysis.analyseMessages(holder,map,model);  	    
	    return "success";
	    
	}
	
}
