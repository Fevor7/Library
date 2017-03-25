package by.htp.library.domain;

public abstract class PrintedEdition {

	
	private String title;
	private String autor;
	private int god;

	public PrintedEdition() {
		super();
	}

	public PrintedEdition(String title, String autor, int god) {
		this.title = title;
		this.autor = autor;
		this.god = god;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getGod() {
		return god;
	}

	public void setGod(int god) {
		this.god = god;
	}



}
