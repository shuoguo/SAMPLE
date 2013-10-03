package com.homework;
import java.io.*;

/*This class contains the method to read the word database
 * into the dictionary that will be searched.  Since each 
 * word is on its own line, this method is pretty basic. 
 */

public class Dictionary {
	public String[] wordDB;
	public int lineCount;
	
	public String[] ReadDictionary(String fileName){		
		
		File file = new File(fileName);
		
		try{
			FileReader file_reader = new FileReader(file);
			BufferedReader buf_reader = new BufferedReader (file_reader);
			
			//Read the first line to get the number of words
			String line = buf_reader.readLine(); 
			int lineCount = Integer.parseInt(line);	
			wordDB = new String[lineCount];
			int i = 0;			
			while ( i < lineCount){
				line = buf_reader.readLine();
				wordDB[i] = line;
				i++;
				}				
			buf_reader.close();
		}
		catch(IOException e) {
			System.out.println("IOException = "+ e);
		}
		lineCount = wordDB.length;
		
	return wordDB;
	}//ReadDictionary

}//Class ImportDictionary
