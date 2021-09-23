package Com.Connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {

	static Connection con;
	
	public static Connection Create() {
		try {
			//load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Create the connection....
			String url = "jdbc:mysql://Local host:3306/Library";
			String user = "root";
			String password = "root";
			
			con = DriverManager.getConnection(url, user, password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
		
		
	}


	}


