package Com.Dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.connect.CP;
import com.model.Book;

public class BookDao {

	private static final String CP = null;

	public static boolean insertBookToDB(BookDao bk) {
		// TODO Auto-generated method stub
		boolean f=false;
		try {
			Connection con=CP.create();
			String q="insert into book (bname,bcode,bprice) values(?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setString(1,  bk.getBookName());
			pstmt.setString(2, bk.getBookcode());
			pstmt.setString(3, bk.getBookprice());
			
			pstmt.executeUpdate();
			f=true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	private String getBookcode() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getBookprice() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getBookName() {
		// TODO Auto-generated method stub
		return null;
	}

	public static boolean deleteBooktoDB(int bookId) {
		// TODO Auto-generated method stub
		boolean f= false;
		try {
		Connection con=CP.create();
		String q="delete from book where bid=?";
		PreparedStatement pstmt=con.prepareStatement(q);
		try {
			pstmt.setInt(1, bookId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pstmt.executeUpdate();
		f=true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return f;

	}

	public static void showAllBook() {
		// TODO Auto-generated method stub
		boolean f=false;
		try {
			//jdbc code....
			Connection con=CP.create();
			String q="select * from book ";
			Statement stmt=con.createStatement();
			
			ResultSet set=stmt.executeQuery(q);
			while(set.next()) {
				int id =set.getInt(1);
				String name=set.getString(2);
				String code=set.getNString(3);
				String price=set.getNString(4);
				
				System.out.println("Book ID : "+id);
				System.out.println("Book Name : "+name);
				System.out.println("Book Code : "+code);
				System.out.println("Book Price : "+price);
				System.out.println("++++++++++++++++++++++++++++++++");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

	public static boolean updatebook(BookDao v) {
		// TODO Auto-generated method stub
		boolean t= false;
		try {
			//jdbc code....
			Connection con=CP.create();
			String q="update students set bname=? , bcode=? ,bprice=?  where bid=?";
			//preparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values parameters
			pstmt.setString(1, v.getBookName());
			pstmt.setString(2, v.getBookCode());
			pstmt.setString(3, v.getBookPrice());
			
			//execute
			pstmt.executeUpdate();
			t=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return t;
	}

	private String getBookPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updatebook(Com.Controller.Book v) {
		// TODO Auto-generated method stub
		return false;
	}


	}



