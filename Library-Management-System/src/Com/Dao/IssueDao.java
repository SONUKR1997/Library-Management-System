package Com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Com.Connect.DBConnect;
import Com.Model.IssueBook;

public class IssueDao {
	public static boolean insertIssueBookToDB(IssueBook  ib) {
		// TODO Auto-generated method stub
		boolean f= false;
		try {
			Connection con=DBConnect.Create();
			String q="insert into issuebook (userid,bookid,issuedate,returndate) values(?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setInt(1, ib.getUserId());
			pstmt.setInt(2, ib.getBookId());
			pstmt.setString(3, ib.getIssuedate());
			pstmt.setString(4, ib.getReturndate());
			
			
			pstmt.executeUpdate();
			f=true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}

