package wewq.readfile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class SaveDataToDb extends JdbcDaoSupport {
		
	String sql="INSERT INTO user VALUES (?,?,?);";
		
	public  Boolean saveData(List<FileObject> fileObjects) {
		for(FileObject fileObject:fileObjects) {
			Object[] objects = {fileObject.getName(),fileObject.getAge(),fileObject.getAddress()				
			};
			this.getJdbcTemplate().update(sql, objects);
		}
		return true;														
	}
}
