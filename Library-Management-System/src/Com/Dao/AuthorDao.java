package Com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Com.Connect.DBConnect;
import Com.Model.Author;

public class AuthorDao {
	public static boolean insertAuthorToDB(Author au) {
		// TODO Auto-generated method stub
		boolean f= false;
		try {
			Connection con=DBConnect.Create();
			String q="insert into author(aname, amobile) values(?,?)";
			PreparedStatement pstmt=con.prepareStatement(q);
	
			pstmt.setString(1,au.getAuthorName());
			pstmt.setString(2,au.getAuthorMobile());
			
			System.out.println(" "+au);
			int i=pstmt.executeUpdate();
			System.out.println("result "+i);
			f=true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;

	}


	public AuthorDao() {
		// TODO Auto-generated constructor stub
	}

}
