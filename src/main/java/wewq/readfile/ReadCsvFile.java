package wewq.readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCsvFile {
	
	//String filename= "a.csv";
	public static List<FileObject> readCsvFile(){
		
		 List<FileObject> fileObjects = new ArrayList<FileObject>();
		
		 BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("a.csv"));
		 
         String line = null; 
         
         while((line = reader.readLine()) != null){ 
        	 
        	 String[] item = line.split(",");
    		 
        		 FileObject fileObject = new FileObject();            	 
                 fileObject.setName(item[0]);
                 fileObject.setAge(item[1]);   
                 fileObject.setAddress(item[2]);      
                 
                 fileObjects.add(fileObject);   
	    }	
	} catch (IOException e) {
		e.printStackTrace();
	}
		return fileObjects;
	}
}

