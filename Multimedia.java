package multimd;

public class Multimedia {
	
	private String Title;
	private String Author;
	private String Format;
	private String Length;
	
	public Multimedia(String title, String author, String format, String length) {
		Title = title;
		Author = author;
		Format = format;
		Length = length;
	}
	
	public Multimedia() {
		this("", "", "", "");
	}
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getFormat() {
		return Format;
	}
	public void setFormat(String format) {
		Format = format;
	}
	public String getLength() {
		return Length;
	}
	public void setLength(String length) {
		Length = length;
	}

	@Override
	public String toString() {
		return "Multimedia [Title=" + Title + ", Author=" + Author + ", Format=" + Format + ", Length=" + Length + "]";
	}
	
	public void getInfo() {
		System.out.println("Title: " + Title);
		System.out.println("Author: " + Author);
		System.out.println("Format: " + Format);
		System.out.println("Length: " + Length);
	}
	
	public boolean equals() {
		if(Title.equals(Author)) return true;
		else return false;
	}

}
