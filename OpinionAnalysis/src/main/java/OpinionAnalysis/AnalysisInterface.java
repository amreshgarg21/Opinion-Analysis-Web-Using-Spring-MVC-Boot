package OpinionAnalysis;

import java.util.Map;

import org.springframework.ui.Model;

public interface AnalysisInterface {

	MessageHolder analyseMessages(MessageHolder holder, Map<String, Integer> map, Model model);
	
}
