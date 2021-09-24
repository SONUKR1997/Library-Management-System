package Com.Model;

public class IssueBook {
	
		public int UserId;
		public int bookId;
		public String issuedate;
		public String returndate;
		public int fine;
		public int getUserId() {
			return UserId;
		}
		public void setUserId(int userId) {
			UserId = userId;
		}
		public int getBookId() {
			return bookId;
		}
		public void setBookId(int bookId) {
			this.bookId = bookId;
		}
		public String getIssuedate() {
			return issuedate;
		}
		public void setIssuedate(String issuedate) {
			this.issuedate = issuedate;
		}
		public String getReturndate() {
			return returndate;
		}
		public void setReturndate(String returndate) {
			this.returndate = returndate;
		}
		public int getFine() {
			return fine;
		}
		public void setFine(int fine) {
			this.fine = fine;
		}
		public IssueBook(int userid, int bookid) {
			super();
			this.UserId = userid;
			this.bookId = bookid;
		
		}
		public IssueBook(int userid, int bookid, String issuedate, String returndate) {
			super();
			this.UserId = userid;
			this.bookId = bookid;
			this.issuedate = issuedate;
			this.returndate = returndate;
		}
		@Override
		public String toString() {
			return "IssueBook [userid=" + UserId + ", bookid=" + bookId + ", issuedate=" + issuedate + ", returndate="
					+ returndate + ", fine=" + fine + "]";
		}
		
			

	}
		


