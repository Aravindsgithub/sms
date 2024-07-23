package dbconnections;

import java.sql.Connection;
import java.sql.DriverManager;

public class studentdb {

	private static final String Driver="com.mysql.cj.jdbc.Driver";
	private static final String Url = "jdbc:mysql://localhost:3306/stu";
	private static final String Username = "root";
	private static final String password = "akshaya@123";
	private static Connection conn;
	
	public static Connection getconnection() {
		
		try {
			Class.forName(Driver);
			conn = DriverManager.getConnection(Url, Username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	
}
