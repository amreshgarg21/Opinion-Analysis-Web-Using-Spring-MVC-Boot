package OpinionAnalysis;

import java.util.Map;

public interface AnalysisInterface {

	MessageHolder analyseMessages(MessageHolder holder, Map<String, Integer> map);
	
}
