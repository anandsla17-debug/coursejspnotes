package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
static String url="jdbc:mysql://localhost:3306/coursecrud";
static String username="root";
static String password="admin";

public static Connection dbconnection() {
	
Connection conn=null;
try {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	conn=DriverManager.getConnection(url,username,password);
} catch (SQLException e) {
	
	System.out.println("error:"+e.getMessage());
}
catch (ClassNotFoundException e) {
	
	System.out.println(e.getMessage());
}
return conn;
}


}
