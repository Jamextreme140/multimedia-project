package multimd;

public class Disc extends Multimedia {

	private String Genre;
	public Disc(String title, String author, String format, String length, String Genre) {
		super(title, author, format, length);
		this.Genre = Genre;
	}

	public Disc() {
		this("", "", "", "", "");
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	@Override
	public String toString() {
		return super.toString() + " | " + "Disc [Genre=" + Genre + "]";
	}
	
	

}
