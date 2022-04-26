package multimd;

public class Movie extends Multimedia {

	private String MA;
	private String MAs;
	
	public Movie(String title, String author, String format, String length, 
			String MA, String MAs) {
		super(title, author, format, length);
		this.MA = MA;
		this.MAs = MAs;
	}

	public Movie() {
		this("", "", "", "", "", "");
	}

	public String getMA() {
		return MA;
	}

	public void setMA(String mA) {
		MA = mA;
	}

	public String getMAs() {
		return MAs;
	}

	public void setMAs(String mAs) {
		MAs = mAs;
	}

	@Override
	public String toString() {
		return super.toString() + " | " + "Movie [MA=" + MA + ", MAs=" + MAs + "]";
	}
	
	

}
