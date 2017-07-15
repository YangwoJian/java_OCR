package sql.model;

public class PDF {

	private int id;
	private String title;
	private String author;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public PDF() {
		
	}
	
	public PDF(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
}
