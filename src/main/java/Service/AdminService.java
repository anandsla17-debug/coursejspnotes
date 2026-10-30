package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Admin;
import model.DbConnection;

public class AdminService {
	
	String insert="insert into admin(adminid,adminname,adminpassword,adminrole) value(?,?,?,?)";
	
	Connection conn=DbConnection.dbconnection();
	public String Registerlogic(Admin admin) {
		String result=null;
		try {
			PreparedStatement ps=conn.prepareStatement(insert);
			ps.setString(1, admin.getId());
			ps.setString(2, admin.getName());
			ps.setString(3, admin.getPassword());
			ps.setString(4, admin.getRole());
			
			int row= ps.executeUpdate();
			if(row==1) {
				result="register successfully";
			}
		} catch (SQLException e) {
			// TODO: handle exception
			result=e.getMessage();
		}
		return result;
	}
	
	String login="select * from admin where adminid=? and adminpassword=?";
	
	public String Loginlogic(Admin admin) {
		String result=null;
		try {
			PreparedStatement ps=conn.prepareStatement(login);
			ps.setString(1, admin.getId());
			ps.setString(2,admin.getPassword());
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				result=rs.getString("adminid")+rs.getString("adminpassword");
				System.out.println(result);
				
			}
			else {
				result="login failed";
			}
		} catch(SQLException e) {
			result=e.getMessage();
		}
		
return result;		
	}

}
