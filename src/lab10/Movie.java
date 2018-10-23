package lab10;

public class Movie {
	
	private String titleName;
	private String genreName;
	
	// constructors
	public Movie() {}

	public Movie(String Genre, String Title) {
		this.titleName = Title;
		this.genreName = Genre;
	}
	
	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	public String getGenreName() {
		return genreName;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}

@Override
	public String toString() {
		return genreName + titleName;
		
	}
	
	}



