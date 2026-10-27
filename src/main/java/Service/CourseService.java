package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;

import model.Course;
import model.DbConnection;

public class CourseService {

	String courseinsertquery="insert into course(studentid,courseid,coursename,coursedays,coursetime,coursestart,courseend,phone,price)"
			+ "value(?,?,?,?,?,?,?,?,?)";
	Connection conn=DbConnection.dbconnection();
	
	public String courseinsertlogic(Course course) {
		String result=null;
		try {
			PreparedStatement ps=conn.prepareStatement(courseinsertquery);
			ps.setInt(1, course.getStudentid());
			ps.setString(2, course.getCourseid());
			ps.setString(3,course.getCoursename());
			ps.setString(4, course.getCoursedays());
			ps.setString(5, course.getCoursetime());
			ps.setString(6, course.getStartdate());
			ps.setString(7, course.getEnddate());
			ps.setLong(8, course.getPhone());
			ps.setDouble(9, course.getPrice());
		int row	=ps.executeUpdate();
		if(row==1) {
			result= "course add successfully";
		}else {
			result= "course not add";
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			result ="error:"+e.getMessage();
		}
		return result;
	}
	
	String displayall="select * from course";
	
	public ArrayList<Course> displayalllogic() {
		ArrayList<Course> transfer=new ArrayList<>();
		try {
			Statement st=conn.createStatement();
		ResultSet rs	=st.executeQuery(displayall);
		while(rs.next()) {
			Course set= new Course();
			set.setStudentid(rs.getInt("studentid"));
			set.setCourseid(rs.getString("courseid"));
			set.setCoursename(rs.getString("coursename"));
			set.setCoursedays(rs.getString("coursedays"));
			set.setCoursetime(rs.getString("coursetime"));
			set.setStartdate(rs.getString("coursestart"));
			set.setEnddate(rs.getString("courseend"));
			set.setPhone(rs.getLong("phone"));
			set.setPrice(rs.getDouble("price"));
			transfer.add(set);
			
		}
		} catch (SQLException e) {
			// TODO: handle exception
		System.out.println(e.getMessage());
		}
		return transfer;
	}
	
}

