package Com.Model;

public class Author { 

	public int authorId;
	public String authorName;
	public String authorMobile;
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorMobile() {
		return authorMobile;
	}
	public void setAuthorMobile(String authorMobile) {
		this.authorMobile = authorMobile;
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + ", authorMobile=" + authorMobile + "]";
	}
	
}