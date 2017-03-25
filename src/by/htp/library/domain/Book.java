package by.htp.library.domain;

public class Book extends PrintedEdition {

	//private String title;
	//private String autor;
	//private int god; 
	
	/*public Book(double price, String title){
		this.setPrice(price);
		this.setTitle(title);
	}*/
	public Book(){
		//super(price, title);

	}
	public Book(String title, String autor, int god){
		super(title, autor,god);
	}

	

	public String printFormat() {
		return "A5";
	}

}
