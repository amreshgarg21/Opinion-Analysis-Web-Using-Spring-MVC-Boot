package OpinionAnalysis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

class Dictionary {
	public Dictionary(){
	}


	public Map<String, Integer> getDictionary(String fileLocation) throws Exception{
		
		//System.out.println("get dictionary in action!");

		final String filePath = fileLocation;
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		BufferedReader br = null;

		try {

			// create file object
			 File file = new File(filePath);

			br = new BufferedReader(new FileReader(file));
			String line = null;

			// read file line by line
			while ((line = br.readLine()) != null) {

				// split the line by :
				String[] parts = line.split("\\s+");

				// first part is name, second is number
				String name = parts[0].trim();
				String number1 = parts[1].trim();
				Integer number = Integer.parseInt(number1);

				// put name, number in HashMap if they are not empty
				if (!name.equals("") && !number.equals(""))
					map.put(name, number);
			}
		} 
		
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {

			if (br != null) {
				try {
					br.close();
				} catch (Exception e) {
				}
				;
			}
		}

		return map;

	}

}