package wewq.readfile;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	
	private static ApplicationContext ctx;
	  
	public static void main(String args[]) {
		
		 ctx = new ClassPathXmlApplicationContext("classpath:spring.xml");
		 SaveDataToDb saveDataToDb = ctx.getBean(SaveDataToDb.class);
		  
		List<FileObject> fileObjects = ReadCsvFile.readCsvFile();
		saveDataToDb.saveData(fileObjects);
	}

}
