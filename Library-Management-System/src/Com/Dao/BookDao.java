package Com.Dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Com.Connect.DBConnect;
import Com.Model.Book;
import Com.Model.IssueBook;

public class BookDao {

	public static boolean insertBookToDB(Book bk) {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = DBConnect.Create();
			String q = "insert into book (bname,bcode,bprice) values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, bk.getBookName());
			pstmt.setString(2, bk.getBookCode());
			pstmt.setString(3, bk.getBookPrice());

			pstmt.executeUpdate();
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteBooktoDB(int bookId) {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = DBConnect.Create();
			String q = "delete from book where bid=?";
			PreparedStatement pstmt = con.prepareStatement(q);
			try {
				pstmt.setInt(1, bookId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			pstmt.executeUpdate();
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;

	}

	public static void showAllBook() {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			// jdbc code....
			Connection con = DBConnect.Create();
			String q = "select * from book ";
			Statement stmt = con.createStatement();

			ResultSet set = stmt.executeQuery(q);
			while (set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String code = set.getString(3);
				String price = set.getString(4);

				System.out.println("Book ID : " + id);
				System.out.println("Book Name : " + name);
				System.out.println("Book Code : " + code);
				System.out.println("Book Price : " + price);
				System.out.println("++++++++++++++++++++++++++++++++");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static boolean updatebook(Book v) {
		// TODO Auto-generated method stub
		boolean t = false;
		try {
			// jdbc code....
			Connection con = DBConnect.Create();
			String q = "update students set bname=? , bcode=? ,bprice=?  where bid=?";
			// preparedStatement
			PreparedStatement pstmt = con.prepareStatement(q);
			// set the values parameters
			pstmt.setString(1, v.getBookName());
			pstmt.setString(2, v.getBookCode());
			pstmt.setString(3, v.getBookPrice());

			// execute
			pstmt.executeUpdate();
			t = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return t;
	}

//		public static boolean issuebook(IssueBook is)
//		{
//			boolean s= false;
//	  	}

	public static boolean insertIssueBookToDB(IssueBook ib) {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = DBConnect.Create();
			String q = "insert into issuebook (userid,bookid,issuedate,returndate) values(?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setInt(1, ib.getUserId());
			pstmt.setInt(2, ib.getBookId());
			pstmt.setString(3, ib.getIssuedate());
			pstmt.setString(4, ib.getReturndate());

			pstmt.executeUpdate();
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

}