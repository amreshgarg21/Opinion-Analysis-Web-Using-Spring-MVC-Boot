package OpinionAnalysis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;

class Dictionary {
	public Dictionary(){
	}

	// public Map<String, Integer> getDictionary(String fileLocation){
	public Map<String, Integer> getDictionary() throws Exception{
		System.out.println("get dictionary in action!");

//		 final String filePath = fileLocation;
		
		//final String filePath = "C:\\Utkarsh.txt";
		final String filePath = "/root/Utkarsh.txt";

		Map<String, Integer> map = new HashMap<String, Integer>();
		BufferedReader br = null;
		// File file = new
		// ClassPathResource("static/Utkarsh.txt").getFile().getAbsoluteFile();

		try {

			// create file object
			 File file = new File(filePath);

			// File file = new
			// ClassPathResource("static/Utkarsh.txt").getFile().getAbsoluteFile();

			String data = "";
			// ClassPathResource resource = new ClassPathResource("static/Utkarsh.txt");
			
			
			/*
			 * try { File file = new
			 * File(getClass().getResource("static/Utkarsh.text").getFile()); 
			 * br = new BufferedReader(new FileReader(file));
			 * System.out.println("11111111111111111111111111111111111111111111111111111");
			 * } catch(Exception e) { System.out.println(
			 * "+-+-+-+-+-+-+-+-+-+-+-+-++-+-+-+-+--+-+-+-+-+-+-+-+-+-+-++-+-+-+-"); }
			 * 
			 */
			
//			File resource = new ClassPathResource("static/Utkarsh.txt").getFile();
//			File f1 = new File(getClass().getResource("/static/Utkarsh.text").getFile());
			
			// create BufferedReader object from the File
		    
			
			br = new BufferedReader(new FileReader(file));
		    
			
//			br = new BufferedReader(new FileReader(f1));

			String line = null;

			// read file line by line
			while ((line = br.readLine()) != null) {

				// split the line by :
				String[] parts = line.split("\\s+");

				System.out.println("................");

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