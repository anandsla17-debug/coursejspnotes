package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Course;
import model.DbConnection;

public class UpdateanddeleteService {
String update="update course set courseid=?,coursename=?,coursedays=?,coursetime=?"
		+ ",coursestart=?,courseend=? where studentid=?";

Connection conn=DbConnection.dbconnection();
public String Updatecourselogic(Course course) {
	String result=null;
	try {
		PreparedStatement ps=conn.prepareStatement(update);
		ps.setString(1, course.getCourseid());
		ps.setString(2, course.getCoursename());
		ps.setString(3, course.getCoursedays());
		ps.setString(4, course.getCoursetime());
		ps.setString(5, course.getStartdate());
		ps.setString(6, course.getEnddate());
		ps.setInt(7, course.getStudentid());
		
		int row =ps.executeUpdate();
		if(row==1) {
		result ="update";
		}else {
			result="not update";
		}
		
	} catch (SQLException e) {
		// TODO: handle exception
		result=e.getMessage();
	}
	return result;
}

String delete="delete from course where studentid=?";

public String Deletecourselogic(Course course) {
	String result=null;
	try {
		PreparedStatement ps=conn.prepareStatement(delete);
		ps.setInt(1, course.getStudentid());
		int row =ps.executeUpdate();
		if(row==1) {
			result="delete";
		}else {
			result ="not delete";
		}
		
	} catch (SQLException e) {
		// TODO: handle exception
		result=e.getMessage();
	}
	
	
	return result;
}
}





//insert into course(studentid,courseid,
//		coursename,coursedays,coursetime,coursestart,courseend,phone,price)"
//+ "value(?,?,?,?,?,?,?,?,?)