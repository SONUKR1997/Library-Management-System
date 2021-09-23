package Com.Connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	static Connection con;
	
	public static Connection Create() {
		try {
			//load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Create the connection....
			String url = "jdbc:mysql://localhost:3306/librarymanagementsystem";
			String user = "root";
			String password = "root";
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("hi");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
		
		
		
		
	}
public static void main(String[] args) {
Create();
}

	}


